package org.example.bootstrap;

import javax.ejb.Local;

@Local
public interface ApplicationBootstrap {
  String NAME = "applicationBootstrap";
  String JNDI_NAME = "java:app/untitled-bootstrap/ApplicationBootstrapBean";

  void init();
}