
package shiftssclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the shiftssclient package. 
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

    private final static QName _GetShiftServiceResponse_QNAME = new QName("http://service.legacy.apsh.com/", "getShiftServiceResponse");
    private final static QName _Exception_QNAME = new QName("http://service.legacy.apsh.com/", "Exception");
    private final static QName _GetShiftService_QNAME = new QName("http://service.legacy.apsh.com/", "getShiftService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: shiftssclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetShiftService }
     * 
     */
    public GetShiftService createGetShiftService() {
        return new GetShiftService();
    }

    /**
     * Create an instance of {@link GetShiftServiceResponse }
     * 
     */
    public GetShiftServiceResponse createGetShiftServiceResponse() {
        return new GetShiftServiceResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Shift }
     * 
     */
    public Shift createShift() {
        return new Shift();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShiftServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.legacy.apsh.com/", name = "getShiftServiceResponse")
    public JAXBElement<GetShiftServiceResponse> createGetShiftServiceResponse(GetShiftServiceResponse value) {
        return new JAXBElement<GetShiftServiceResponse>(_GetShiftServiceResponse_QNAME, GetShiftServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.legacy.apsh.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShiftService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.legacy.apsh.com/", name = "getShiftService")
    public JAXBElement<GetShiftService> createGetShiftService(GetShiftService value) {
        return new JAXBElement<GetShiftService>(_GetShiftService_QNAME, GetShiftService.class, null, value);
    }

}
