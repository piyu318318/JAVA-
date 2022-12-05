<%@page errorPage="A7P1.jsp" %>

<html>
	
<%
	String num1 = request.getParameter("number1");
	String num2 = request.getParameter("number2");

	String operation = request.getParameter("op");	



	Float n1 = Float.valueOf(num1);
	Float n2 = Float.valueOf(num2);

	Float n3 = 0.0f;


	
	if(operation.equals("add"))
	 	n3 = n1+n2;
	if(operation.equals("sub"))
	 	n3 = n2-n1;
	if(operation.equals("mul"))
		n3 = n1*n2;
	if(operation.equals("div"))
	{
		if(n2==0)
		{
			throw new Exception ("Divide by zero");
		}
		else
			n3 = n1/n2;
	}


	out.println("result is :"+n3);

%>
	
</html>
