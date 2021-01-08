package nice.flowershop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nice.flowershop.model.User;
import nice.flowershop.oda.UserODA;

import com.alibaba.fastjson.JSON;

/**
 * Servlet implementation class Registration
 */

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Registration() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw= response.getWriter();
		UserODA dao=new UserODA();
			User myUser=new User( request.getParameter("fullname"),
					request.getParameter("gender"),
					request.getParameter("birthday"),
					request.getParameter("username"),
					request.getParameter("email"),
					request.getParameter("phonenumbeer"),
					request.getParameter("passwrd")
					);
			
	
		if (UserODA.login(myUser)) 
		{
			String userExists="true";
			String json=JSON.toJSONString(userExists);
			pw.print(json);
			
		}
		else {
			//pw.print("new user");""
			if(dao.addUser(myUser)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", myUser.getUsername()+dao.getuserId(myUser,UserODA.login(myUser)));
			pw.print("new user");
			}
		}
	
	
			
				//b = dao.addUser(myUser);
			
				
				
			}
			

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
