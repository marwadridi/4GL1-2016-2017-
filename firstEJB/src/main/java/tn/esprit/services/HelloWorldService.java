package tn.esprit.services;

import javax.ejb.Stateless;

import tn.esprit.interfaces.HelloWorldRemote;
import tn.esprit.interfaces.HelloWorldLocal;

@Stateless
public class HelloWorldService implements HelloWorldLocal,
HelloWorldRemote{

	@Override
	public String sayHello(String mot) {
		
		return mot;
	}
	
	
	
	

}
