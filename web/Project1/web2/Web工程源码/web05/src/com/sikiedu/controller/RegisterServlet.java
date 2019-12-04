package com.sikiedu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sikiedu.service.UserService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register_do")
public class RegisterServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int age=Integer.parseInt(request.getParameter("age"));
		String sex = request.getParameter("sex");
		UserService userService= new UserService();
		boolean isSuccess =userService.register(username, password, age, sex);
		if(isSuccess) {
			request.setAttribute("msg", "<font color='green'>ע��ɹ������¼��</font>");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "<font color='red'>�û����ظ�����������д!</font>");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		}
	}

}
