//prod_id name price quantity

import java.io.*;
import java.sql.*;
import java.util.*;

class Prog3
{
	public static void main(String[] args)throws IOException,SQLException 
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Connection cn = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		Statement stmt = null;
		String qry;
		ArrayList<Integer> a1 = new ArrayList<Integer>();

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Classs found");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/syca221600","root","root123");
			System.out.println("Connection found");

			while(true)
			{
				System.out.println("Enter your choice : 1.Add 2.Update 3.Search 4.Exit");
				int ch = Integer.parseInt(br.readLine());

				switch(ch)
				{
					case 1:

						System.out.println("Enter product id to add .");
						int prod_id = Integer.parseInt(br.readLine());

						if(!a1.contains(prod_id))
						{
							qry ="insert into Product(?,?,?,?)";
							ps = cn.prepareStatement(qry); 

							System.out.println("Enter name :");
							String name = br.readLine();
							System.out.println("Enter price :");
							int price = Integer.parseInt(br.readLine());
							System.out.println("Enter quantity :");
							int quantity = Integer.parseInt(br.readLine());

							ps.setInt(1,prod_id);
							ps.setString(2,name);
							ps.setInt(3,price);
							ps.setInt(4,quantity);

							ps.executeUpdate();

							System.out.println("product added sucussefully");

						}

						break;
					case 2:
						int flag=0;

						System.out.println("Enter product id : ");
						int delete = Integer.parseInt(br.readLine());
							
						qry ="select * from Product";
						stmt = cn.createStatement();
						rs = stmt.executeQuery(qry);

						while(rs.next())
						{
							qry = "delete from Product where prod_id= prod_id";

							int deleteproduct = rs.getInt(1);

							if(delete ==  deleteproduct)
							{
								ps = cn.prepareStatement(qry);
								ps.executeUpdate();

								System.out.println("employee deleted sucessfully.");
								flag=1;
								//a1.remove(Integer.valueOf(prod_id));
							}

						}

						if(flag ==0)
							System.out.println("product doest exist");

						break;
					case 3:

						System.out.println("Enter Product id to search");
						int search = Integer.parseInt(br.readLine());


						qry ="select * from Product";
						stmt = cn.createStatement();
						rs = stmt.executeQuery(qry);

						while(rs.next())
						{
							int checksearch = rs.getInt(1);
							if(search == checksearch)
							{
								System.out.println("product id :"+rs.getInt(1)+"\tname is "+rs.getString(2)+"\tprice :"+rs.getInt(3)+"quantity :"+rs.getInt(4));
							}
						}


						break;
					case 4:
						break;	
				}
			}


		}
		catch(SQLException e)
		{
			System.out.println("");
		}
		catch(ClassNotFoundException e)
		{

		}

	}
}