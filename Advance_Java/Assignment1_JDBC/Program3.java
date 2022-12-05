
import java.sql.*;

class Program3
{
	public static void main(String[] args) throws SQLException
	{
		Connection cn = null;
		ResultSetMetaData metadata = null;
		ResultSet rs = null;
		Statement stmt = null;
		String qry;

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class found ");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/syca221600","root","root123");
			System.out.println("connection  found !");


			System.out.println("cloumns details");

			qry ="select * from emp";
			
			stmt = cn.createStatement();
			rs = stmt.executeQuery(qry);
			metadata = rs.getMetaData();

			System.out.println("\ncloumn name \ncoulumn type\ncoulumn size");
			for (int i=1;i<=metadata.getColumnCount() ;i++ ) 
			{
				System.out.println(metadata.getColumnLabel(i)+"\t\t"+metadata.getColumnTypeName(i)+"\t\t"+metadata.getColumnDisplaySize(i));	
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
			catch(SQLException	 e)
			{

			}
		}		
	}
}
