//telno  name address

import java.io.*;
import java.util.*;
import java.sql.*;

class Program2
{
	public static void main(String[] args)throws IOException,SQLException 
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		ArrayList <String> a1 = new ArrayList<>();

		Connection cn = null;
		ResultSet rs= null;
		PreparedStatement ps = null;
		Statement stmt = null;
		String qry;


		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class  found");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/syca221600","root","root123");
			System.out.println("Connection found");

			while(true)
			{

				System.out.println("Enter your choice : 1.Insert 2.Delete 3.search 4.Display all");
				int ch = Integer.parseInt(br.readLine());

				switch(ch)
				{
					case 1:

						System.out.println("Enter telephone number :");
						String telno = br.readLine();

						if(!a1.contains(telno))
						{
							qry = "insert into telephone values(?,?,?)"; 
							ps = cn.prepareStatement(qry);

							System.out.println("Enter name :");
							String name = br.readLine();
							System.out.println("Enter address :");
							String address = br.readLine();

							ps.setString(1,telno);
							ps.setString(2,name);
							ps.setString(3,address);

							ps.executeUpdate();

							a1.add(telno);

							System.out.println("entry added sucessfully.");

						}
						else
							System.out.println("telephone number not exist !");

						ps.close();

						break;

					case 2:
							int flag =0;

							System.out.println("Enter tel number to delete :");
							String delete  = br.readLine();

							qry ="select * from telephone";
							stmt = cn.createStatement();
							rs = stmt.executeQuery(qry);

							while(rs.next())
							{
								String checkdelete = rs.getString(1);
								if(checkdelete.equals(delete))
								{
									qry ="delete from telephone where telno='"+delete+"'";
									ps = cn.prepareStatement(qry);
									ps.executeUpdate();
									flag=1;

									a1.remove(Integer.valueOf(delete));
								}
							}

							if(flag == 1)
								System.out.println("record deleted sucessfully.");
							else
								System.out.println("record does not exist.");

							ps.close();

							break;
					case 3:
							System.out.println("Enter tel number to search :");
							String search  = br.readLine();

							qry ="select * from telephone";
							stmt = cn.createStatement();
							rs = stmt.executeQuery(qry);

							while(rs.next())
							{
								String checksearch = rs.getString(1);
	
								if(checksearch.equals(search))
								{
									System.out.println("\ntelephone number is :"+rs.getString(1)+"\t\tname is :"+rs.getString(2)+"\t\taddress is :"+rs.getString(3));
								}
							}

							rs.close();

							break;
					case 4:
							qry ="select * from telephone";
							stmt = cn.createStatement();
							rs = stmt.executeQuery(qry);

							while(rs.next())
							{
								System.out.println("\ntelephone number is :"+rs.getString(1)+"\t\tname is :"+rs.getString(2)+"\t\taddress is :"+rs.getString(3));
							}

							rs.close();
						break;

					case 5:
						System.exit(1);
						break;
				}

			}
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