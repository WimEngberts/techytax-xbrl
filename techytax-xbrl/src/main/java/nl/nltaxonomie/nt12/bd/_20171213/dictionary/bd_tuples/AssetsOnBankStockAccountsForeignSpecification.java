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
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring4VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt12.bd._20171213.dictionary.bd_types.Test11ItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.iso3166_countrycodes_2017_03_18.IsoCountryCodes3CharactersItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}AssetsOnBankStockAccountsForeignAccountHolderIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}AssetsOnBankStockAccountsForeignBankAccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}AssetsOnBankStockAccountsForeignBankName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}AssetsOnBankStockAccountsForeignCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data}AssetsOnBankStockAccountsForeignInterestTypeCode" minOccurs="0"/>
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
    "assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber",
    "assetsOnBankStockAccountsForeignBankAccountNumber",
    "assetsOnBankStockAccountsForeignBankName",
    "assetsOnBankStockAccountsForeignCountryCode",
    "assetsOnBankStockAccountsForeignInterestTypeCode"
})
public class AssetsOnBankStockAccountsForeignSpecification
    extends Placeholder
{

    @XmlElement(name = "AssetsOnBankStockAccountsForeignAccountHolderIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Test11ItemType assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber;
    @XmlElement(name = "AssetsOnBankStockAccountsForeignBankAccountNumber", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring34VItemType assetsOnBankStockAccountsForeignBankAccountNumber;
    @XmlElement(name = "AssetsOnBankStockAccountsForeignBankName", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring70VItemType assetsOnBankStockAccountsForeignBankName;
    @XmlElement(name = "AssetsOnBankStockAccountsForeignCountryCode", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected IsoCountryCodes3CharactersItemType assetsOnBankStockAccountsForeignCountryCode;
    @XmlElement(name = "AssetsOnBankStockAccountsForeignInterestTypeCode", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213/dictionary/bd-data")
    protected Anstring4VItemType assetsOnBankStockAccountsForeignInterestTypeCode;

    /**
     * Gets the value of the assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getAssetsOnBankStockAccountsForeignAccountHolderIdentificationNumber() {
        return assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber;
    }

    /**
     * Sets the value of the assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setAssetsOnBankStockAccountsForeignAccountHolderIdentificationNumber(Test11ItemType value) {
        this.assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber = value;
    }

    /**
     * Gets the value of the assetsOnBankStockAccountsForeignBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getAssetsOnBankStockAccountsForeignBankAccountNumber() {
        return assetsOnBankStockAccountsForeignBankAccountNumber;
    }

    /**
     * Sets the value of the assetsOnBankStockAccountsForeignBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setAssetsOnBankStockAccountsForeignBankAccountNumber(Anstring34VItemType value) {
        this.assetsOnBankStockAccountsForeignBankAccountNumber = value;
    }

    /**
     * Gets the value of the assetsOnBankStockAccountsForeignBankName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getAssetsOnBankStockAccountsForeignBankName() {
        return assetsOnBankStockAccountsForeignBankName;
    }

    /**
     * Sets the value of the assetsOnBankStockAccountsForeignBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setAssetsOnBankStockAccountsForeignBankName(Anstring70VItemType value) {
        this.assetsOnBankStockAccountsForeignBankName = value;
    }

    /**
     * Gets the value of the assetsOnBankStockAccountsForeignCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getAssetsOnBankStockAccountsForeignCountryCode() {
        return assetsOnBankStockAccountsForeignCountryCode;
    }

    /**
     * Sets the value of the assetsOnBankStockAccountsForeignCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setAssetsOnBankStockAccountsForeignCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.assetsOnBankStockAccountsForeignCountryCode = value;
    }

    /**
     * Gets the value of the assetsOnBankStockAccountsForeignInterestTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring4VItemType }
     *     
     */
    public Anstring4VItemType getAssetsOnBankStockAccountsForeignInterestTypeCode() {
        return assetsOnBankStockAccountsForeignInterestTypeCode;
    }

    /**
     * Sets the value of the assetsOnBankStockAccountsForeignInterestTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring4VItemType }
     *     
     */
    public void setAssetsOnBankStockAccountsForeignInterestTypeCode(Anstring4VItemType value) {
        this.assetsOnBankStockAccountsForeignInterestTypeCode = value;
    }

}