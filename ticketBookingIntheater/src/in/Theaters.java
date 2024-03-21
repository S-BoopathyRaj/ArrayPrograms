package in;
import java.util.*;
public class Theaters {
 public static int total=100;
 public static boolean[]seat=new boolean[total];
  static Scanner sc=new Scanner(System.in);
 public static void main(String[] args) {
	boolean res=true;
	do
	{
		System.out.println("1.book a ticket\n2.visit Available ticket\n3.viewTicket\n4.exit");
		System.out.println("choose one option");
		int choose =sc.nextInt();
		switch(choose)
		{
		case 1:
		{   
			BookTicket();
			break;
		}
		case 2:
		{
			visitAvailableTicket();
			break;
		}
		case 3:
		{
			viewTicket();
			break;
		}
		case 4:
		{ 
			res=false;
			break;
		}
		
		}
		
	}while(res);
	

}
 public static  void BookTicket()
 {
	 System.out.println("enter the number of seat(1-100) ");
	 int book=sc.nextInt();
	 if(book<1 || book>100)
	 {
		 System.err.println("Invalied number");
	 }
	 else if(seat[book-1])
	 {
		 System.err.println("this place is already booked ! please choose another place");
	 }
	 else
	 {
		 seat[book-1]=true;
		 System.err.println("seatNumber"+book+"is successfully");
	 }  
 }
 public  static void visitAvailableTicket()
 {
	 for(int i=0;i<total;i++)
	 {
		 if(!seat[i])
		 {
			 System.out.print(i+1+" ");
		 }
	 }
	 System.out.println();
 }
 public static void viewTicket()
 {
	 System.out.println("Booked seats:");
     boolean noBookedSeats = true;
     for(int i=0;i<total;i++) {
         if(seat[i]) {
             System.out.print((i+1) + " ");
             noBookedSeats = false;
         }
     }
     if (noBookedSeats) {
         System.out.println("No seats booked yet.");
     }
     System.out.println();
 }
 
}
