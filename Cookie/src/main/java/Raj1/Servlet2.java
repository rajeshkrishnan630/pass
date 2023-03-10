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
@WebServlet("/ser2")

public class Servlet2 extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		PrintWriter out=res.getWriter();
		String c=req.getParameter("quali");
		String d=req.getParameter("desig");
		

		Cookie cookie3=new Cookie("c", c);
		Cookie cookie4=new Cookie("d", d);
		
		out.println("From Sabarinath");
		
		res.addCookie(cookie3);
		res.addCookie(cookie4);
		
		
		req.getRequestDispatcher("/form3.html").forward(req,res);
	
	
	
	}
}
