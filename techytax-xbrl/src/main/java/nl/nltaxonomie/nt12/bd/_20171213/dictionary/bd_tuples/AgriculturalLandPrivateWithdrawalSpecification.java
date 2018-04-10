//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}LandRegistryDetailsMunicipality" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}LandRegistryDetailsSectionNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}PlotOfLandBookValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}WithdrawalDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}WithdrawingDueToTransferLandToPrivateAmount" minOccurs="0"/>
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
    "landRegistryDetailsMunicipality",
    "landRegistryDetailsSectionNumber",
    "plotOfLandBookValue",
    "withdrawalDate",
    "withdrawingDueToTransferLandToPrivateAmount"
})
public class AgriculturalLandPrivateWithdrawalSpecification
    extends Placeholder
{

    @XmlElement(name = "LandRegistryDetailsMunicipality", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring70VItemType landRegistryDetailsMunicipality;
    @XmlElement(name = "LandRegistryDetailsSectionNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring70VItemType landRegistryDetailsSectionNumber;
    @XmlElement(name = "PlotOfLandBookValue", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType plotOfLandBookValue;
    @XmlElement(name = "WithdrawalDate", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected DateItemType withdrawalDate;
    @XmlElement(name = "WithdrawingDueToTransferLandToPrivateAmount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType withdrawingDueToTransferLandToPrivateAmount;

    /**
     * Gets the value of the landRegistryDetailsMunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getLandRegistryDetailsMunicipality() {
        return landRegistryDetailsMunicipality;
    }

    /**
     * Sets the value of the landRegistryDetailsMunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setLandRegistryDetailsMunicipality(Anstring70VItemType value) {
        this.landRegistryDetailsMunicipality = value;
    }

    /**
     * Gets the value of the landRegistryDetailsSectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getLandRegistryDetailsSectionNumber() {
        return landRegistryDetailsSectionNumber;
    }

    /**
     * Sets the value of the landRegistryDetailsSectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setLandRegistryDetailsSectionNumber(Anstring70VItemType value) {
        this.landRegistryDetailsSectionNumber = value;
    }

    /**
     * Gets the value of the plotOfLandBookValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getPlotOfLandBookValue() {
        return plotOfLandBookValue;
    }

    /**
     * Sets the value of the plotOfLandBookValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setPlotOfLandBookValue(MonetaryNoDecimalsItemType value) {
        this.plotOfLandBookValue = value;
    }

    /**
     * Gets the value of the withdrawalDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getWithdrawalDate() {
        return withdrawalDate;
    }

    /**
     * Sets the value of the withdrawalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setWithdrawalDate(DateItemType value) {
        this.withdrawalDate = value;
    }

    /**
     * Gets the value of the withdrawingDueToTransferLandToPrivateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getWithdrawingDueToTransferLandToPrivateAmount() {
        return withdrawingDueToTransferLandToPrivateAmount;
    }

    /**
     * Sets the value of the withdrawingDueToTransferLandToPrivateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setWithdrawingDueToTransferLandToPrivateAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.withdrawingDueToTransferLandToPrivateAmount = value;
    }

}