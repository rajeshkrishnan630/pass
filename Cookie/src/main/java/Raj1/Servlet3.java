package Raj1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/ser3")

public class Servlet3 extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		PrintWriter out=res.getWriter();
		String e=req.getParameter("mob");
		String f=req.getParameter("email");
		
		 Cookie[] cookies=req.getCookies();
		 out.println("Hi");
		out.println("username:"+cookies[0].getValue());
		out.println("age:"+cookies[1].getValue());
		out.println("qualification:"+cookies[2].getValue());
		out.println("designation:"+cookies[3].getValue());
		out.println("mobile num:"+e);
		out.println("email address:"+f);
		
	}
}

