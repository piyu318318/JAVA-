
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;


class Program2 extends HttpServlet
{
	static int i=1;
	public void dopost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException 
	{
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();

		String k = String.valueOf(i); //convert int to string

		Cookie c = new Cookie("visited",k);

		res.addCookie(c);

		String value = c.getValue();

		int j = Integer.parseInt(value);

		if(j==1)
			out.println("welcome :"+req.getRemoteAddr()+"<br>");
		else 
			out.println("welcome back:"+req.getRemoteAddr()+"<br>"); 

		i++; 

	}
}




