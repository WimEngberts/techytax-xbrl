//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.17 at 01:15:21 PM CEST 
//


package nl.nltaxonomie._8_0_a_2.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._8_0_a_2.basis.bd.types.bd_types.Anstring60VItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}SocialAssistanceBenefitMaintenancePassedOnAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}SocialAssistanceBenefitMaintenancePassedOnDescription" minOccurs="0"/>
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
    "socialAssistanceBenefitMaintenancePassedOnAmount",
    "socialAssistanceBenefitMaintenancePassedOnDescription"
})
public class SocialAssistanceBenefitMaintenancePassedOnSpecification
    extends Placeholder
{

    @XmlElement(name = "SocialAssistanceBenefitMaintenancePassedOnAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType socialAssistanceBenefitMaintenancePassedOnAmount;
    @XmlElement(name = "SocialAssistanceBenefitMaintenancePassedOnDescription", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected Anstring60VItemType socialAssistanceBenefitMaintenancePassedOnDescription;

    /**
     * Gets the value of the socialAssistanceBenefitMaintenancePassedOnAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getSocialAssistanceBenefitMaintenancePassedOnAmount() {
        return socialAssistanceBenefitMaintenancePassedOnAmount;
    }

    /**
     * Sets the value of the socialAssistanceBenefitMaintenancePassedOnAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setSocialAssistanceBenefitMaintenancePassedOnAmount(MonetaryNoDecimalsItemType value) {
        this.socialAssistanceBenefitMaintenancePassedOnAmount = value;
    }

    /**
     * Gets the value of the socialAssistanceBenefitMaintenancePassedOnDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring60VItemType }
     *     
     */
    public Anstring60VItemType getSocialAssistanceBenefitMaintenancePassedOnDescription() {
        return socialAssistanceBenefitMaintenancePassedOnDescription;
    }

    /**
     * Sets the value of the socialAssistanceBenefitMaintenancePassedOnDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring60VItemType }
     *     
     */
    public void setSocialAssistanceBenefitMaintenancePassedOnDescription(Anstring60VItemType value) {
        this.socialAssistanceBenefitMaintenancePassedOnDescription = value;
    }

}
