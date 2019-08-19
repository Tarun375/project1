package com.tarun;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		out.print("Hi..");
		//ServletContext ctx=req.getServletContext();
		//String str=ctx.getInitParameter("Phone");
		ServletConfig cfg=getServletConfig();
		String str=cfg.getInitParameter("name");
		out.println(str);
	}

}
