package in;

import java.util.Scanner;

public class MovieTicket {
//Ticket Booking 
	static Scanner sc=new Scanner(System.in);
	static int total=100;
	static boolean seat[]=new boolean[total];
	public void BookingTicket()
	{
		System.out.println("enter the seat number");
		int book=sc.nextInt();
		if(book<1 && book >=0)
		{
			System.err.println("invalied");
		}
		else if(seat[book-1])
		{
			System.err.println("Ticket already Filled !");
		}
		else
		{ 
			seat[book-1]=true;
			
			System.out.println("your Ticket successfully filled");
			
		}
	}
	public void visitTicket()
	{
		for(int i=0;i<=100;i++)
		{
			if(!seat[i])
			{
				System.out.println(i+1);
			}
		}
	}
	
};
