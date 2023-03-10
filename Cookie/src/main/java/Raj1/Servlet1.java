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
@WebServlet("/ser1")

public class Servlet1 extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		PrintWriter out=res.getWriter();
		String a=req.getParameter("username");
		String b=req.getParameter("userage");
		
		Cookie cookie1=new Cookie("a", a);
		Cookie cookie2=new Cookie("b", b);
		
		res.addCookie(cookie1);
		res.addCookie(cookie2);
		out.println("hello");
		
		
		
		 
		req.getRequestDispatcher("/form2.html").forward(req,res);
		
	}

}
