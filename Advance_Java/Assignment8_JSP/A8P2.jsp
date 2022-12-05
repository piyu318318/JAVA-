

<%@ page import ="java.sql.*"%>

<%
	
	Connection cn = null;
	Statement stmt =null;
	ResultSet rs = null;	
	String qry;

	try
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/syca221600","root","root123");
		qry ="select * from Product";

		stmt = cn.createStatement();
		rs = stmt.executeQuery(qry);	
%>	
			
		<table border =1>
			<tr>
				<th>Product  id</th>
				<th>product name</th>
				<th>product price</th>
				<th>product quantity</th>
			</tr>

<%
		while(rs.next())
		{
%>		
		<tr>
			<td><% out.println(rs.getInt(1)); %></td>
			<td><% out.println(rs.getString(2)); %></td>
			<td><% out.println(rs.getInt(3)); %></td>
			<td><% out.println(rs.getInt(4)); %></td>
		</tr>
<%
		
		}


	}
	catch(SQLException e)
	{
		System.out.println(""+e.getMessage());
	}
	catch(ClassNotFoundException e)
	{

	}

	finally
	{
		try
		{
			cn.close();
		}
		catch(SQLException e)
		{

		}
	}
%>