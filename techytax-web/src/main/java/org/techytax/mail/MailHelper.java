/**
 * Copyright 2011 Hans Beemsterboer
 * 
 * This file is part of the TechyTax program.
 *
 * TechyTax is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * TechyTax is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TechyTax; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.techytax.mail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

import org.techytax.domain.User;
import org.techytax.report.helper.Invoice;

public class MailHelper {

	private static Properties props;

	public static void loadProperties() throws Exception {
		if (props != null)
			return;

		props = new Properties();
		try {
			File file = new File("test");
			System.out.println("Test: " + file.getAbsolutePath());
			props.load(new FileInputStream("mail.properties"));
			props.put("mail.transport.protocol", "smtps");
			props.put("mail.smtps.starttls.enable", "true");
			props.put("mail.smtps.auth", "true");
			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.socketFactory.fallback", "false");

		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	private static void sendMail(String subject, String message, String to) throws Exception {
		loadProperties();
		Session session = Session.getDefaultInstance(props);
		// session.setDebug(true);
		Message msg = new MimeMessage(session);
		InternetAddress[] toAddrs = null;

		if (to != null) {
			toAddrs = InternetAddress.parse(to, false);
			msg.setRecipients(Message.RecipientType.TO, toAddrs);
		} else
			throw new MessagingException("No \"To\" address specified");

		if (subject != null)
			msg.setSubject(subject);

		msg.setFrom(new InternetAddress(props.getProperty("mail.from")));
		msg.setReplyTo(toAddrs);
		
		MimeMultipart multipart = new MimeMultipart("related");
		BodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setContent(message, "text/html");
		multipart.addBodyPart(messageBodyPart);
		msg.setContent(multipart);
		Transport tr = session.getTransport("smtp");
		tr.connect(props.getProperty("mail.smtp.host"), 465, props.getProperty("mail.smtp.user"), props.getProperty("mail.smtp.password"));
		msg.saveChanges();
		tr.sendMessage(msg, msg.getAllRecipients());
		tr.close();
	}

	public static void sendDutchVatDeclaration(String message, String to) throws Exception {
		sendMail("OB aangifte", message, to);
	}

	public static void sendInvoice(Invoice factuur, byte[] invoiceBuf, User user) throws Exception {
		loadProperties();
		String to = factuur.getEmail();
		String bcc = factuur.getEmailBcc();
		String cc = factuur.getEmailCc();
		String subj = "Factuur " + factuur.getInvoiceNumber();
		Session session = Session.getDefaultInstance(props);
		session.setDebug(true);
		Message msg = new MimeMessage(session);
		InternetAddress[] toAddrs = null, ccAddrs = null, bccAddrs = null;

		if (to != null) {
			toAddrs = InternetAddress.parse(to, false);
			msg.setRecipients(Message.RecipientType.TO, toAddrs);
		} else
			throw new MessagingException("No \"To\" address specified");

		if (cc != null) {
			ccAddrs = InternetAddress.parse(cc, false);
			msg.setRecipients(Message.RecipientType.CC, ccAddrs);
		} 

		if (bcc != null) {
			bccAddrs = InternetAddress.parse(bcc, false);
			msg.setRecipients(Message.RecipientType.BCC, bccAddrs);
		} else {
			bccAddrs = InternetAddress.parse(user.getEmail(), false);
			msg.setRecipients(Message.RecipientType.BCC, bccAddrs);
		}

		if (subj != null)
			msg.setSubject(subj);

		msg.setFrom(new InternetAddress(user.getCompanyName() + " <" + user.getEmail() + ">"));

		MimeMultipart multipart = new MimeMultipart("related");

		BodyPart messageBodyPart = new MimeBodyPart();
		String htmlText = "Zie bijlage.";
		messageBodyPart.setContent(htmlText, "text/html");
		multipart.addBodyPart(messageBodyPart);

		messageBodyPart = new MimeBodyPart();
		DataSource fds = new ByteArrayDataSource(invoiceBuf, "application/pdf");
		messageBodyPart.setDataHandler(new DataHandler(fds));
		messageBodyPart.setHeader("Content-ID", "<application/pdf>");
		messageBodyPart.setFileName("factuur.pdf");
		multipart.addBodyPart(messageBodyPart);

		msg.setContent(multipart);
		Transport tr = session.getTransport("smtp");
		tr.connect(props.getProperty("mail.smtp.host"), 465, props.getProperty("mail.smtp.user"), props.getProperty("mail.smtp.password"));
		msg.saveChanges();
		tr.sendMessage(msg, msg.getAllRecipients());
		tr.close();
	}

}
