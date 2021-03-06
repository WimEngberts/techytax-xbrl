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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}LandDisposalDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}LandRegistryDetailsArea" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}LandRegistryDetailsMunicipality" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}LandRegistryDetailsSectionNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}ParcelDisposedSalesPrice" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}SectionSoldBookValue" minOccurs="0"/>
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
    "landDisposalDate",
    "landRegistryDetailsArea",
    "landRegistryDetailsMunicipality",
    "landRegistryDetailsSectionNumber",
    "parcelDisposedSalesPrice",
    "sectionSoldBookValue"
})
public class LandDisposalSpecification
    extends Placeholder
{

    @XmlElement(name = "LandDisposalDate", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected DateItemType landDisposalDate;
    @XmlElement(name = "LandRegistryDetailsArea", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected Anstring70VItemType landRegistryDetailsArea;
    @XmlElement(name = "LandRegistryDetailsMunicipality", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected Anstring70VItemType landRegistryDetailsMunicipality;
    @XmlElement(name = "LandRegistryDetailsSectionNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected Anstring70VItemType landRegistryDetailsSectionNumber;
    @XmlElement(name = "ParcelDisposedSalesPrice", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType parcelDisposedSalesPrice;
    @XmlElement(name = "SectionSoldBookValue", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType sectionSoldBookValue;

    /**
     * Gets the value of the landDisposalDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getLandDisposalDate() {
        return landDisposalDate;
    }

    /**
     * Sets the value of the landDisposalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setLandDisposalDate(DateItemType value) {
        this.landDisposalDate = value;
    }

    /**
     * Gets the value of the landRegistryDetailsArea property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getLandRegistryDetailsArea() {
        return landRegistryDetailsArea;
    }

    /**
     * Sets the value of the landRegistryDetailsArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setLandRegistryDetailsArea(Anstring70VItemType value) {
        this.landRegistryDetailsArea = value;
    }

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
     * Gets the value of the parcelDisposedSalesPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getParcelDisposedSalesPrice() {
        return parcelDisposedSalesPrice;
    }

    /**
     * Sets the value of the parcelDisposedSalesPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setParcelDisposedSalesPrice(MonetaryNoDecimalsItemType value) {
        this.parcelDisposedSalesPrice = value;
    }

    /**
     * Gets the value of the sectionSoldBookValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getSectionSoldBookValue() {
        return sectionSoldBookValue;
    }

    /**
     * Sets the value of the sectionSoldBookValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setSectionSoldBookValue(MonetaryNoDecimalsItemType value) {
        this.sectionSoldBookValue = value;
    }

}
