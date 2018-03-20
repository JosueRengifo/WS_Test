package Servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Unicomfacauca
 */
@WebService(serviceName = "WS_Test")
public class WS_Test {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "sumar")
    public int sumar(@WebParam(name = "num1") int num1,@WebParam(name = "num2") int num2) {
        return  num1 + num2;
    }
}
