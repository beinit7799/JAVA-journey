package com.servlets;

import java.awt.desktop.UserSessionEvent;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.service.UserService;
import com.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("SignupForm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get data from SignupForm.jsp
		String fn = request.getParameter("fname");
		String ln = request.getParameter("lname");
		String un = request.getParameter("username");
		String pass = request.getParameter("password");
		
		//send user data into database
		User u = new User();
		u.setFname(fn);
		u.setLname(ln);
		u.setUsername(un);
		u.setPassword(pass);
		
		UserService us = new UserServiceImpl();
		us.signup(u);
		
		request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
		
		
		//SEND DATA FROM SERVLET TO JSP
		/*request.setAttribute("fn", fn);
		request.setAttribute("ln", ln);
		request.setAttribute("un", un);
		request.setAttribute("pass", pass);*/



		
		request.getRequestDispatcher("Profile.jsp").forward(request, response);
	}

}
