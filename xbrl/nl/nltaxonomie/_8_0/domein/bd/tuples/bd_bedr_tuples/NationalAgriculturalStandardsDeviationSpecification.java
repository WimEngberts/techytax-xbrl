//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.09 at 10:28:44 PM CET 
//


package nl.nltaxonomie._8_0.domein.bd.tuples.bd_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._8_0.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven}NationalAgriculturalStandardsDeviationAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven}NationalAgriculturalStandardsDeviationDescription" minOccurs="0"/>
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
    "nationalAgriculturalStandardsDeviationAmount",
    "nationalAgriculturalStandardsDeviationDescription"
})
public class NationalAgriculturalStandardsDeviationSpecification
    extends Placeholder
{

    @XmlElement(name = "NationalAgriculturalStandardsDeviationAmount", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType nationalAgriculturalStandardsDeviationAmount;
    @XmlElement(name = "NationalAgriculturalStandardsDeviationDescription", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven")
    protected Anstring70VItemType nationalAgriculturalStandardsDeviationDescription;

    /**
     * Gets the value of the nationalAgriculturalStandardsDeviationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getNationalAgriculturalStandardsDeviationAmount() {
        return nationalAgriculturalStandardsDeviationAmount;
    }

    /**
     * Sets the value of the nationalAgriculturalStandardsDeviationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setNationalAgriculturalStandardsDeviationAmount(MonetaryNoDecimalsItemType value) {
        this.nationalAgriculturalStandardsDeviationAmount = value;
    }

    /**
     * Gets the value of the nationalAgriculturalStandardsDeviationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getNationalAgriculturalStandardsDeviationDescription() {
        return nationalAgriculturalStandardsDeviationDescription;
    }

    /**
     * Sets the value of the nationalAgriculturalStandardsDeviationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setNationalAgriculturalStandardsDeviationDescription(Anstring70VItemType value) {
        this.nationalAgriculturalStandardsDeviationDescription = value;
    }

}
