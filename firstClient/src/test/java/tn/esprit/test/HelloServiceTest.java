package tn.esprit.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.interfaces.HelloWorldRemote;

public class HelloServiceTest {

	public static void main(String[] args) {

		String moduleName = "firstEJB";
		String implClass = "HelloWorldService";
		String interfaceName = "tn.esprit.interfaces.HelloWorldRemote";
		String jndiName = moduleName + "/" + implClass + "!" + interfaceName;

		Context ctx;
		try {
			ctx = new InitialContext();
			HelloWorldRemote proxy = (HelloWorldRemote) ctx.lookup(jndiName);

			System.out.println(proxy.sayHello("hello"));
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
