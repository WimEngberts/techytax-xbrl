//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20190220_b.dictionary.bd_tuples_ext1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Anstring200VItemType;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Test11ItemType;
import org.xbrl._2003.instance.BooleanItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}BusinessSuccessionFacilitiesApplicantDeferredTaxProportionalPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}BusinessSuccessionFacilitiesApplicantIdentificationNumber"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}BusinessSuccessionFacilitiesApplicantSurname"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}BusinessSuccessionFacilitiesBusinessCapitalInAcquisition"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}BusinessSuccessionFacilitiesConditionalExcemptionRequest"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}BusinessSuccessionFacilitiesPreservedTaxAssessmentRequest"/>
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
    "businessSuccessionFacilitiesApplicantDeferredTaxProportionalPart",
    "businessSuccessionFacilitiesApplicantIdentificationNumber",
    "businessSuccessionFacilitiesApplicantSurname",
    "businessSuccessionFacilitiesBusinessCapitalInAcquisition",
    "businessSuccessionFacilitiesConditionalExcemptionRequest",
    "businessSuccessionFacilitiesPreservedTaxAssessmentRequest"
})
public class BusinessSuccessionFacilitiesApplicantSpecification
    extends Placeholder
{

    @XmlElement(name = "BusinessSuccessionFacilitiesApplicantDeferredTaxProportionalPart", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType businessSuccessionFacilitiesApplicantDeferredTaxProportionalPart;
    @XmlElement(name = "BusinessSuccessionFacilitiesApplicantIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected Test11ItemType businessSuccessionFacilitiesApplicantIdentificationNumber;
    @XmlElement(name = "BusinessSuccessionFacilitiesApplicantSurname", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected Anstring200VItemType businessSuccessionFacilitiesApplicantSurname;
    @XmlElement(name = "BusinessSuccessionFacilitiesBusinessCapitalInAcquisition", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected MonetaryNoDecimals10VItemType businessSuccessionFacilitiesBusinessCapitalInAcquisition;
    @XmlElement(name = "BusinessSuccessionFacilitiesConditionalExcemptionRequest", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected BooleanItemType businessSuccessionFacilitiesConditionalExcemptionRequest;
    @XmlElement(name = "BusinessSuccessionFacilitiesPreservedTaxAssessmentRequest", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected BooleanItemType businessSuccessionFacilitiesPreservedTaxAssessmentRequest;

    /**
     * Gets the value of the businessSuccessionFacilitiesApplicantDeferredTaxProportionalPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBusinessSuccessionFacilitiesApplicantDeferredTaxProportionalPart() {
        return businessSuccessionFacilitiesApplicantDeferredTaxProportionalPart;
    }

    /**
     * Sets the value of the businessSuccessionFacilitiesApplicantDeferredTaxProportionalPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBusinessSuccessionFacilitiesApplicantDeferredTaxProportionalPart(MonetaryNoDecimals10VItemType value) {
        this.businessSuccessionFacilitiesApplicantDeferredTaxProportionalPart = value;
    }

    /**
     * Gets the value of the businessSuccessionFacilitiesApplicantIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getBusinessSuccessionFacilitiesApplicantIdentificationNumber() {
        return businessSuccessionFacilitiesApplicantIdentificationNumber;
    }

    /**
     * Sets the value of the businessSuccessionFacilitiesApplicantIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setBusinessSuccessionFacilitiesApplicantIdentificationNumber(Test11ItemType value) {
        this.businessSuccessionFacilitiesApplicantIdentificationNumber = value;
    }

    /**
     * Gets the value of the businessSuccessionFacilitiesApplicantSurname property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring200VItemType }
     *     
     */
    public Anstring200VItemType getBusinessSuccessionFacilitiesApplicantSurname() {
        return businessSuccessionFacilitiesApplicantSurname;
    }

    /**
     * Sets the value of the businessSuccessionFacilitiesApplicantSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring200VItemType }
     *     
     */
    public void setBusinessSuccessionFacilitiesApplicantSurname(Anstring200VItemType value) {
        this.businessSuccessionFacilitiesApplicantSurname = value;
    }

    /**
     * Gets the value of the businessSuccessionFacilitiesBusinessCapitalInAcquisition property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getBusinessSuccessionFacilitiesBusinessCapitalInAcquisition() {
        return businessSuccessionFacilitiesBusinessCapitalInAcquisition;
    }

    /**
     * Sets the value of the businessSuccessionFacilitiesBusinessCapitalInAcquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setBusinessSuccessionFacilitiesBusinessCapitalInAcquisition(MonetaryNoDecimals10VItemType value) {
        this.businessSuccessionFacilitiesBusinessCapitalInAcquisition = value;
    }

    /**
     * Gets the value of the businessSuccessionFacilitiesConditionalExcemptionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getBusinessSuccessionFacilitiesConditionalExcemptionRequest() {
        return businessSuccessionFacilitiesConditionalExcemptionRequest;
    }

    /**
     * Sets the value of the businessSuccessionFacilitiesConditionalExcemptionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setBusinessSuccessionFacilitiesConditionalExcemptionRequest(BooleanItemType value) {
        this.businessSuccessionFacilitiesConditionalExcemptionRequest = value;
    }

    /**
     * Gets the value of the businessSuccessionFacilitiesPreservedTaxAssessmentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getBusinessSuccessionFacilitiesPreservedTaxAssessmentRequest() {
        return businessSuccessionFacilitiesPreservedTaxAssessmentRequest;
    }

    /**
     * Sets the value of the businessSuccessionFacilitiesPreservedTaxAssessmentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setBusinessSuccessionFacilitiesPreservedTaxAssessmentRequest(BooleanItemType value) {
        this.businessSuccessionFacilitiesPreservedTaxAssessmentRequest = value;
    }

}
