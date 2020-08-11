package org.example.bootstrap.testdata;

import javax.ejb.Local;

@Local
public interface BlogEntryTestdata {

	String NAME = "blogEntryTestdata";
	String JNDI_NAME = "java:app/untitled-bootstrap/BlogEntryTestdataBean";

	void insert();

}
