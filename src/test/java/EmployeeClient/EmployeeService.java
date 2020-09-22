
package EmployeeClient;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeService", targetNamespace = "http://service.legacy.apsh.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeService {


    /**
     * 
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmployeesService", targetNamespace = "http://service.legacy.apsh.com/", className = "EmployeeClient.GetEmployeesService")
    @ResponseWrapper(localName = "getEmployeesServiceResponse", targetNamespace = "http://service.legacy.apsh.com/", className = "EmployeeClient.GetEmployeesServiceResponse")
    @Action(input = "http://service.legacy.apsh.com/EmployeeService/getEmployeesServiceRequest", output = "http://service.legacy.apsh.com/EmployeeService/getEmployeesServiceResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.legacy.apsh.com/EmployeeService/getEmployeesService/Fault/Exception")
    })
    public String getEmployeesService()
        throws Exception_Exception
    ;

}
