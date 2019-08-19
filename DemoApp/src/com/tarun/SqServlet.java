package com.tarun;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;

@WebServlet("/sq")
public class SqServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{ 
		int k=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c:cookies)
		{
			if(c.getName().equals("k"))
					k=Integer.parseInt(c.getValue());
		}
		//int k=(int)req.getAttribute("k");
		//int k=Integer.parseInt(req.getParameter("k"));
		//HttpSession session=req.getSession();
		//session.removeAttribute("k");
		//int k=(int)session.getAttribute("k");
		PrintWriter out=res.getWriter();
		out.println("The addition is:" +k);
		
		k=k*k;
		
		out.println("Multiplication is:" +k);
	}

}
