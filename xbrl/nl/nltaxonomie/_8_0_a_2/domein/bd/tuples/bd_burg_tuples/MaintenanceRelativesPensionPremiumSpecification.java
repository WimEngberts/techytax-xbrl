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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}MaintenanceRelativesPensionPremiumAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers}MaintenanceRelativesPensionPremiumDescription" minOccurs="0"/>
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
    "maintenanceRelativesPensionPremiumAmount",
    "maintenanceRelativesPensionPremiumDescription"
})
public class MaintenanceRelativesPensionPremiumSpecification
    extends Placeholder
{

    @XmlElement(name = "MaintenanceRelativesPensionPremiumAmount", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType maintenanceRelativesPensionPremiumAmount;
    @XmlElement(name = "MaintenanceRelativesPensionPremiumDescription", namespace = "http://www.nltaxonomie.nl/8.0.a.2/basis/bd/items/bd-burgers")
    protected Anstring60VItemType maintenanceRelativesPensionPremiumDescription;

    /**
     * Gets the value of the maintenanceRelativesPensionPremiumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getMaintenanceRelativesPensionPremiumAmount() {
        return maintenanceRelativesPensionPremiumAmount;
    }

    /**
     * Sets the value of the maintenanceRelativesPensionPremiumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setMaintenanceRelativesPensionPremiumAmount(MonetaryNoDecimalsItemType value) {
        this.maintenanceRelativesPensionPremiumAmount = value;
    }

    /**
     * Gets the value of the maintenanceRelativesPensionPremiumDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring60VItemType }
     *     
     */
    public Anstring60VItemType getMaintenanceRelativesPensionPremiumDescription() {
        return maintenanceRelativesPensionPremiumDescription;
    }

    /**
     * Sets the value of the maintenanceRelativesPensionPremiumDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring60VItemType }
     *     
     */
    public void setMaintenanceRelativesPensionPremiumDescription(Anstring60VItemType value) {
        this.maintenanceRelativesPensionPremiumDescription = value;
    }

}
