package org.example.weblogic;

import javax.ejb.Local;

import org.example.model.Comment;

@Local
public interface CommentService {

	String NAME = "commentService";
	String JNDI_NAME = "java:app/untitled-ejb/CommentServiceBean";

	Comment getInstance();

	void save();

	void remove();

}
