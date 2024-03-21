package in;

import java.util.Scanner;

public class PrimeNumberRange {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the startingRang");
	int start=sc.nextInt();
	System.out.println("enter the EndingRang");
	int end =sc.nextInt();
	for(int i=start;i<end;i++)
	{
		for(int j=2;i<j;j++)
		{
			if(i%j==0)
			{
				System.out.println(i+"is not prime");
				break;
			}
			else
			{
				System.out.println(i+"is prime");
			}
		}
	}
	
	
	
	
	
}
}
