//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Anstring200VItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.CustomDateItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.NonNegativeInteger2FItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Test11ItemType;
import org.xbrl._2003.instance.DateItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}RelationshipTaxpayerAddressRegistrationPeriodEndDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}RelationshipTaxpayerAddressRegistrationPeriodStartDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}RelationshipTaxpayerDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}RelationshipTaxpayerDeceasedDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}RelationshipTaxpayerIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}RelationshipTaxpayerRelationCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}RelationshipTaxpayerSurname" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}RelationshipTaxpayerWeddingDate" minOccurs="0"/>
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
    "relationshipTaxpayerAddressRegistrationPeriodEndDate",
    "relationshipTaxpayerAddressRegistrationPeriodStartDate",
    "relationshipTaxpayerDateOfBirth",
    "relationshipTaxpayerDeceasedDate",
    "relationshipTaxpayerIdentificationNumber",
    "relationshipTaxpayerRelationCode",
    "relationshipTaxpayerSurname",
    "relationshipTaxpayerWeddingDate"
})
public class RelationshipTaxpayerPersonalDataPartnerChildrenSpecification
    extends Placeholder
{

    @XmlElement(name = "RelationshipTaxpayerAddressRegistrationPeriodEndDate", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected DateItemType relationshipTaxpayerAddressRegistrationPeriodEndDate;
    @XmlElement(name = "RelationshipTaxpayerAddressRegistrationPeriodStartDate", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected DateItemType relationshipTaxpayerAddressRegistrationPeriodStartDate;
    @XmlElement(name = "RelationshipTaxpayerDateOfBirth", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected CustomDateItemType relationshipTaxpayerDateOfBirth;
    @XmlElement(name = "RelationshipTaxpayerDeceasedDate", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected DateItemType relationshipTaxpayerDeceasedDate;
    @XmlElement(name = "RelationshipTaxpayerIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Test11ItemType relationshipTaxpayerIdentificationNumber;
    @XmlElement(name = "RelationshipTaxpayerRelationCode", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeInteger2FItemType relationshipTaxpayerRelationCode;
    @XmlElement(name = "RelationshipTaxpayerSurname", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Anstring200VItemType relationshipTaxpayerSurname;
    @XmlElement(name = "RelationshipTaxpayerWeddingDate", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected DateItemType relationshipTaxpayerWeddingDate;

    /**
     * Gets the value of the relationshipTaxpayerAddressRegistrationPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getRelationshipTaxpayerAddressRegistrationPeriodEndDate() {
        return relationshipTaxpayerAddressRegistrationPeriodEndDate;
    }

    /**
     * Sets the value of the relationshipTaxpayerAddressRegistrationPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setRelationshipTaxpayerAddressRegistrationPeriodEndDate(DateItemType value) {
        this.relationshipTaxpayerAddressRegistrationPeriodEndDate = value;
    }

    /**
     * Gets the value of the relationshipTaxpayerAddressRegistrationPeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getRelationshipTaxpayerAddressRegistrationPeriodStartDate() {
        return relationshipTaxpayerAddressRegistrationPeriodStartDate;
    }

    /**
     * Sets the value of the relationshipTaxpayerAddressRegistrationPeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setRelationshipTaxpayerAddressRegistrationPeriodStartDate(DateItemType value) {
        this.relationshipTaxpayerAddressRegistrationPeriodStartDate = value;
    }

    /**
     * Gets the value of the relationshipTaxpayerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link CustomDateItemType }
     *     
     */
    public CustomDateItemType getRelationshipTaxpayerDateOfBirth() {
        return relationshipTaxpayerDateOfBirth;
    }

    /**
     * Sets the value of the relationshipTaxpayerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomDateItemType }
     *     
     */
    public void setRelationshipTaxpayerDateOfBirth(CustomDateItemType value) {
        this.relationshipTaxpayerDateOfBirth = value;
    }

    /**
     * Gets the value of the relationshipTaxpayerDeceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getRelationshipTaxpayerDeceasedDate() {
        return relationshipTaxpayerDeceasedDate;
    }

    /**
     * Sets the value of the relationshipTaxpayerDeceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setRelationshipTaxpayerDeceasedDate(DateItemType value) {
        this.relationshipTaxpayerDeceasedDate = value;
    }

    /**
     * Gets the value of the relationshipTaxpayerIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getRelationshipTaxpayerIdentificationNumber() {
        return relationshipTaxpayerIdentificationNumber;
    }

    /**
     * Sets the value of the relationshipTaxpayerIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setRelationshipTaxpayerIdentificationNumber(Test11ItemType value) {
        this.relationshipTaxpayerIdentificationNumber = value;
    }

    /**
     * Gets the value of the relationshipTaxpayerRelationCode property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getRelationshipTaxpayerRelationCode() {
        return relationshipTaxpayerRelationCode;
    }

    /**
     * Sets the value of the relationshipTaxpayerRelationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setRelationshipTaxpayerRelationCode(NonNegativeInteger2FItemType value) {
        this.relationshipTaxpayerRelationCode = value;
    }

    /**
     * Gets the value of the relationshipTaxpayerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getRelationshipTaxpayerSurname() {
        return relationshipTaxpayerSurname;
    }

    /**
     * Sets the value of the relationshipTaxpayerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setRelationshipTaxpayerSurname(Anstring200VItemType value) {
        this.relationshipTaxpayerSurname = value;
    }

    /**
     * Gets the value of the relationshipTaxpayerWeddingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getRelationshipTaxpayerWeddingDate() {
        return relationshipTaxpayerWeddingDate;
    }

    /**
     * Sets the value of the relationshipTaxpayerWeddingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setRelationshipTaxpayerWeddingDate(DateItemType value) {
        this.relationshipTaxpayerWeddingDate = value;
    }

}