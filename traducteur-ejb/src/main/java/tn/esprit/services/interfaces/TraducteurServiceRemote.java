package tn.esprit.services.interfaces;

import javax.ejb.Remote;

@Remote
public interface TraducteurServiceRemote {
	
	String traduire(String mot);

}
