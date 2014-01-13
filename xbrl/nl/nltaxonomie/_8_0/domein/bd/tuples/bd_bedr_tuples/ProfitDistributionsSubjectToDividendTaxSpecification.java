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
import nl.nltaxonomie._8_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
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
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven}DividendTaxReturnDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven}DividendTaxWithheldAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven}ProfitDistributionAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven}ProfitDistributionSubjectToDividendDate" minOccurs="0"/>
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
    "dividendTaxReturnDate",
    "dividendTaxWithheldAmount",
    "profitDistributionAmount",
    "profitDistributionSubjectToDividendDate"
})
public class ProfitDistributionsSubjectToDividendTaxSpecification
    extends Placeholder
{

    @XmlElement(name = "DividendTaxReturnDate", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven")
    protected DateItemType dividendTaxReturnDate;
    @XmlElement(name = "DividendTaxWithheldAmount", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType dividendTaxWithheldAmount;
    @XmlElement(name = "ProfitDistributionAmount", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType profitDistributionAmount;
    @XmlElement(name = "ProfitDistributionSubjectToDividendDate", namespace = "http://www.nltaxonomie.nl/8.0/basis/bd/items/bd-bedrijven")
    protected DateItemType profitDistributionSubjectToDividendDate;

    /**
     * Gets the value of the dividendTaxReturnDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getDividendTaxReturnDate() {
        return dividendTaxReturnDate;
    }

    /**
     * Sets the value of the dividendTaxReturnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setDividendTaxReturnDate(DateItemType value) {
        this.dividendTaxReturnDate = value;
    }

    /**
     * Gets the value of the dividendTaxWithheldAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getDividendTaxWithheldAmount() {
        return dividendTaxWithheldAmount;
    }

    /**
     * Sets the value of the dividendTaxWithheldAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setDividendTaxWithheldAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.dividendTaxWithheldAmount = value;
    }

    /**
     * Gets the value of the profitDistributionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getProfitDistributionAmount() {
        return profitDistributionAmount;
    }

    /**
     * Sets the value of the profitDistributionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setProfitDistributionAmount(NonNegativeMonetaryNoDecimalsItemType value) {
        this.profitDistributionAmount = value;
    }

    /**
     * Gets the value of the profitDistributionSubjectToDividendDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateItemType }
     *     
     */
    public DateItemType getProfitDistributionSubjectToDividendDate() {
        return profitDistributionSubjectToDividendDate;
    }

    /**
     * Sets the value of the profitDistributionSubjectToDividendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateItemType }
     *     
     */
    public void setProfitDistributionSubjectToDividendDate(DateItemType value) {
        this.profitDistributionSubjectToDividendDate = value;
    }

}
