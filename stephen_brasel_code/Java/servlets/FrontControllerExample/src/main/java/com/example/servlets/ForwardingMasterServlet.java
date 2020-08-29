package com.example.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ForwardingMasterServlet extends HttpServlet {
//	boolean b = false;
//	Boolean B = false;
//	char c = 'c';
//	Character C = 'C';
//	//string is not a primitive type.
//	String str = "Str";
//	short s = 1;
//	Short S = 1;
//	byte by = 2;
//	Byte By = 2;
//	int i = 3;
//	Integer I = 3;
//	long l = 4;
//	Long L = 4L;
//	float f = 1.0f;
//	Float F = 1.0F;
//	double d = 2.0d;
//	Double D = 2.0D;
//
//	public void doesNothing(){
//		// = *= -= += /= %= &= |= ~=
//		b = B;
//		b = c;
//		b = C;
//		b = str;
//		b = s;
//		b = S;
//		b = by;
//		b = By;
//		b = i;
//		b = I;
//		b = l;
//		b = L;
//		b = f;
//		b = F;
//		b = D;
//		b = d;
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(RequestHelper.process(req)).forward(req,resp);
//		resp.getWriter().write("in get");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(RequestHelper.process(req)).forward(req,resp);
//		resp.getWriter().write("in post");
	}
}
