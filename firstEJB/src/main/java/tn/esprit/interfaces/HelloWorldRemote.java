package tn.esprit.interfaces;

import javax.ejb.Remote;

@Remote
public interface HelloWorldRemote {
	
	String sayHello(String mot);

}
