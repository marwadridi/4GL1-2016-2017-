package tn.esprit.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import tn.esprit.services.interfaces.TraducteurServiceRemote;

/**
 * Session Bean implementation class TraducteurService
 */
@Stateless
public class TraducteurService implements TraducteurServiceRemote {

    /**
     * Default constructor. 
     */
    public TraducteurService() {
    }
    
    @EJB
    DictionnaireService service;

	@Override
	public String traduire(String mot) {
		
		String traduction =service.getDict().get(mot);
		
		if(traduction == null)
			
		return " mot n'existe pas";
		else 
		
		return traduction;
	}

}
