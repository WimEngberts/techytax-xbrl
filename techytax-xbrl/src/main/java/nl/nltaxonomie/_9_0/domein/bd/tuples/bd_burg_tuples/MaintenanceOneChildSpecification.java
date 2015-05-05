//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_burg_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring10VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}MaintenanceChildAmount1stQuarter" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}MaintenanceChildAmount2ndQuarter" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}MaintenanceChildAmount3rdQuarter" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}MaintenanceChildAmount4thQuarter" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}MaintenanceChildDateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}MaintenanceChildInitials" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}MaintenanceChildReasonNoChildBenefitStudentGrant" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers}MaintenanceChildYearTotal" minOccurs="0"/>
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
    "maintenanceChildAmount1StQuarter",
    "maintenanceChildAmount2NdQuarter",
    "maintenanceChildAmount3RdQuarter",
    "maintenanceChildAmount4ThQuarter",
    "maintenanceChildDateOfBirth",
    "maintenanceChildInitials",
    "maintenanceChildReasonNoChildBenefitStudentGrant",
    "maintenanceChildYearTotal"
})
public class MaintenanceOneChildSpecification
    extends Placeholder
{

    @XmlElement(name = "MaintenanceChildAmount1stQuarter", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType maintenanceChildAmount1StQuarter;
    @XmlElement(name = "MaintenanceChildAmount2ndQuarter", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType maintenanceChildAmount2NdQuarter;
    @XmlElement(name = "MaintenanceChildAmount3rdQuarter", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType maintenanceChildAmount3RdQuarter;
    @XmlElement(name = "MaintenanceChildAmount4thQuarter", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected MonetaryNoDecimalsItemType maintenanceChildAmount4ThQuarter;
    @XmlElement(name = "MaintenanceChildDateOfBirth", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected DateItemType maintenanceChildDateOfBirth;
    @XmlElement(name = "MaintenanceChildInitials", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring10VItemType maintenanceChildInitials;
    @XmlElement(name = "MaintenanceChildReasonNoChildBenefitStudentGrant", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected Anstring70VItemType maintenanceChildReasonNoChildBenefitStudentGrant;
    @XmlElement(name = "MaintenanceChildYearTotal", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-burgers")
    protected NonNegativeMonetaryNoDecimalsItemType maintenanceChildYearTotal;

    /**
     * Gets the value of the maintenanceChildAmount1StQuarter property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getMaintenanceChildAmount1StQuarter() {
        return maintenanceChildAmount1StQuarter;
    }

    /**
     * Sets the value of the maintenanceChildAmount1StQuarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setMaintenanceChildAmount1StQuarter(MonetaryNoDecimalsItemType value) {
        this.maintenanceChildAmount1StQuarter = value;
    }

    /**
     * Gets the value of the maintenanceChildAmount2NdQuarter property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getMaintenanceChildAmount2NdQuarter() {
        return maintenanceChildAmount2NdQuarter;
    }

    /**
     * Sets the value of the maintenanceChildAmount2NdQuarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setMaintenanceChildAmount2NdQuarter(MonetaryNoDecimalsItemType value) {
        this.maintenanceChildAmount2NdQuarter = value;
    }

    /**
     * Gets the value of the maintenanceChildAmount3RdQuarter property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getMaintenanceChildAmount3RdQuarter() {
        return maintenanceChildAmount3RdQuarter;
    }

    /**
     * Sets the value of the maintenanceChildAmount3RdQuarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setMaintenanceChildAmount3RdQuarter(MonetaryNoDecimalsItemType value) {
        this.maintenanceChildAmount3RdQuarter = value;
    }

    /**
     * Gets the value of the maintenanceChildAmount4ThQuarter property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getMaintenanceChildAmount4ThQuarter() {
        return maintenanceChildAmount4ThQuarter;
    }

    /**
     * Sets the value of the maintenanceChildAmount4ThQuarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setMaintenanceChildAmount4ThQuarter(MonetaryNoDecimalsItemType value) {
        this.maintenanceChildAmount4ThQuarter = value;
    }

    /**
     * Gets the value of the maintenanceChildDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getMaintenanceChildDateOfBirth() {
        return maintenanceChildDateOfBirth;
    }

    /**
     * Sets the value of the maintenanceChildDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setMaintenanceChildDateOfBirth(DateItemType value) {
        this.maintenanceChildDateOfBirth = value;
    }

    /**
     * Gets the value of the maintenanceChildInitials property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring10VItemType }
     *     
     */
    public Anstring10VItemType getMaintenanceChildInitials() {
        return maintenanceChildInitials;
    }

    /**
     * Sets the value of the maintenanceChildInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring10VItemType }
     *     
     */
    public void setMaintenanceChildInitials(Anstring10VItemType value) {
        this.maintenanceChildInitials = value;
    }

    /**
     * Gets the value of the maintenanceChildReasonNoChildBenefitStudentGrant property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getMaintenanceChildReasonNoChildBenefitStudentGrant() {
        return maintenanceChildReasonNoChildBenefitStudentGrant;
    }

    /**
     * Sets the value of the maintenanceChildReasonNoChildBenefitStudentGrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setMaintenanceChildReasonNoChildBenefitStudentGrant(Anstring70VItemType value) {
        this.maintenanceChildReasonNoChildBenefitStudentGrant = value;
    }

    /**
     * Gets the value of the maintenanceChildYearTotal property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getMaintenanceChildYearTotal() {
        return maintenanceChildYearTotal;
    }

    /**
     * Sets the value of the maintenanceChildYearTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setMaintenanceChildYearTotal(NonNegativeMonetaryNoDecimalsItemType value) {
        this.maintenanceChildYearTotal = value;
    }

}
