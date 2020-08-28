package com.example.sessionservlet;

import com.example.model.SuperVillain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//THIS STUFF HAS NOTHING TO DO WITH SESSIONS
		resp.getWriter().write("<header>SessionServlet! doGet</header>");
		System.out.println("in session doGet");

		SuperVillain dannyboy = new SuperVillain("Danny Boy", "Technopath", 250_000);

		//SESSION CODE HERE
		//SESSION SYNTAX HERE
		//this method will get the current sessiopn OR create one if there is no session
		//req.getSession(false); will return null if there is no sesion, it will NOT create one
		HttpSession session = req.getSession();

		session.setAttribute("currentVillain", dannyboy);
		resp.getWriter().write("Danny boy is on the loose! ...");

		//THIS STUFF HAS NOTHING TO DO WITH SESSIONS
		resp.getWriter().write("<header>SessionServlet! doGet</header>");
		System.out.println("in session doGet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("myname");
		String superpower = req.getParameter("mysuperpower");
		int bounty = Integer.parseInt(req.getParameter("mybounty"));

		SuperVillain tempVill=
				new SuperVillain(name, superpower, bounty);

		HttpSession session = req.getSession();
		session.setAttribute("currentVillain", tempVill);

		PrintWriter out = resp.getWriter();
		out.println("The CUSTOM villan " + name + " is on the loose.....");

		resp.getWriter().write("<header>SessionServlet! doPost</header>");
		System.out.println("in session doPost");


	}
}
