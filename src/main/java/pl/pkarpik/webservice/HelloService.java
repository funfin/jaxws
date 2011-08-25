package pl.pkarpik.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;



@WebService(targetNamespace="http://webservice.pkarpik.pl", name="HelloService", portName="HelloServicePort")
public interface HelloService {
	
	@WebMethod
	public String sayHello(@WebParam(name = "name") String name);
	

}
