package com.example.sessionservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.model.SuperVillain;

public class SessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//what can we put in this method? ANYTHING
		// once we've gotten to this method....it's just a normal everyday Java method.
		
		//THIS STUFF HAS NOTHING TO DO WITH SESSIONS
		SuperVillain dannyboy =
				new SuperVillain("Danny Boy", "Technopath", 250_000);
		
		//SESSION SYNTAX HERE
		
		//this method will get the current session OR create one if there is no session
		//req.getSession(false); will return null if there is no session, it will NOT create one
		HttpSession session = req.getSession();
		
		session.setAttribute("currentVillain", dannyboy);
		
		//THIS STUFF HAS NOTHING TO DO WITH SESSIONS
		System.out.println("in session doGet");
		resp.getWriter().write("Danny Boy is on the loose......");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//extracting form data
		String name = req.getParameter("myname");
		String superpower= req.getParameter("mysuperpower");
		int bounty = Integer.parseInt(req.getParameter("mybounty"));
		
		//regular java stuff
		SuperVillain tempVill=
				new SuperVillain(name, superpower, bounty);
		
		//session syntax
		HttpSession session = req.getSession();
		session.setAttribute("currentVillain", tempVill);
		
		//print writer
		PrintWriter out = resp.getWriter();
		out.println("The CUSTOM villain" + name + " is on the loose......");
		
		System.out.println("in session doPost");
	}
}
