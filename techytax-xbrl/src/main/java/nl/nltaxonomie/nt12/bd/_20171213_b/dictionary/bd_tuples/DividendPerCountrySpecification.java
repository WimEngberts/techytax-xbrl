//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.09 at 08:39:58 PM CEST 
//


package nl.nltaxonomie.nt12.bd._20171213_b.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.iso3166_countrycodes_2017_03_18.IsoCountryCodes3CharactersItemType;
import nl.nltaxonomie.nt12.sbr._20170515.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}DividendRevenues" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}DividendRevenuesOriginalCurrency" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}DividendTaxAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}DividendTaxAmountOriginalCurrency" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data}DividendWithholdingTaxCountryCode" minOccurs="0"/>
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
    "dividendRevenues",
    "dividendRevenuesOriginalCurrency",
    "dividendTaxAmount",
    "dividendTaxAmountOriginalCurrency",
    "dividendWithholdingTaxCountryCode"
})
public class DividendPerCountrySpecification
    extends Placeholder
{

    @XmlElement(name = "DividendRevenues", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType dividendRevenues;
    @XmlElement(name = "DividendRevenuesOriginalCurrency", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType dividendRevenuesOriginalCurrency;
    @XmlElement(name = "DividendTaxAmount", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType dividendTaxAmount;
    @XmlElement(name = "DividendTaxAmountOriginalCurrency", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType dividendTaxAmountOriginalCurrency;
    @XmlElement(name = "DividendWithholdingTaxCountryCode", namespace = "http://www.nltaxonomie.nl/nt12/bd/20171213.b/dictionary/bd-data")
    protected IsoCountryCodes3CharactersItemType dividendWithholdingTaxCountryCode;

    /**
     * Gets the value of the dividendRevenues property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDividendRevenues() {
        return dividendRevenues;
    }

    /**
     * Sets the value of the dividendRevenues property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDividendRevenues(NonNegativeMonetaryNoDecimalsItemType value) {
        this.dividendRevenues = value;
    }

    /**
     * Gets the value of the dividendRevenuesOriginalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDividendRevenuesOriginalCurrency() {
        return dividendRevenuesOriginalCurrency;
    }

    /**
     * Sets the value of the dividendRevenuesOriginalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDividendRevenuesOriginalCurrency(NonNegativeMonetaryNoDecimalsItemType value) {
        this.dividendRevenuesOriginalCurrency = value;
    }

    /**
     * Gets the value of the dividendTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDividendTaxAmount() {
        return dividendTaxAmount;
    }

    /**
     * Sets the value of the dividendTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDividendTaxAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.dividendTaxAmount = value;
    }

    /**
     * Gets the value of the dividendTaxAmountOriginalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDividendTaxAmountOriginalCurrency() {
        return dividendTaxAmountOriginalCurrency;
    }

    /**
     * Sets the value of the dividendTaxAmountOriginalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDividendTaxAmountOriginalCurrency(NonNegativeMonetaryNoDecimalsItemType value) {
        this.dividendTaxAmountOriginalCurrency = value;
    }

    /**
     * Gets the value of the dividendWithholdingTaxCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getDividendWithholdingTaxCountryCode() {
        return dividendWithholdingTaxCountryCode;
    }

    /**
     * Sets the value of the dividendWithholdingTaxCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setDividendWithholdingTaxCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.dividendWithholdingTaxCountryCode = value;
    }

}