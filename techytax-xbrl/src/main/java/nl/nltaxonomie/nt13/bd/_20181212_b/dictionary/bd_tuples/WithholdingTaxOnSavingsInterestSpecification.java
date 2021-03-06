//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_codes.IsoCountryCodeESRRItemType;
import nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension}placeholder">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}WithholdingTaxOnSavingsInterestAmount"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}WithholdingTaxOnSavingsInterestBankAccountNumber"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}WithholdingTaxOnSavingsInterestCountryCode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "withholdingTaxOnSavingsInterestAmount",
    "withholdingTaxOnSavingsInterestBankAccountNumber",
    "withholdingTaxOnSavingsInterestCountryCode"
})
public class WithholdingTaxOnSavingsInterestSpecification
    extends Placeholder
{

    @XmlElement(name = "WithholdingTaxOnSavingsInterestAmount", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data", required = true)
    protected NonNegativeMonetaryNoDecimalsItemType withholdingTaxOnSavingsInterestAmount;
    @XmlElement(name = "WithholdingTaxOnSavingsInterestBankAccountNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data", required = true)
    protected Anstring34VItemType withholdingTaxOnSavingsInterestBankAccountNumber;
    @XmlElement(name = "WithholdingTaxOnSavingsInterestCountryCode", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data", required = true)
    protected IsoCountryCodeESRRItemType withholdingTaxOnSavingsInterestCountryCode;

    /**
     * Gets the value of the withholdingTaxOnSavingsInterestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getWithholdingTaxOnSavingsInterestAmount() {
        return withholdingTaxOnSavingsInterestAmount;
    }

    /**
     * Sets the value of the withholdingTaxOnSavingsInterestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setWithholdingTaxOnSavingsInterestAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.withholdingTaxOnSavingsInterestAmount = value;
    }

    /**
     * Gets the value of the withholdingTaxOnSavingsInterestBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getWithholdingTaxOnSavingsInterestBankAccountNumber() {
        return withholdingTaxOnSavingsInterestBankAccountNumber;
    }

    /**
     * Sets the value of the withholdingTaxOnSavingsInterestBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setWithholdingTaxOnSavingsInterestBankAccountNumber(Anstring34VItemType value) {
        this.withholdingTaxOnSavingsInterestBankAccountNumber = value;
    }

    /**
     * Gets the value of the withholdingTaxOnSavingsInterestCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodeESRRItemType }
     *     
     */
    public IsoCountryCodeESRRItemType getWithholdingTaxOnSavingsInterestCountryCode() {
        return withholdingTaxOnSavingsInterestCountryCode;
    }

    /**
     * Sets the value of the withholdingTaxOnSavingsInterestCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodeESRRItemType }
     *     
     */
    public void setWithholdingTaxOnSavingsInterestCountryCode(IsoCountryCodeESRRItemType value) {
        this.withholdingTaxOnSavingsInterestCountryCode = value;
    }

}
