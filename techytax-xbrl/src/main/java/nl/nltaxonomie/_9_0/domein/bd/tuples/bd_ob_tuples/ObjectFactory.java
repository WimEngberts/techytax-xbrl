//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_ob_tuples;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.nltaxonomie._9_0.domein.bd.tuples.bd_ob_tuples package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IntraCommunitySuppliesCorrection_QNAME = new QName("http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", "IntraCommunitySuppliesCorrection");
    private final static QName _IntraCommunityABCSuppliesCorrection_QNAME = new QName("http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", "IntraCommunityABCSuppliesCorrection");
    private final static QName _MSESTSuppliesSpecification_QNAME = new QName("http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", "MSESTSuppliesSpecification");
    private final static QName _IntraCommunityServices_QNAME = new QName("http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", "IntraCommunityServices");
    private final static QName _IntraCommunityServicesCorrection_QNAME = new QName("http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", "IntraCommunityServicesCorrection");
    private final static QName _MSIDSuppliesSpecification_QNAME = new QName("http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", "MSIDSuppliesSpecification");
    private final static QName _IntraCommunitySupplies_QNAME = new QName("http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", "IntraCommunitySupplies");
    private final static QName _IntraCommunityABCSupplies_QNAME = new QName("http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", "IntraCommunityABCSupplies");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.nltaxonomie._9_0.domein.bd.tuples.bd_ob_tuples
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MSIDSuppliesSpecification }
     * 
     */
    public MSIDSuppliesSpecification createMSIDSuppliesSpecification() {
        return new MSIDSuppliesSpecification();
    }

    /**
     * Create an instance of {@link MSESTSuppliesSpecification }
     * 
     */
    public MSESTSuppliesSpecification createMSESTSuppliesSpecification() {
        return new MSESTSuppliesSpecification();
    }

    /**
     * Create an instance of {@link IntraCommunityServicesCorrection }
     * 
     */
    public IntraCommunityServicesCorrection createIntraCommunityServicesCorrection() {
        return new IntraCommunityServicesCorrection();
    }

    /**
     * Create an instance of {@link IntraCommunitySuppliesCorrection }
     * 
     */
    public IntraCommunitySuppliesCorrection createIntraCommunitySuppliesCorrection() {
        return new IntraCommunitySuppliesCorrection();
    }

    /**
     * Create an instance of {@link IntraCommunityABCSupplies }
     * 
     */
    public IntraCommunityABCSupplies createIntraCommunityABCSupplies() {
        return new IntraCommunityABCSupplies();
    }

    /**
     * Create an instance of {@link IntraCommunitySupplies }
     * 
     */
    public IntraCommunitySupplies createIntraCommunitySupplies() {
        return new IntraCommunitySupplies();
    }

    /**
     * Create an instance of {@link IntraCommunityServices }
     * 
     */
    public IntraCommunityServices createIntraCommunityServices() {
        return new IntraCommunityServices();
    }

    /**
     * Create an instance of {@link IntraCommunityABCSuppliesCorrection }
     * 
     */
    public IntraCommunityABCSuppliesCorrection createIntraCommunityABCSuppliesCorrection() {
        return new IntraCommunityABCSuppliesCorrection();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntraCommunitySuppliesCorrection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", name = "IntraCommunitySuppliesCorrection", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<IntraCommunitySuppliesCorrection> createIntraCommunitySuppliesCorrection(IntraCommunitySuppliesCorrection value) {
        return new JAXBElement<IntraCommunitySuppliesCorrection>(_IntraCommunitySuppliesCorrection_QNAME, IntraCommunitySuppliesCorrection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntraCommunityABCSuppliesCorrection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", name = "IntraCommunityABCSuppliesCorrection", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<IntraCommunityABCSuppliesCorrection> createIntraCommunityABCSuppliesCorrection(IntraCommunityABCSuppliesCorrection value) {
        return new JAXBElement<IntraCommunityABCSuppliesCorrection>(_IntraCommunityABCSuppliesCorrection_QNAME, IntraCommunityABCSuppliesCorrection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSESTSuppliesSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", name = "MSESTSuppliesSpecification", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<MSESTSuppliesSpecification> createMSESTSuppliesSpecification(MSESTSuppliesSpecification value) {
        return new JAXBElement<MSESTSuppliesSpecification>(_MSESTSuppliesSpecification_QNAME, MSESTSuppliesSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntraCommunityServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", name = "IntraCommunityServices", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<IntraCommunityServices> createIntraCommunityServices(IntraCommunityServices value) {
        return new JAXBElement<IntraCommunityServices>(_IntraCommunityServices_QNAME, IntraCommunityServices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntraCommunityServicesCorrection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", name = "IntraCommunityServicesCorrection", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<IntraCommunityServicesCorrection> createIntraCommunityServicesCorrection(IntraCommunityServicesCorrection value) {
        return new JAXBElement<IntraCommunityServicesCorrection>(_IntraCommunityServicesCorrection_QNAME, IntraCommunityServicesCorrection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSIDSuppliesSpecification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", name = "MSIDSuppliesSpecification", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<MSIDSuppliesSpecification> createMSIDSuppliesSpecification(MSIDSuppliesSpecification value) {
        return new JAXBElement<MSIDSuppliesSpecification>(_MSIDSuppliesSpecification_QNAME, MSIDSuppliesSpecification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntraCommunitySupplies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", name = "IntraCommunitySupplies", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<IntraCommunitySupplies> createIntraCommunitySupplies(IntraCommunitySupplies value) {
        return new JAXBElement<IntraCommunitySupplies>(_IntraCommunitySupplies_QNAME, IntraCommunitySupplies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntraCommunityABCSupplies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nltaxonomie.nl/9.0/domein/bd/tuples/bd-ob-tuples", name = "IntraCommunityABCSupplies", substitutionHeadNamespace = "http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension", substitutionHeadName = "specificationTuple")
    public JAXBElement<IntraCommunityABCSupplies> createIntraCommunityABCSupplies(IntraCommunityABCSupplies value) {
        return new JAXBElement<IntraCommunityABCSupplies>(_IntraCommunityABCSupplies_QNAME, IntraCommunityABCSupplies.class, null, value);
    }

}