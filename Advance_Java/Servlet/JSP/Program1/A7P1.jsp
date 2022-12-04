<%@ page errorPage="error.jsp" %>

<html>

<head> 
	<title>Result</title>
</head>

<body>
<%
	String num1 = request.getParameter("n1");
	String num2 = request.getParameter("n2");
	Float n3 = 0.0f;
	
	if(num1.matches("[0-9.]*") && num2.matches("[0-9.]*"))
	{
		Float n1 = Float.valueOf(num1);
		Float n2 = Float.valueOf(num2);
		
		String operation = request.getParameter("op");
		
		if(operation.equals("add"))
			n3 = n1+n2;
		if(operation.equals("sub"))
			n3 = n1-n2;
		if(operation.equals("mul"))
			n3 = n1*n2;
		if(operation.equals("div"))
		{
			if(n2==0)
				throw new Exception("Divide by zero");
			else
				n3 = n1/n2;
		}
	}
	else
		throw new Exception("Please enter numbers only");
		
	out.println("Result : "+n3);
%>
<br><a href="A7Q1.html">Go Back</a>
</body>

</html>
		
