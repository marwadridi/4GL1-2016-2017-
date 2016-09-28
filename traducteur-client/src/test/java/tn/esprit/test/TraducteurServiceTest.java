package tn.esprit.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.services.interfaces.TraducteurServiceRemote;

public class TraducteurServiceTest {
	
	public static void main(String[] args) throws NamingException {
		
		String jndiName="traducteur-ejb/TraducteurService!tn.esprit.services"
				+ ".interfaces.TraducteurServiceRemote";
		
		Context ctx = new InitialContext();
		TraducteurServiceRemote proxy=(TraducteurServiceRemote) 
				ctx.lookup(jndiName);
		
		System.out.println(proxy.traduire("salut"));
		
	}

}
