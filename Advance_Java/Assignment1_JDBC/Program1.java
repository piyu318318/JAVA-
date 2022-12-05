import java.io.*;
import java.sql.*;


class Program1
{
	public static void main(String[] args) throws IOException,SQLException
	{
		Connection cn = null;
		DatabaseMetaData dmd =null;
		ResultSet rs =null;

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");

			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/syca221600","root","root123");
			System.out.println("Connection found ");

			dmd = cn.getMetaData();

			System.out.println("\nDatabase Information :");
			System.out.println(" "+dmd.getUserName());
			System.out.println(" "+dmd.getDriverName());
			System.out.println(" "+dmd.getDriverVersion());
			System.out.println(" "+dmd.getDatabaseProductName());
			System.out.println(" "+dmd.getDatabaseProductVersion());



		}
		catch(SQLException e)
		{

		}
		catch(ClassNotFoundException e)		
		{}

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
