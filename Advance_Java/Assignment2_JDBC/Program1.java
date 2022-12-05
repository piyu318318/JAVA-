
import java.io.*;
import java.util.*;
import java.sql.*;

class Program1
{
	public static void main(String[] args) throws SQLException,IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList <Integer> a1 = new ArrayList<>();
		Connection cn = null;
		ResultSet rs = null;
		PreparedStatement ps =null;
		Statement stmt = null;
		String qry;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/syca221600","root","root123");
			System.out.println("Connection found");

			while(true)
			{
				System.out.println("Enter your choice :");
				System.out.println("1.Insert 2.delete 3.display 4.Exit");
				int ch = Integer.parseInt(br.readLine());

				switch(ch)
				{
					case 1:
							
							System.out.println("Enter employee id :");
							int empid = Integer.parseInt(br.readLine());

							if(!a1.contains(empid))
							{
								System.out.println("Enter employee name :");
								String ename = br.readLine();
								System.out.println("Enter employee salary :");
								int salary = Integer.parseInt(br.readLine());

								qry = "insert into emp values(?,?,?)";
								ps = cn.prepareStatement(qry);
								
								ps.setInt(1,empid);
								ps.setString(2,ename);
								ps.setInt(3,salary);

								ps.executeUpdate();

								a1.add(empid);
								ps.close();

								System.out.println("record inserted sucessfully");

							}
							else
							{
								System.out.println("record already exist ");
							}


							break;
					case 2:
							int flag =0;

							System.out.println("Enter employee id to delete record :");
							int delete = Integer.parseInt(br.readLine());

							qry ="select * from emp";
							stmt = cn.createStatement();
							rs = stmt.executeQuery(qry); 

							while(rs.next())
							{
								int checkdelete = rs.getInt(1);

								if(checkdelete == delete)
								{
									qry = "delete from emp where empid ='"+delete+"'";
									ps = cn.prepareStatement(qry);
									ps.executeUpdate();
									//a1.remove(Integer.valueOf(empid));
									flag=1;
								}
							}

							if(flag == 1)
								System.out.println("employee deleted sucessfully");
							else 
								System.out.println("employee doesnt exist in the table");

							ps.close();
						break;
					
					case 3:

						qry = "select * from emp";
						stmt = cn.createStatement();
						rs = stmt.executeQuery(qry);

						while(rs.next())
						{
							System.out.println("Id :"+rs.getInt(1)+"name :"+rs.getString(2)+"salary :"+rs.getInt(3));
						}


						break;
					case 4:
						System.exit(1);
						break;
				}
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
		

	}
}




