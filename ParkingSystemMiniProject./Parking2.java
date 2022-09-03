import java.io.*;
import java.util.*;//for arraylist import util 

class Vehicle
{
	String vehiclenumber;
	int vehicletype;

	Vehicle(String vehiclenumber,int vehicletype)
	{
		this.vehiclenumber=vehiclenumber;
		this.vehicletype=vehicletype;
	}
	void display()
	{
		System.out.println("vehicle number is :"+vehiclenumber);
		System.out.println("vehicle type is :"+vehicletype);
	}
}

class Slot extends Vehicle
{
	int selectslot;

	Slot(String vehiclenumber,int vehicletype,int selectslot)
	{
		super(vehiclenumber,vehicletype);
		this.selectslot=selectslot;
	}

	void display()
	{
		super.display();
		System.out.println("selected vehicle slot is :"+selectslot);
	}
}

class Time extends Slot
{

	int charges;
	int time;
	int paymentmode;
	Time(String vehiclenumber,int vehicletype,int selectslot,int time)
	{
		super(vehiclenumber,vehicletype,selectslot);	
		this.time=time;
	}

	void display()
	{
		super.display();
		System.out.println("time of the vehicle is :"+time);
	
		if(time ==1)
			charges =80;
		else if(charges == 2)
			charges =100;
		else
			charges = 120; 

		System.out.println("charges of vehicle is  :"+charges);
	}
}


class Parking2 
{
	public static void main(String args[])throws IOException
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<String> a2 = new ArrayList<String>();//type of parking
		ArrayList<String> a3 = new ArrayList<String>();//payment mode


		String vehiclenumber;
		int vehicletype;
		int selectslot;
		int paymentmode;
		int time;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter capacity of parking :");
		int n= Integer.parseInt(br.readLine());
		Time T[] = new Time[n];

		for (int i=0;i<n;i++) 
		{
			System.out.println("Enter vehicle number :");

			while(true)
			{
				vehiclenumber = br.readLine();

				if(vehiclenumber.length()==10)
				{
					int j=0;
					if(Character.isLetter(vehiclenumber.charAt(j)) && Character.isLetter(vehiclenumber.charAt(j+1)))
					{
						if(Character.isDigit(vehiclenumber.charAt(j+2)) && Character.isDigit(vehiclenumber.charAt(j+3)))
						{
							if(Character.isLetter(vehiclenumber.charAt(j+4)) && Character.isLetter(vehiclenumber.charAt(j+5)))
							{
								if(Character.isDigit(vehiclenumber.charAt(j+6)) && Character.isDigit(vehiclenumber.charAt(j+7)) && Character.isDigit(vehiclenumber.charAt(j+8)) && Character.isDigit(vehiclenumber.charAt(j+9)))
								{
									break;
								}
								else
									System.out.println("Enter correct number plate !");
							}
							else
								System.out.println("Enter correct number plate !");
						}
						else
							System.out.println("Enter correct number plate !");
					}
					else
						System.out.println("Enter correct number plate !");
				}
				else if(vehiclenumber.length()==9)
				{
					int j=0;
					if(Character.isLetter(vehiclenumber.charAt(j)) && Character.isLetter(vehiclenumber.charAt(j+1)))
					{
						if(Character.isDigit(vehiclenumber.charAt(j+2)) && Character.isDigit(vehiclenumber.charAt(j+3)))
						{
							if(Character.isLetter(vehiclenumber.charAt(j+4)))
							{
								if(Character.isDigit(vehiclenumber.charAt(j+5)) && Character.isDigit(vehiclenumber.charAt(j+6)) && Character.isDigit(vehiclenumber.charAt(j+7)) && Character.isDigit(vehiclenumber.charAt(j+8)))
								{
									break;
								}
								else
									System.out.println("Enter correct number plate !");
							}
							else
								System.out.println("Enter correct number plate !");
						}
						else
							System.out.println("Enter correct number plate !");
					}
					else
						System.out.println("Enter correct number plate !");
				}

				else 
					System.out.println("length of a number was wrong reenter !");
			}
			

			System.out.println("Enter type of vehicle : 1 for motorcycles , 2 : for compact cars , 3 : electric car , 4: handicap vehicles");
			while(true)
			{
				vehicletype = Integer.parseInt(br.readLine());
				if(vehicletype>0 && vehicletype <5)
				{
					if(vehicletype == 1)
						a2.add("motorcycles");
					else if(vehicletype == 2)
						a2.add("compact car");
					else if(vehicletype == 3)
						a2.add("electric car");
					else if(vehicletype == 4)
						a2.add("handicap vahicle");

					break;
				}
				else 
					System.out.println("Sir/madam pls choose correct option !");
			}

			System.out.println("Time to park a vehicle :");
			while(true)
			{
				time = Integer.parseInt(br.readLine());
				if(time>0)
				{
					break;
				}
				else
					System.out.println("Sir/madam pls reenter time !");
			}


			System.out.println("Enter which slot you want :");
			while(true)
			{
				selectslot = Integer.parseInt(br.readLine());
				if(selectslot<=n)
				{ 	
					if(selectslot>0)
					{
						if((a1.contains(selectslot) == false))
						{
							a1.add(selectslot);
							break;
						}
						else
							System.out.println("Parking not available pls select another  !!");
					}
					else
						System.out.println("Invalid paking number pls enter positive number !");
				}
				else
					System.out.println("Total parking capacity is "+n+" sir/madam pls Enter slot below number"+n);

			}



			System.out.println("Enter payment mode : 1.cash, 2.credit, 3.coupon :");
			while(true)
			{
				paymentmode =Integer.parseInt(br.readLine());

				if(paymentmode>0 && paymentmode<4)
				{
					if(paymentmode==1)
						a3.add("cash");
					else if(paymentmode == 2)
						a3.add("credit card");
					else if(paymentmode == 3)
						a3.add("coupon"); 
					break;
				}
				else
					System.out.println("pls select the correct option !!");

			}
			T[i] = new Time(vehiclenumber,vehicletype,selectslot,time); 

		}

		for (int i=0;i<n;i++) 
		{
			System.out.println();
			System.out.println("******"+a2.get(i)+"******");
			System.out.println("Paymetn mode is : "+a3.get(i));
			T[i].display();	
		}
	}
}
