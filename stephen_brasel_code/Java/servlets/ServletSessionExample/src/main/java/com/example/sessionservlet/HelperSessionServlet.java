package com.example.sessionservlet;

import com.example.model.SuperVillain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class HelperSessionServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//SESSION SYNTAX
		HttpSession session = req.getSession();;
		SuperVillain villain = (SuperVillain) session.getAttribute("currentVillain");

		//NON SESSION SYNTAX
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");

		if(villain != null){
			out.println("We've captured the villain!");
			out.println("<header>Villain Name: "+villain.getName()+"</header><br>");
			out.println("<b>\tSuperpower: "+villain.getSuperpower()+"</b><br>");
			out.println("<i>\tVillain Name: "+villain.getBounty()+"</i><br>");
		}else{
			out.println("Can't find any villains.....");
		}
		out.println("</body></html>");

		resp.getWriter().write("<header>HelperSessionServlet! doGet</header>");
		System.out.println("in helper session doGet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("<header>HelperSessionServlet! doPost</header>");
		System.out.println("in helper session doPost");

		//to invalidate a session (aka delete a session's values
		req.getSession().invalidate();
	}
}
