
<%@ page import="java.sql.*"%>


<html>
	<head>
		<body>

<%
	Connection cn = null;
	DatabaseMetaData dmd = null;
	ResultSet rs= null;
	ResultSetMetaData rsmd = null;
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/syca221600","root","root123");

		dmd  = cn.getMetaData();

%>

	<h1>Database Information</h1>
	<table border=1>
		<tr>
			<th>Srno</th>
			<th>Database info</th>
			<th>output</th>
		</tr>

		<tr>
			<td>1</td>
			<td>Username :</td>
			<td><% out.println(dmd.getUserName()); %></td>
		</tr>

		<tr>
			<td>2</td>
			<td>Driver Name</td>
			<td><% out.println(dmd.getDriverName()); %></td>
		</tr>

		<tr>
			<td>4</td>
			<td>Driver version</td>
			<td><% out.println(dmd.getDriverVersion()); %></td>
		</tr>

		<tr>
			<td>5</td>
			<td>Database product name :</td>
			<td><% out.println(dmd.getDatabaseProductName()); %></td>
		</tr>


		<tr>
			<td>5</td>
			<td>Database product version :</td>
			<td><% out.println(dmd.getDatabaseProductVersion()); %></td>
		</tr>

	</table>
<%

	}
	catch(SQLException e)
	{
		out.println(" "+e.getMessage());
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

</html>

