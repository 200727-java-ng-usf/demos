package org.example.weblogic.security;

import javax.ejb.Local;

@Local
public interface AuthenticatorService {
	String NAME = "authenticator";
	String JNDI_NAME = "java:app/untitled-ejb/AuthenticatorServiceBean";

	boolean authenticate();
}
