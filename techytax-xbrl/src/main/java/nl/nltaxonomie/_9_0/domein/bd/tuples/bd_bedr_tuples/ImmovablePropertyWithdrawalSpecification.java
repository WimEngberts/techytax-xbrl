//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring24VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring4VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring9VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.NonNegativeInteger5VItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ImmovablePropertyProfitsAndLossesWithdrawal" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ImmovablePropertyWithdrawalBookValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ImmovablePropertyWithdrawalEstimationValuer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ImmovablePropertyWithdrawalLocationHouseNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ImmovablePropertyWithdrawalLocationHouseNumberAddition" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ImmovablePropertyWithdrawalLocationPlace" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ImmovablePropertyWithdrawalLocationPostalcode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ImmovablePropertyWithdrawalLocationStreetName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ImmovablePropertyWithdrawalValueOfTrade" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ImmovablePropertyWithdrawalValuerName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ImmovablePropertyWithdrawelTransferToThird" minOccurs="0"/>
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
    "immovablePropertyProfitsAndLossesWithdrawal",
    "immovablePropertyWithdrawalBookValue",
    "immovablePropertyWithdrawalEstimationValuer",
    "immovablePropertyWithdrawalLocationHouseNumber",
    "immovablePropertyWithdrawalLocationHouseNumberAddition",
    "immovablePropertyWithdrawalLocationPlace",
    "immovablePropertyWithdrawalLocationPostalcode",
    "immovablePropertyWithdrawalLocationStreetName",
    "immovablePropertyWithdrawalValueOfTrade",
    "immovablePropertyWithdrawalValuerName",
    "immovablePropertyWithdrawelTransferToThird"
})
public class ImmovablePropertyWithdrawalSpecification
    extends Placeholder
{

    @XmlElement(name = "ImmovablePropertyProfitsAndLossesWithdrawal", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType immovablePropertyProfitsAndLossesWithdrawal;
    @XmlElement(name = "ImmovablePropertyWithdrawalBookValue", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyWithdrawalBookValue;
    @XmlElement(name = "ImmovablePropertyWithdrawalEstimationValuer", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected BooleanItemType immovablePropertyWithdrawalEstimationValuer;
    @XmlElement(name = "ImmovablePropertyWithdrawalLocationHouseNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected NonNegativeInteger5VItemType immovablePropertyWithdrawalLocationHouseNumber;
    @XmlElement(name = "ImmovablePropertyWithdrawalLocationHouseNumberAddition", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Anstring4VItemType immovablePropertyWithdrawalLocationHouseNumberAddition;
    @XmlElement(name = "ImmovablePropertyWithdrawalLocationPlace", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Anstring24VItemType immovablePropertyWithdrawalLocationPlace;
    @XmlElement(name = "ImmovablePropertyWithdrawalLocationPostalcode", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Anstring9VItemType immovablePropertyWithdrawalLocationPostalcode;
    @XmlElement(name = "ImmovablePropertyWithdrawalLocationStreetName", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Anstring24VItemType immovablePropertyWithdrawalLocationStreetName;
    @XmlElement(name = "ImmovablePropertyWithdrawalValueOfTrade", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyWithdrawalValueOfTrade;
    @XmlElement(name = "ImmovablePropertyWithdrawalValuerName", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Anstring70VItemType immovablePropertyWithdrawalValuerName;
    @XmlElement(name = "ImmovablePropertyWithdrawelTransferToThird", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected BooleanItemType immovablePropertyWithdrawelTransferToThird;

    /**
     * Gets the value of the immovablePropertyProfitsAndLossesWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getImmovablePropertyProfitsAndLossesWithdrawal() {
        return immovablePropertyProfitsAndLossesWithdrawal;
    }

    /**
     * Sets the value of the immovablePropertyProfitsAndLossesWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyProfitsAndLossesWithdrawal(MonetaryNoDecimalsItemType value) {
        this.immovablePropertyProfitsAndLossesWithdrawal = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalBookValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyWithdrawalBookValue() {
        return immovablePropertyWithdrawalBookValue;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalBookValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalBookValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyWithdrawalBookValue = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalEstimationValuer property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyWithdrawalEstimationValuer() {
        return immovablePropertyWithdrawalEstimationValuer;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalEstimationValuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalEstimationValuer(BooleanItemType value) {
        this.immovablePropertyWithdrawalEstimationValuer = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalLocationHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public NonNegativeInteger5VItemType getImmovablePropertyWithdrawalLocationHouseNumber() {
        return immovablePropertyWithdrawalLocationHouseNumber;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalLocationHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalLocationHouseNumber(NonNegativeInteger5VItemType value) {
        this.immovablePropertyWithdrawalLocationHouseNumber = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalLocationHouseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring4VItemType }
     *     
     */
    public Anstring4VItemType getImmovablePropertyWithdrawalLocationHouseNumberAddition() {
        return immovablePropertyWithdrawalLocationHouseNumberAddition;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalLocationHouseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring4VItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalLocationHouseNumberAddition(Anstring4VItemType value) {
        this.immovablePropertyWithdrawalLocationHouseNumberAddition = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalLocationPlace property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getImmovablePropertyWithdrawalLocationPlace() {
        return immovablePropertyWithdrawalLocationPlace;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalLocationPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalLocationPlace(Anstring24VItemType value) {
        this.immovablePropertyWithdrawalLocationPlace = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalLocationPostalcode property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring9VItemType }
     *     
     */
    public Anstring9VItemType getImmovablePropertyWithdrawalLocationPostalcode() {
        return immovablePropertyWithdrawalLocationPostalcode;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalLocationPostalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring9VItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalLocationPostalcode(Anstring9VItemType value) {
        this.immovablePropertyWithdrawalLocationPostalcode = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalLocationStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getImmovablePropertyWithdrawalLocationStreetName() {
        return immovablePropertyWithdrawalLocationStreetName;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalLocationStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalLocationStreetName(Anstring24VItemType value) {
        this.immovablePropertyWithdrawalLocationStreetName = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalValueOfTrade property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyWithdrawalValueOfTrade() {
        return immovablePropertyWithdrawalValueOfTrade;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalValueOfTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalValueOfTrade(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyWithdrawalValueOfTrade = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalValuerName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getImmovablePropertyWithdrawalValuerName() {
        return immovablePropertyWithdrawalValuerName;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalValuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalValuerName(Anstring70VItemType value) {
        this.immovablePropertyWithdrawalValuerName = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawelTransferToThird property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyWithdrawelTransferToThird() {
        return immovablePropertyWithdrawelTransferToThird;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawelTransferToThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyWithdrawelTransferToThird(BooleanItemType value) {
        this.immovablePropertyWithdrawelTransferToThird = value;
    }

}
