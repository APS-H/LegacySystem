
package EmployeeClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the EmployeeClient package. 
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

    private final static QName _GetEmployeesServiceResponse_QNAME = new QName("http://service.legacy.apsh.com/", "getEmployeesServiceResponse");
    private final static QName _Exception_QNAME = new QName("http://service.legacy.apsh.com/", "Exception");
    private final static QName _GetEmployeesService_QNAME = new QName("http://service.legacy.apsh.com/", "getEmployeesService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: EmployeeClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeesServiceResponse }
     * 
     */
    public GetEmployeesServiceResponse createGetEmployeesServiceResponse() {
        return new GetEmployeesServiceResponse();
    }

    /**
     * Create an instance of {@link GetEmployeesService }
     * 
     */
    public GetEmployeesService createGetEmployeesService() {
        return new GetEmployeesService();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeesServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.legacy.apsh.com/", name = "getEmployeesServiceResponse")
    public JAXBElement<GetEmployeesServiceResponse> createGetEmployeesServiceResponse(GetEmployeesServiceResponse value) {
        return new JAXBElement<GetEmployeesServiceResponse>(_GetEmployeesServiceResponse_QNAME, GetEmployeesServiceResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeesService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.legacy.apsh.com/", name = "getEmployeesService")
    public JAXBElement<GetEmployeesService> createGetEmployeesService(GetEmployeesService value) {
        return new JAXBElement<GetEmployeesService>(_GetEmployeesService_QNAME, GetEmployeesService.class, null, value);
    }

}
