

<%@ page import="java.sql.*" %>

<%
	
	Connection cn = null;
	ResultSet rs=  null;
	Statement stmt = null;
	String qry;

	try
	{

		String radio = request.getParameter("radio");



		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/syca221600","root","root123");

		if(radio.equals("op1"))
		{
			qry = "select e.emp_name from employee e, project p, employee_project ep where e.emp_no = ep.emp_no and  p.Project_name = ep.Project_nameand p.Project_name ="Inventory control"";

			stmt = cn.createStatement();
			rs = stmt.executeQuery(qry);
			
			%>
			
			<table border =1>
				<tr>
					<th>Employee number:</th>
					<th>Employee name :</th>
					<th>Employee salary :</th>
				</tr>
<%
			while(rs.next())
			{
%>
				<tr>
					<td><% out.println(rs.getInt(1)); %></td>
					<td><% ouot.println(rs.getString(2)); %></td>
					<td><% out.println(rs.getFloat(3)); %></td>
				</tr>
<%				
			}
%>
			</table>
<%

			if(radio.equals("op2"))
			{
				qry ="select e.emp_name from employee e, Department d where e.dept_no = d.dept_no and dept_name="computer"";

				stmt = cn.createStatement();
				rs = stmt.executeQuery(qry);
%>
				
				<table border=1>
					<tr>
						<th>Employee number:</th>
						<th>Employee name :</th>
						<th>Employee salary</th>
					</tr>
<%		
				while(rs.next())
				{
%>					
					<% out.println(rs.getInt(1)); %>
					<% out.println(rs.getString(2)); %>
					<% out.println(rs.getFloat(3)) %>
<%

				}
%>

			</table>
			
<%
			}


		}

	}
	catch(SQLExcpetion e)
	{
		System.out.println(" "+e.getMessage());
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






