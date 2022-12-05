//write a servlet which accept the user name from html page and returns a message 
// which greets the user also display current date

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.Date;
import java.text.*;

public class Program1 extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		String username = req.getParameter("name");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("Welcome "+username);
		
		Date dt = new Date();
		//String pattern = "MM-dd-yyyy";
		//SimpleDateFormat fmt = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		SimpleDateFormat fmt = new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat fmt2 = new SimpleDateFormat("hh:mm:ss");
		SimpleDateFormat fmt1 = new SimpleDateFormat("H");

		int tm = Integer.parseInt(fmt1.format(dt));
		
		//out.println("<br>Date / Time: "+fmt.format(dt));
		
		out.println("<br>Date: "+fmt.format(dt));
		out.println("<br>Time: "+fmt2.format(dt));

		if(tm>6 && tm<12)
			out.println("<br>Good Morning "+username);
		else if(tm>=12 && tm<16)
			out.println("<br>Good Afternoon "+username);
		else if(tm>=16 && tm<20)
			out.println("<br>Good Evening "+username);
		else
			out.println("Good Night "+username);
		out.println("<br><a href=greet.html>Go Back</a>");
		out.close();
	}
}








/*
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.io.*;

class Program1 extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");

		PrintWriter out = res.getWriter(); 

		String name = req.getParameter("name");

		Calendar c= Calendar.getInstance();

		int hr = c.get(Calendar.HOUR_OF_DAY);
		String greet="";

		if(hr<12 && hr>0)
			greet="Good morning";
		else if(hr>12 &&hr<=17)
			greet ="good afternoon";
		else if(hr>17 && hr<=19)
			greet="good evening";
		else
			greet="good night";

		out.println(greet+" "+name);

		out.close();
		
	}
}
*/
