import java.io.*;
import java.util.*;

class Seats
{
	static double totalmain =0;
	static double subtotalmain=0;
	static double service_tax_main=0;


	void show1(String str,ArrayList a1,ArrayList b1,ArrayList c1)
	{
		Stack <String> s1 = new Stack<String>();
		int count =0;
		int countA=0;
		int countB=0;
		int countC=0;

		String[] strarr = str.split(",");
		int flag=0;//entered seat vaild or not

		for(int i=0;i<strarr.length;i++) 
		{
			String temp =strarr[i];
			if(a1.contains(temp))
			{
				count++;
			}
			else if(b1.contains(temp))
			{
				count++;
			}
			else if(c1.contains(temp))
			{
				count++;
			}
			else
			{
				flag=1;
				s1.push(temp); 
				break;
			}
		}

		if(flag == 0)
		{ 
			if(count == strarr.length)//declare to -1 if seats are avaialble
			{
				int i=0;
				String temp1;
				int replace;
				while(i<strarr.length)
				{
					temp1=strarr[i];
					if(a1.contains(temp1))
					{
						countA++;
						replace = a1.indexOf(temp1);
						a1.set(replace,"0");
					}
					else if(b1.contains(temp1))
					{
						countB++;
						replace = b1.indexOf(temp1);
						b1.set(replace,"0");
					}
					else if(c1.contains(temp1))
					{
						countC++;
						replace = c1.indexOf(temp1);
						c1.set(replace,"0");	
					}

					i++;
				}
				System.out.println(a1);
				System.out.println(b1);
				System.out.println(c1);
				System.out.println(str+" All seats are allocated ");		
			}
			else
			{
				System.out.println(s1.pop()+" Seat is not available");		
			}
		}
		else
			System.out.println(s1.pop()+" Seat is not available");		

	//	cal_show(strarr,countA,countB,countC);
	
		if(flag == 0)
		{
			countA = (320 * countA );
			countB = (280 * countB );
			countC = (250 * countC );

			double subtotal = countA + countB  + countC ; 
			double service_tax =  subtotal * 0.14;//14 per service tax  
			double Swachh_Bharat_Cess = subtotal * 0.005 ; //0.5 per swachh bharat tax
			double Krishi_Kalyan_Cess = subtotal * 0.005 ;  //0.5 per krishi kalyan tax
			double total  = subtotal + service_tax +  Swachh_Bharat_Cess + Krishi_Kalyan_Cess;
			
			System.out.println("Print: Successfully Booked - Show 1");
			System.out.println("subtotal: Rs "+ subtotal);
			System.out.println("service tax @14% Rs:"+service_tax);
			System.out.println("swachh bharat cess @0.5%: Rs:"+Swachh_Bharat_Cess);
			System.out.println("krishi kalyan cess @0.5% Rs:"+Krishi_Kalyan_Cess);
			total = Math.ceil(total);
			System.out.println("total is :"+total);

			totalmain = totalmain + total;
			subtotalmain = subtotalmain + subtotal;
			service_tax_main = service_tax_main +service_tax;
		}
	
	}

	/*
	void cal_show1(String strarr[],int countA,int countB,int countC)
	{
		double subtotal = (280 * countA ) + (320 * countB ) + (300 * countC);
		double service_tax = (subtotal * (14/100));
		double Swachh_Bharat_Cess = (subtotal * 0.5);
		double Krishi_Kalyan_Cess = (subtotal * 0.5);
		double total  = subtotal + service_tax +  Swachh_Bharat_Cess + Krishi_Kalyan_Cess;
	}
	*/
	void show2(String str,ArrayList a2,ArrayList b2,ArrayList c2)
	{
		Stack <String> s2 = new Stack<String>();
		int count = 0;
		int countA=0;
		int countB=0;
		int countC=0;

		String[] strarr = str.split(",");
		int flag=0;//entered seat vaild or not

		for(int i=0;i<strarr.length;i++) 
		{
			String temp =strarr[i];
			if(a2.contains(temp))
			{
				count++;
			}
			else if(b2.contains(temp))
			{
				count++;
			}
			else if(c2.contains(temp))
			{
				count++;
			}
			else
			{
				flag=1;
				s2.push(temp); 
				break;
			}
		}

		if(flag == 0)
		{ 
			if(count == strarr.length)//declare to -1 if seats are avaialble
			{
				int i=0;
				String temp1;
				int replace;
				while(i<strarr.length)
				{
					temp1=strarr[i];
					if(a2.contains(temp1))
					{
						countA++;
						replace = a2.indexOf(temp1);
						a2.set(replace,"0");
					}
					else if(b2.contains(temp1))
					{
						countB++;
						replace = b2.indexOf(temp1);
						b2.set(replace,"0");
					}
					else if(c2.contains(temp1))
					{
						countC++;
						replace = c2.indexOf(temp1);
						c2.set(replace,"0");	
					}

					i++;
				}
				System.out.println(a2);
				System.out.println(b2);
				System.out.println(c2);
				System.out.println("All seats are allocated ");		
			}
			else
			{
				System.out.println(s2.pop()+" Seat is not available");		
			}
		}
		else
			System.out.println(s2.pop()+" Seat is not available");		



		if(flag == 0)
		{
//			System.out.println("countA:"+ countA);
//			System.out.println("countB :"+ countB);
			countA = (320 * countA );
			countB = (280 * countB );
			countC = (250 * countC );

			double subtotal = countA + countB  + countC ; 
			double service_tax =  subtotal * 0.14;//14 per service tax  
			double Swachh_Bharat_Cess = subtotal * (0.5/100);//0.5 per swachh bharat tax
			double Krishi_Kalyan_Cess = subtotal * (0.5/100);//0.5 per krishi kalyan tax
			double total  = subtotal + service_tax +  Swachh_Bharat_Cess + Krishi_Kalyan_Cess;
	
			

			
			System.out.println("Print: Successfully Booked - Show 2");
			System.out.println("subtotal: Rs "+ subtotal);
			System.out.println("service tax @14% Rs:"+service_tax);
			System.out.println("swachh bharat cess @0.5%: Rs:"+Swachh_Bharat_Cess);
			System.out.println("krishi kalyan cess @0.5% Rs:"+Krishi_Kalyan_Cess);
			total = Math.ceil(total);
			System.out.println("total is :"+total);

			totalmain = totalmain + total;
			subtotalmain = subtotalmain + subtotal;
			service_tax_main = service_tax_main +service_tax;

		}
	}

	void show3(String str,ArrayList a3,ArrayList b3,ArrayList c3)
	{ 
		Stack <String> s3 = new Stack<String>();
		int count = 0;
		int countA=0;
		int countB=0;
		int countC=0;
		String[] strarr = str.split(",");
		int flag=0;//entered seat vaild or not

		for(int i=0;i<strarr.length;i++) 
		{
			String temp =strarr[i];
			if(a3.contains(temp))
			{
				countA++;
				count++;
			}
			else if(b3.contains(temp))
			{
				countA++;
				count++;
			}
			else if(c3.contains(temp))
			{
				countC++;
				count++;
			}
			else
			{
				flag=1;
				s3.push(temp); 
				break;
			}
		}

		if(flag == 0)
		{ 
			if(count == strarr.length)//declare to -1 if seats are avaialble
			{
				int i=0;
				String temp1;
				int replace;
				while(i<strarr.length)
				{
					temp1=strarr[i];
					if(a3.contains(temp1))
					{
						replace = a3.indexOf(temp1);
						a3.set(replace,"0");
					}
					else if(b3.contains(temp1))
					{
						replace = b3.indexOf(temp1);
						b3.set(replace,"0");
					}
					else if(c3.contains(temp1))
					{
						replace = c3.indexOf(temp1);
						c3.set(replace,"0");	
					}

					i++;
				}
				System.out.println(a3);
				System.out.println(b3);
				System.out.println(c3);
				System.out.println("All seats are allocated ");		
			}

			else
			{
				System.out.println(s3.pop()+" Seat is not available");		
			}
		}
		else
			System.out.println(s3.pop()+" Seat is not available");		


		if(flag == 0)
		{
			countA = (320 * countA );
			countB = (280 * countB );
			countC = (250 * countC );

			double subtotal = countA + countB  + countC ; 
			double service_tax =  subtotal * 0.14;//14 per service tax  
			double Swachh_Bharat_Cess = subtotal * (0.5/100);//0.5 per swachh bharat tax
			double Krishi_Kalyan_Cess = subtotal * (0.5/100);//0.5 per krishi kalyan tax
			double total  = subtotal + service_tax +  Swachh_Bharat_Cess + Krishi_Kalyan_Cess;
		
			System.out.println("Print: Successfully Booked - Show 3");
			System.out.println("subtotal: Rs "+ subtotal);
			System.out.println("service tax @14% Rs:"+service_tax);
			System.out.println("swachh bharat cess @0.5%: Rs:"+Swachh_Bharat_Cess);
			System.out.println("krishi kalyan cess @0.5% Rs:"+Krishi_Kalyan_Cess);
			total = Math.ceil(total);
			System.out.println("total is :"+total);

			totalmain = totalmain + total;
			subtotalmain = subtotalmain + subtotal;
			service_tax_main = service_tax_main +service_tax;

		}
	}
}


class TicketMovie extends Seats 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		


		ArrayList<String> a1 =new ArrayList<>();
		a1.add("A1");a1.add("A2");a1.add("A3");a1.add("A4");a1.add("A5");a1.add("A6");a1.add("A7");a1.add("A8");a1.add("A9");
		ArrayList<String> b1 =new ArrayList<>();
		b1.add("B1");b1.add("B2");b1.add("B3");b1.add("B4");b1.add("B5");b1.add("B6");
		ArrayList<String> c1 =new ArrayList<>();
		c1.add("C1");c1.add("C2");c1.add("C3");c1.add("C4");c1.add("C5");c1.add("C6");c1.add("C7");
	
		ArrayList<String> a2 =new ArrayList<>();
		a2.add("A1");a2.add("A2");a2.add("A3");a2.add("A4");a2.add("A5");a2.add("A6");a2.add("A7");
		ArrayList<String> b2 =new ArrayList<>();
		b2.add("B2");b2.add("B3");b2.add("B4");b2.add("B5");b2.add("B6");
		ArrayList<String> c2 =new ArrayList<>();
		c2.add("C1");c2.add("C2");c2.add("C3");c2.add("C4");c2.add("C5");c2.add("C6");c2.add("C7");c2.add("C8");c2.add("C9");
	
		ArrayList<String> a3 =new ArrayList<>();
		a3.add("A1");a3.add("A2");a3.add("A3");a3.add("A4");a3.add("A5");a3.add("A6");a3.add("A7");
		ArrayList<String> b3 =new ArrayList<>();
		b3.add("B1");b3.add("B1");b3.add("B2");b3.add("B3");b3.add("B4");b3.add("B5");b3.add("B6");b3.add("B7");b3.add("B8");
		ArrayList<String> c3 =new ArrayList<>();
		c3.add("C1");c3.add("C2");c3.add("C3");c3.add("C4");c3.add("C5");c3.add("C6");c3.add("C7");c3.add("C8");c3.add("C9");
		
		Seats obj = new Seats();

		while(true)
		{
			System.out.println("\nEnter the show 1 or 2 or 3, 4 for the revenue and 5 for the exit");
			int ch = Integer.parseInt(br.readLine());
			String seats;

			switch(ch)
			{
				case 1 :
					System.out.println("0 represents seat is not available.");
					System.out.println("Enter the seats : example : A1,A2,B3");
					seats = br.readLine();
					obj.show1(seats,a1,b1,c1);


					break;

				case 2 :
					System.out.println("0 represents seat is not available.");
					System.out.println("Enter the seats : example : A1,A2,B3 ");
					seats = br.readLine();
					obj.show2(seats,a2,b2,c2);
					break;

				case 3 :	
					System.out.println("0 represents seat is not available.");
					System.out.println("Enter the seats : example : A1,A2,B3 ");
					seats = br.readLine();
					obj.show3(seats,a3,b3,c3);			
					break;

				case 4:
					
					double service_tax_on_revenue = subtotalmain * 0.005;//0.5 per 
					double Swachh_Bharat_on_revenue =   subtotalmain * 0.005;//0.5 per 

					System.out.println("revenue Rs : "+subtotalmain);
					System.out.println("service tax Rs :" +service_tax_main); 
					System.out.println("service tax Rs :" +service_tax_on_revenue); 
					System.out.println("service tax Rs :" + Swachh_Bharat_on_revenue); 
					System.out.println("\n");

				case 5:System.exit(0); 		
			}
		}
	}
}
