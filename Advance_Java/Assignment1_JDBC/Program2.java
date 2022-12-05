
import java.io.*;
import java.sql.*;

class Program2
{
	public static void main(String[] args) throws IOException ,SQLException
	{
		Connection cn = null;
		PreparedStatement ps = null;
		String qry;

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class found ");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/syca221600","root","root123");
			System.out.println("connection found ");

			qry = "drop table if exists emp";
			ps = cn.prepareStatement(qry);
			ps.executeUpdate();


			qry ="create table emp(empid int primary key,empname varchar(20), salary int)";
			ps = cn.prepareStatement(qry);
			ps.executeUpdate();

			System.out.println("employee table created sucessfully !");

			ps.close();


		}
		catch(SQLException e)
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

	}	
}