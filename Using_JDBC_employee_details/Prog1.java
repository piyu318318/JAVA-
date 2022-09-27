//executeQuery = select. ResultSet  is the returntype od thois method will return result into object. 
/*executeUpdate = insert,update,delete. returns integer how many rows inserted,deleted,updated etc.
thats why we do use prepareStatement.
*/
//connnection is interface and drivermanager is class. In drivermanager we have getConnection method. 
//prepareStatement function madhe query takto.
//createStatement function madhe query takat nahi 


import java.sql.*;
import java.util.*;
import java.io.*;

class Prog1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Connection cn = null;
		PreparedStatement ps = null;
		Statement stmt = null;
		ResultSet rs = null;
		String qry;
		int del_id =0;

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found ");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/syca221600","root","root123");
			System.out.println("Conncetion found");

			ArrayList<Integer> a1 = new ArrayList<Integer>();

			qry = "select * from emp";
			stmt = cn.createStatement();
			rs = stmt.executeQuery(qry);

			while(rs.next())
			{
				int temp = rs.getInt(1);
				a1.add(temp);
			}

			while(true)
			{
				System.out.println("\nEnter your choice : 1.Insert 2.Delete 3.Display 4.Delete all element 5.Exit");
				int ch = Integer.parseInt(br.readLine());

				switch(ch)
				{
					case 1:
						
						System.out.println("Enter a employee id :");
						int empid;

						while(true)
						{
							empid = Integer.parseInt(br.readLine());
							if(empid>0)
								break;
							else
								System.out.println("pls enter valid id");
						}

						if(!a1.contains(empid))
						{
								qry = "insert into emp values(?,?,?)";
							ps = cn.prepareStatement(qry);
							
							
							System.out.println("Enter a employee name :");
							String ename = br.readLine();
							System.out.println("Enter a employee salary :");
							int salary =  Integer.parseInt(br.readLine());

							ps.setInt(1,empid);
							ps.setString(2,ename);
							ps.setInt(3,salary);
							ps.executeUpdate();

							a1.add(empid);
							ps.close();

							System.out.println("Record inserted sucessfully.");
						}
						else
							System.out.println("Record already exist.");


						
						break;

					case 2:
						int flag=0;

						System.out.println("Enter employee id :");
						int id = Integer.parseInt(br.readLine());
						qry = "select * from emp";
						stmt = cn.createStatement();
						rs = stmt.executeQuery(qry); 
						
						while(rs.next())
						{
							del_id = rs.getInt(1);
							if(del_id == id)
							{
								qry = "delete from emp where empid ='"+id+"' ";
								ps = cn.prepareStatement(qry);
								ps.executeUpdate();

								a1.remove(Integer.valueOf(id));

								
								flag=1;
							}
						}

						if(flag ==1 )
							System.out.println("employee record Deleted :");
						else
							System.out.println("employee record not found :");

						stmt.close();
						ps.close();
						flag =0;
						break;

					case 3:
						
						qry ="select * from emp";
						stmt = cn.createStatement();

						int size = a1.size();



						if(size > 0)
						{
							rs= stmt.executeQuery(qry);
							
							System.out.println("\nemployee id"+"\t\t"+"employee name"+"\t\t"+"employee salary");
							while(rs.next())
							{
								System.out.println(rs.getInt(1)+"\t\t\t"+rs.getString(2)+"\t\t\t"+rs.getInt(3));
							}


							stmt.close();
						} 
						else
							System.out.println("An Empty");

						break;

					case 4:
						qry = "truncate emp";

						int size1  = a1.size();

						if(size1>0)
						{
							stmt = cn.createStatement();
							stmt.execute(qry);
							a1.clear();
							System.out.println("All records deleted.");
						}
						else
							System.out.println("Empty table");

						break;

					case 5:
						System.exit(0);

					default :
						System.out.println("\nEntere valid choice :");
						break; 
				}
			}

		}

		catch(SQLException e)
		{
			System.out.println(" "+e.getMessage());
		}
		catch(ClassNotFoundException e){}

		finally
		{
			try
			{
				cn.close();
			}
			catch(SQLException e){}
		}
	}	
}
