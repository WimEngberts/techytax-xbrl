//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.09 at 10:28:44 PM CET 
//


package nl.nltaxonomie._8_0.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._8_0.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}ExemptedWagesInternationalOrganisationPreviousWorkAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers}ExemptedWagesInternationalOrganisationPreviousWorkName" minOccurs="0"/>
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
    "exemptedWagesInternationalOrganisationPreviousWorkAmount",
    "exemptedWagesInternationalOrganisationPreviousWorkName"
})
public class ExemptedWagesInternationalOrganisationPreviousWorkSpecification
    extends Placeholder
{

    @XmlElement(name = "ExemptedWagesInternationalOrganisationPreviousWorkAmount", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType exemptedWagesInternationalOrganisationPreviousWorkAmount;
    @XmlElement(name = "ExemptedWagesInternationalOrganisationPreviousWorkName", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-burgers")
    protected Anstring70VItemType exemptedWagesInternationalOrganisationPreviousWorkName;

    /**
     * Gets the value of the exemptedWagesInternationalOrganisationPreviousWorkAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getExemptedWagesInternationalOrganisationPreviousWorkAmount() {
        return exemptedWagesInternationalOrganisationPreviousWorkAmount;
    }

    /**
     * Sets the value of the exemptedWagesInternationalOrganisationPreviousWorkAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setExemptedWagesInternationalOrganisationPreviousWorkAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.exemptedWagesInternationalOrganisationPreviousWorkAmount = value;
    }

    /**
     * Gets the value of the exemptedWagesInternationalOrganisationPreviousWorkName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getExemptedWagesInternationalOrganisationPreviousWorkName() {
        return exemptedWagesInternationalOrganisationPreviousWorkName;
    }

    /**
     * Sets the value of the exemptedWagesInternationalOrganisationPreviousWorkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setExemptedWagesInternationalOrganisationPreviousWorkName(Anstring70VItemType value) {
        this.exemptedWagesInternationalOrganisationPreviousWorkName = value;
    }

}
