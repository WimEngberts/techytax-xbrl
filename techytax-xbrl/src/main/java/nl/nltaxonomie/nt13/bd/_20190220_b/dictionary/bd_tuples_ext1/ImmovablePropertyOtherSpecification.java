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
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_tuples.AddressAbroadPresentation;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_tuples.AddressPresentation;
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie.nt13.bd._20190220_b.dictionary.bd_types_ext1.NonNegativeInteger9VItemType;
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-tuples}AddressAbroadPresentation" minOccurs="0"/>
 *           &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-tuples}AddressPresentation" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}EstateImmovableProperty"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherEntirePossessionTestatorPartner"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherGroundLease" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherGroundLeaseYearly"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherHiredOut"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherHiredOutEntirely" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherHolidayHomeHiredOutTemporarily"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherHouse"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherImmovablePropertyLawValue"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherRentAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherRentPointsSystemOrRealRent" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherSquareMetersHiredOut" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherSquareMetersTotal" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherTestatorPartnerCommonPart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherTestatorPartnerPart"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherTestatorPrivatePart" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1}ImmovablePropertyOtherValueLegacy"/>
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
    "addressAbroadPresentation",
    "addressPresentation",
    "estateImmovableProperty",
    "immovablePropertyOtherEntirePossessionTestatorPartner",
    "immovablePropertyOtherGroundLease",
    "immovablePropertyOtherGroundLeaseYearly",
    "immovablePropertyOtherHiredOut",
    "immovablePropertyOtherHiredOutEntirely",
    "immovablePropertyOtherHolidayHomeHiredOutTemporarily",
    "immovablePropertyOtherHouse",
    "immovablePropertyOtherImmovablePropertyLawValue",
    "immovablePropertyOtherRentAmount",
    "immovablePropertyOtherRentPointsSystemOrRealRent",
    "immovablePropertyOtherSquareMetersHiredOut",
    "immovablePropertyOtherSquareMetersTotal",
    "immovablePropertyOtherTestatorPartnerCommonPart",
    "immovablePropertyOtherTestatorPartnerPart",
    "immovablePropertyOtherTestatorPrivatePart",
    "immovablePropertyOtherValueLegacy"
})
public class ImmovablePropertyOtherSpecification
    extends Placeholder
{

    @XmlElement(name = "AddressAbroadPresentation", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-tuples")
    protected AddressAbroadPresentation addressAbroadPresentation;
    @XmlElement(name = "AddressPresentation", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-tuples")
    protected AddressPresentation addressPresentation;
    @XmlElement(name = "EstateImmovableProperty", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected BooleanItemType estateImmovableProperty;
    @XmlElement(name = "ImmovablePropertyOtherEntirePossessionTestatorPartner", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected BooleanItemType immovablePropertyOtherEntirePossessionTestatorPartner;
    @XmlElement(name = "ImmovablePropertyOtherGroundLease", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType immovablePropertyOtherGroundLease;
    @XmlElement(name = "ImmovablePropertyOtherGroundLeaseYearly", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected BooleanItemType immovablePropertyOtherGroundLeaseYearly;
    @XmlElement(name = "ImmovablePropertyOtherHiredOut", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected BooleanItemType immovablePropertyOtherHiredOut;
    @XmlElement(name = "ImmovablePropertyOtherHiredOutEntirely", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected BooleanItemType immovablePropertyOtherHiredOutEntirely;
    @XmlElement(name = "ImmovablePropertyOtherHolidayHomeHiredOutTemporarily", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected BooleanItemType immovablePropertyOtherHolidayHomeHiredOutTemporarily;
    @XmlElement(name = "ImmovablePropertyOtherHouse", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected BooleanItemType immovablePropertyOtherHouse;
    @XmlElement(name = "ImmovablePropertyOtherImmovablePropertyLawValue", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected MonetaryNoDecimals10VItemType immovablePropertyOtherImmovablePropertyLawValue;
    @XmlElement(name = "ImmovablePropertyOtherRentAmount", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType immovablePropertyOtherRentAmount;
    @XmlElement(name = "ImmovablePropertyOtherRentPointsSystemOrRealRent", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected BooleanItemType immovablePropertyOtherRentPointsSystemOrRealRent;
    @XmlElement(name = "ImmovablePropertyOtherSquareMetersHiredOut", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected NonNegativeInteger9VItemType immovablePropertyOtherSquareMetersHiredOut;
    @XmlElement(name = "ImmovablePropertyOtherSquareMetersTotal", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected NonNegativeInteger9VItemType immovablePropertyOtherSquareMetersTotal;
    @XmlElement(name = "ImmovablePropertyOtherTestatorPartnerCommonPart", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType immovablePropertyOtherTestatorPartnerCommonPart;
    @XmlElement(name = "ImmovablePropertyOtherTestatorPartnerPart", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected MonetaryNoDecimals10VItemType immovablePropertyOtherTestatorPartnerPart;
    @XmlElement(name = "ImmovablePropertyOtherTestatorPrivatePart", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1")
    protected MonetaryNoDecimals10VItemType immovablePropertyOtherTestatorPrivatePart;
    @XmlElement(name = "ImmovablePropertyOtherValueLegacy", namespace = "http://www.nltaxonomie.nl/nt13/bd/20190220.b/dictionary/bd-data-ext1", required = true)
    protected MonetaryNoDecimals10VItemType immovablePropertyOtherValueLegacy;

    /**
     * Gets the value of the addressAbroadPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressAbroadPresentation }
     *     
     */
    public AddressAbroadPresentation getAddressAbroadPresentation() {
        return addressAbroadPresentation;
    }

    /**
     * Sets the value of the addressAbroadPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressAbroadPresentation }
     *     
     */
    public void setAddressAbroadPresentation(AddressAbroadPresentation value) {
        this.addressAbroadPresentation = value;
    }

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
     * Gets the value of the estateImmovableProperty property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getEstateImmovableProperty() {
        return estateImmovableProperty;
    }

    /**
     * Sets the value of the estateImmovableProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setEstateImmovableProperty(BooleanItemType value) {
        this.estateImmovableProperty = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherEntirePossessionTestatorPartner property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyOtherEntirePossessionTestatorPartner() {
        return immovablePropertyOtherEntirePossessionTestatorPartner;
    }

    /**
     * Sets the value of the immovablePropertyOtherEntirePossessionTestatorPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyOtherEntirePossessionTestatorPartner(BooleanItemType value) {
        this.immovablePropertyOtherEntirePossessionTestatorPartner = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherGroundLease property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getImmovablePropertyOtherGroundLease() {
        return immovablePropertyOtherGroundLease;
    }

    /**
     * Sets the value of the immovablePropertyOtherGroundLease property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setImmovablePropertyOtherGroundLease(MonetaryNoDecimals10VItemType value) {
        this.immovablePropertyOtherGroundLease = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherGroundLeaseYearly property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyOtherGroundLeaseYearly() {
        return immovablePropertyOtherGroundLeaseYearly;
    }

    /**
     * Sets the value of the immovablePropertyOtherGroundLeaseYearly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyOtherGroundLeaseYearly(BooleanItemType value) {
        this.immovablePropertyOtherGroundLeaseYearly = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherHiredOut property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyOtherHiredOut() {
        return immovablePropertyOtherHiredOut;
    }

    /**
     * Sets the value of the immovablePropertyOtherHiredOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyOtherHiredOut(BooleanItemType value) {
        this.immovablePropertyOtherHiredOut = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherHiredOutEntirely property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyOtherHiredOutEntirely() {
        return immovablePropertyOtherHiredOutEntirely;
    }

    /**
     * Sets the value of the immovablePropertyOtherHiredOutEntirely property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyOtherHiredOutEntirely(BooleanItemType value) {
        this.immovablePropertyOtherHiredOutEntirely = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherHolidayHomeHiredOutTemporarily property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyOtherHolidayHomeHiredOutTemporarily() {
        return immovablePropertyOtherHolidayHomeHiredOutTemporarily;
    }

    /**
     * Sets the value of the immovablePropertyOtherHolidayHomeHiredOutTemporarily property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyOtherHolidayHomeHiredOutTemporarily(BooleanItemType value) {
        this.immovablePropertyOtherHolidayHomeHiredOutTemporarily = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherHouse property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyOtherHouse() {
        return immovablePropertyOtherHouse;
    }

    /**
     * Sets the value of the immovablePropertyOtherHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyOtherHouse(BooleanItemType value) {
        this.immovablePropertyOtherHouse = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherImmovablePropertyLawValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getImmovablePropertyOtherImmovablePropertyLawValue() {
        return immovablePropertyOtherImmovablePropertyLawValue;
    }

    /**
     * Sets the value of the immovablePropertyOtherImmovablePropertyLawValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setImmovablePropertyOtherImmovablePropertyLawValue(MonetaryNoDecimals10VItemType value) {
        this.immovablePropertyOtherImmovablePropertyLawValue = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherRentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getImmovablePropertyOtherRentAmount() {
        return immovablePropertyOtherRentAmount;
    }

    /**
     * Sets the value of the immovablePropertyOtherRentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setImmovablePropertyOtherRentAmount(MonetaryNoDecimals10VItemType value) {
        this.immovablePropertyOtherRentAmount = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherRentPointsSystemOrRealRent property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyOtherRentPointsSystemOrRealRent() {
        return immovablePropertyOtherRentPointsSystemOrRealRent;
    }

    /**
     * Sets the value of the immovablePropertyOtherRentPointsSystemOrRealRent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyOtherRentPointsSystemOrRealRent(BooleanItemType value) {
        this.immovablePropertyOtherRentPointsSystemOrRealRent = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherSquareMetersHiredOut property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger9VItemType }
     *     
     */
    public NonNegativeInteger9VItemType getImmovablePropertyOtherSquareMetersHiredOut() {
        return immovablePropertyOtherSquareMetersHiredOut;
    }

    /**
     * Sets the value of the immovablePropertyOtherSquareMetersHiredOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger9VItemType }
     *     
     */
    public void setImmovablePropertyOtherSquareMetersHiredOut(NonNegativeInteger9VItemType value) {
        this.immovablePropertyOtherSquareMetersHiredOut = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherSquareMetersTotal property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger9VItemType }
     *     
     */
    public NonNegativeInteger9VItemType getImmovablePropertyOtherSquareMetersTotal() {
        return immovablePropertyOtherSquareMetersTotal;
    }

    /**
     * Sets the value of the immovablePropertyOtherSquareMetersTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger9VItemType }
     *     
     */
    public void setImmovablePropertyOtherSquareMetersTotal(NonNegativeInteger9VItemType value) {
        this.immovablePropertyOtherSquareMetersTotal = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherTestatorPartnerCommonPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getImmovablePropertyOtherTestatorPartnerCommonPart() {
        return immovablePropertyOtherTestatorPartnerCommonPart;
    }

    /**
     * Sets the value of the immovablePropertyOtherTestatorPartnerCommonPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setImmovablePropertyOtherTestatorPartnerCommonPart(MonetaryNoDecimals10VItemType value) {
        this.immovablePropertyOtherTestatorPartnerCommonPart = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherTestatorPartnerPart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getImmovablePropertyOtherTestatorPartnerPart() {
        return immovablePropertyOtherTestatorPartnerPart;
    }

    /**
     * Sets the value of the immovablePropertyOtherTestatorPartnerPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setImmovablePropertyOtherTestatorPartnerPart(MonetaryNoDecimals10VItemType value) {
        this.immovablePropertyOtherTestatorPartnerPart = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherTestatorPrivatePart property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getImmovablePropertyOtherTestatorPrivatePart() {
        return immovablePropertyOtherTestatorPrivatePart;
    }

    /**
     * Sets the value of the immovablePropertyOtherTestatorPrivatePart property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setImmovablePropertyOtherTestatorPrivatePart(MonetaryNoDecimals10VItemType value) {
        this.immovablePropertyOtherTestatorPrivatePart = value;
    }

    /**
     * Gets the value of the immovablePropertyOtherValueLegacy property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getImmovablePropertyOtherValueLegacy() {
        return immovablePropertyOtherValueLegacy;
    }

    /**
     * Sets the value of the immovablePropertyOtherValueLegacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setImmovablePropertyOtherValueLegacy(MonetaryNoDecimals10VItemType value) {
        this.immovablePropertyOtherValueLegacy = value;
    }

}
