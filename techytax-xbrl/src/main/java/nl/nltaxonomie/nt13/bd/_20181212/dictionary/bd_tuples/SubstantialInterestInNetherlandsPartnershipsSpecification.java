//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Anstring200VItemType;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.NonNegativeInteger10VItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.nl_types.MonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-tuples}AddressPresentation" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}SubstantialInterestInNetherlandsPartnershipName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}SubstantialInterestInNetherlandsPartnershipNominalValueOfShares" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}SubstantialInterestInNetherlandsPartnershipNumberOfProfitProofs" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}SubstantialInterestInNetherlandsPartnershipTypeOfShares" minOccurs="0"/>
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
    "addressPresentation",
    "substantialInterestInNetherlandsPartnershipName",
    "substantialInterestInNetherlandsPartnershipNominalValueOfShares",
    "substantialInterestInNetherlandsPartnershipNumberOfProfitProofs",
    "substantialInterestInNetherlandsPartnershipTypeOfShares"
})
public class SubstantialInterestInNetherlandsPartnershipsSpecification
    extends Placeholder
{

    @XmlElement(name = "AddressPresentation", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-tuples")
    protected AddressPresentation addressPresentation;
    @XmlElement(name = "SubstantialInterestInNetherlandsPartnershipName", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected Anstring200VItemType substantialInterestInNetherlandsPartnershipName;
    @XmlElement(name = "SubstantialInterestInNetherlandsPartnershipNominalValueOfShares", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType substantialInterestInNetherlandsPartnershipNominalValueOfShares;
    @XmlElement(name = "SubstantialInterestInNetherlandsPartnershipNumberOfProfitProofs", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected NonNegativeInteger10VItemType substantialInterestInNetherlandsPartnershipNumberOfProfitProofs;
    @XmlElement(name = "SubstantialInterestInNetherlandsPartnershipTypeOfShares", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected Anstring70VItemType substantialInterestInNetherlandsPartnershipTypeOfShares;

    /**
     * Gets the value of the addressPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPresentation }
     *     
     */
    public AddressPresentation getAddressPresentation() {
        return addressPresentation;
    }

    /**
     * Sets the value of the addressPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPresentation }
     *     
     */
    public void setAddressPresentation(AddressPresentation value) {
        this.addressPresentation = value;
    }

    /**
     * Gets the value of the substantialInterestInNetherlandsPartnershipName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getSubstantialInterestInNetherlandsPartnershipName() {
        return substantialInterestInNetherlandsPartnershipName;
    }

    /**
     * Sets the value of the substantialInterestInNetherlandsPartnershipName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setSubstantialInterestInNetherlandsPartnershipName(Anstring200VItemType value) {
        this.substantialInterestInNetherlandsPartnershipName = value;
    }

    /**
     * Gets the value of the substantialInterestInNetherlandsPartnershipNominalValueOfShares property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getSubstantialInterestInNetherlandsPartnershipNominalValueOfShares() {
        return substantialInterestInNetherlandsPartnershipNominalValueOfShares;
    }

    /**
     * Sets the value of the substantialInterestInNetherlandsPartnershipNominalValueOfShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setSubstantialInterestInNetherlandsPartnershipNominalValueOfShares(MonetaryNoDecimalsItemType value) {
        this.substantialInterestInNetherlandsPartnershipNominalValueOfShares = value;
    }

    /**
     * Gets the value of the substantialInterestInNetherlandsPartnershipNumberOfProfitProofs property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger10VItemType }
     *     
     */
    public NonNegativeInteger10VItemType getSubstantialInterestInNetherlandsPartnershipNumberOfProfitProofs() {
        return substantialInterestInNetherlandsPartnershipNumberOfProfitProofs;
    }

    /**
     * Sets the value of the substantialInterestInNetherlandsPartnershipNumberOfProfitProofs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger10VItemType }
     *     
     */
    public void setSubstantialInterestInNetherlandsPartnershipNumberOfProfitProofs(NonNegativeInteger10VItemType value) {
        this.substantialInterestInNetherlandsPartnershipNumberOfProfitProofs = value;
    }

    /**
     * Gets the value of the substantialInterestInNetherlandsPartnershipTypeOfShares property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getSubstantialInterestInNetherlandsPartnershipTypeOfShares() {
        return substantialInterestInNetherlandsPartnershipTypeOfShares;
    }

    /**
     * Sets the value of the substantialInterestInNetherlandsPartnershipTypeOfShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setSubstantialInterestInNetherlandsPartnershipTypeOfShares(Anstring70VItemType value) {
        this.substantialInterestInNetherlandsPartnershipTypeOfShares = value;
    }

}