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
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Anstring70VItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}MaintenanceObligationOtherAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}MaintenanceObligationOtherDescription" minOccurs="0"/>
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
    "maintenanceObligationOtherAmount",
    "maintenanceObligationOtherDescription"
})
public class MaintenanceObligationOtherSpecification
    extends Placeholder
{

    @XmlElement(name = "MaintenanceObligationOtherAmount", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType maintenanceObligationOtherAmount;
    @XmlElement(name = "MaintenanceObligationOtherDescription", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Anstring70VItemType maintenanceObligationOtherDescription;

    /**
     * Gets the value of the maintenanceObligationOtherAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getMaintenanceObligationOtherAmount() {
        return maintenanceObligationOtherAmount;
    }

    /**
     * Sets the value of the maintenanceObligationOtherAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setMaintenanceObligationOtherAmount(MonetaryNoDecimalsItemType value) {
        this.maintenanceObligationOtherAmount = value;
    }

    /**
     * Gets the value of the maintenanceObligationOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getMaintenanceObligationOtherDescription() {
        return maintenanceObligationOtherDescription;
    }

    /**
     * Sets the value of the maintenanceObligationOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setMaintenanceObligationOtherDescription(Anstring70VItemType value) {
        this.maintenanceObligationOtherDescription = value;
    }

}
