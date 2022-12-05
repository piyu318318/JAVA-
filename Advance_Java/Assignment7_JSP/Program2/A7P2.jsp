

<%@ page import ="java.util.*" %>
<%@ page import="java.text.*" %>

<html>

<%
	String name = request.getParameter("username");

	Date dt = new Date();



	SimpleDateFormat fmt1 = new SimpleDateFormat("MM-dd-yyyy");
	SimpleDateFormat fmt2 = new SimpleDateFormat("hh:mm:ss");
	SimpleDateFormat fmt3 = new SimpleDateFormat("H");

	int time = Integer.parseInt(fmt3.format(dt));


	out.println("<br>Hello :"+name);
	out.println("<br>Date is : "+fmt1.format(dt));
	out.println("<br>Time is : "+fmt2.format(dt));

	if(time>6 && time <12)
		out.println("<br>Good morning : <br>"); 
	else if(time>12 && time <16)
		out.println("<br>Good afternoon : <br>");
	else if(time>16 && time <20)
		out.println("<br>Good evening : <br>");
	else if(time>20 && time <=24)
		out.println("<br>Good night : <br>");

%>




</html>
