package in;

import java.util.ArrayList;
import java.util.*;
public class AirportDriver {
	public static ArrayList<Airport> t=new  ArrayList<Airport>();
	public static int seat=1;
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {	
	boolean res=true;
	do
	{
		System.out.println("1.Booking the ticket\n2.visit the ticket\n3.exit");
		int choose=sc.nextInt();
		switch(choose)
		{
		case 1:
		{  
			 Booking();
			break;
		}
		case 2:
		{
			visitTicket();
			
		}
		}
		
	}while(res);
	
}
public static void Booking()
{
   	System.out.println("enter the passenger Name");
   	String name=sc.next();
   	System.out.println("Passenger desitination");
   	String place=sc.next();
   	Airport air=new Airport("boopathy","chennai", 1);
   	t.add(air);
 System.out.println("successfully");
   	
}
public static void visitTicket()
{
	System.out.println("BoookedTicket");
	if(t.isEmpty())
	{
		System.out.println("not yet booked");
	}
	else
	{
		for(Airport ele:t)
		{
			System.out.println(ele);
		}
	}
}
}
