package pl.pkarpik.webservice.impl;

import javax.jws.WebService;

import pl.pkarpik.webservice.HelloService;

@WebService(endpointInterface = "pl.pkarpik.webservice.HelloService")
public class HelloServiceImpl implements HelloService 
{

	public String sayHello(String imie) {
		return "Hello "+imie;
	}

}
