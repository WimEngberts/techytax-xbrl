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
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Anstring70VItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}BusinessAssetsRandomDepreciationNetherlandsAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}BusinessAssetsRandomDepreciationNetherlandsBookValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}BusinessAssetsRandomDepreciationNetherlandsDescription" minOccurs="0"/>
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
    "businessAssetsRandomDepreciationNetherlandsAmount",
    "businessAssetsRandomDepreciationNetherlandsBookValue",
    "businessAssetsRandomDepreciationNetherlandsDescription"
})
public class BusinessAssetsRandomDepreciationNetherlandsSpecification
    extends Placeholder
{

    @XmlElement(name = "BusinessAssetsRandomDepreciationNetherlandsAmount", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType businessAssetsRandomDepreciationNetherlandsAmount;
    @XmlElement(name = "BusinessAssetsRandomDepreciationNetherlandsBookValue", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType businessAssetsRandomDepreciationNetherlandsBookValue;
    @XmlElement(name = "BusinessAssetsRandomDepreciationNetherlandsDescription", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected Anstring70VItemType businessAssetsRandomDepreciationNetherlandsDescription;

    /**
     * Gets the value of the businessAssetsRandomDepreciationNetherlandsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getBusinessAssetsRandomDepreciationNetherlandsAmount() {
        return businessAssetsRandomDepreciationNetherlandsAmount;
    }

    /**
     * Sets the value of the businessAssetsRandomDepreciationNetherlandsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setBusinessAssetsRandomDepreciationNetherlandsAmount(MonetaryNoDecimalsItemType value) {
        this.businessAssetsRandomDepreciationNetherlandsAmount = value;
    }

    /**
     * Gets the value of the businessAssetsRandomDepreciationNetherlandsBookValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getBusinessAssetsRandomDepreciationNetherlandsBookValue() {
        return businessAssetsRandomDepreciationNetherlandsBookValue;
    }

    /**
     * Sets the value of the businessAssetsRandomDepreciationNetherlandsBookValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setBusinessAssetsRandomDepreciationNetherlandsBookValue(MonetaryNoDecimalsItemType value) {
        this.businessAssetsRandomDepreciationNetherlandsBookValue = value;
    }

    /**
     * Gets the value of the businessAssetsRandomDepreciationNetherlandsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getBusinessAssetsRandomDepreciationNetherlandsDescription() {
        return businessAssetsRandomDepreciationNetherlandsDescription;
    }

    /**
     * Sets the value of the businessAssetsRandomDepreciationNetherlandsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setBusinessAssetsRandomDepreciationNetherlandsDescription(Anstring70VItemType value) {
        this.businessAssetsRandomDepreciationNetherlandsDescription = value;
    }

}
