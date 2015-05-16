//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_ob_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_codes.IsoCountrycodeECMemberStatesItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.MonetaryNoDecimals10VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.VatIdentificationNumberItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-omzetbelasting}CountryCodeISO-EC"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-omzetbelasting}ServicesAmount"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-omzetbelasting}VATIdentificationNumberNational"/>
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
    "countryCodeISOEC",
    "servicesAmount",
    "vatIdentificationNumberNational"
})
public class IntraCommunityServices
    extends Placeholder
{

    @XmlElement(name = "CountryCodeISO-EC", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-omzetbelasting", required = true)
    protected IsoCountrycodeECMemberStatesItemType countryCodeISOEC;
    @XmlElement(name = "ServicesAmount", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-omzetbelasting", required = true)
    protected MonetaryNoDecimals10VItemType servicesAmount;
    @XmlElement(name = "VATIdentificationNumberNational", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-omzetbelasting", required = true)
    protected VatIdentificationNumberItemType vatIdentificationNumberNational;

    /**
     * Gets the value of the countryCodeISOEC property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountrycodeECMemberStatesItemType }
     *     
     */
    public IsoCountrycodeECMemberStatesItemType getCountryCodeISOEC() {
        return countryCodeISOEC;
    }

    /**
     * Sets the value of the countryCodeISOEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountrycodeECMemberStatesItemType }
     *     
     */
    public void setCountryCodeISOEC(IsoCountrycodeECMemberStatesItemType value) {
        this.countryCodeISOEC = value;
    }

    /**
     * Gets the value of the servicesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public MonetaryNoDecimals10VItemType getServicesAmount() {
        return servicesAmount;
    }

    /**
     * Sets the value of the servicesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimals10VItemType }
     *     
     */
    public void setServicesAmount(MonetaryNoDecimals10VItemType value) {
        this.servicesAmount = value;
    }

    /**
     * Gets the value of the vatIdentificationNumberNational property.
     * 
     * @return
     *     possible object is
     *     {@link VatIdentificationNumberItemType }
     *     
     */
    public VatIdentificationNumberItemType getVATIdentificationNumberNational() {
        return vatIdentificationNumberNational;
    }

    /**
     * Sets the value of the vatIdentificationNumberNational property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatIdentificationNumberItemType }
     *     
     */
    public void setVATIdentificationNumberNational(VatIdentificationNumberItemType value) {
        this.vatIdentificationNumberNational = value;
    }

}