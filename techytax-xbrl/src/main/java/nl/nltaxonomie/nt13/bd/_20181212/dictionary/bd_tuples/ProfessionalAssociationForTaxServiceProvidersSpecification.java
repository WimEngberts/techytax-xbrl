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
import nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Anstring20VItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data}ProfessionalAssociationForTaxServiceProvidersName"/>
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
    "professionalAssociationForTaxServiceProvidersName"
})
public class ProfessionalAssociationForTaxServiceProvidersSpecification
    extends Placeholder
{

    @XmlElement(name = "ProfessionalAssociationForTaxServiceProvidersName", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212/dictionary/bd-data", required = true)
    protected Anstring20VItemType professionalAssociationForTaxServiceProvidersName;

    /**
     * Gets the value of the professionalAssociationForTaxServiceProvidersName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getProfessionalAssociationForTaxServiceProvidersName() {
        return professionalAssociationForTaxServiceProvidersName;
    }

    /**
     * Sets the value of the professionalAssociationForTaxServiceProvidersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setProfessionalAssociationForTaxServiceProvidersName(Anstring20VItemType value) {
        this.professionalAssociationForTaxServiceProvidersName = value;
    }

}
