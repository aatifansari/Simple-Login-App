package com.skywalker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skywalker.dto.User;
import com.skywalker.service.LoginService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException{
		
		//set response content type
		response.setContentType("text/html");
		
		String userName;
		String password;
		
		// fetch entered username and password from request
		userName = request.getParameter("userName");
		password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		
		// validate username and password
		boolean result=loginService.authenticate(userName, password);
		
		if(result) {
			
			User user = loginService.getUserDetails(userName);
			request.setAttribute("user", user);
			RequestDispatcher requestDispatcher=
					request.getRequestDispatcher("success.jsp");
			requestDispatcher.forward(request, response);
			return;
		}
		else {
			
			PrintWriter out =response.getWriter();
			out.print("Enter correct Username or Password");
			RequestDispatcher requestDispatcher=
					request.getRequestDispatcher("login.jsp");
			requestDispatcher.include(request, response);
			return;
			
		}
	}

}
