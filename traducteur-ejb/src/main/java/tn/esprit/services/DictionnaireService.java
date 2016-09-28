package tn.esprit.services;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import tn.esprit.services.interfaces.DictionnaireServiceRemote;

/**
 * Session Bean implementation class DictionnaireService
 */
@Singleton
@LocalBean
public class DictionnaireService implements DictionnaireServiceRemote {

    /**
     * Default constructor. 
     */
    public DictionnaireService() {
    		System.out.println("je suis créé");
    }
    
  private Map<String, String> dict ;
  
  public Map<String, String> getDict() {
	return dict;
}
  public void setDict(Map<String, String> dict) {
	this.dict = dict;
}
  
  @PostConstruct
  public void init(){
	  
	  dict = new HashMap<>();
	  dict.put("salut", "hello");
	  dict.put("bienvenue", "welcome");
	  dict.put("bonjour", "good morning");
	}
  
  
  
  

}
