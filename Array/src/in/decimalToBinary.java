package in;

import java.util.Scanner;

public class decimalToBinary {
public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	System.out.println("enter the binaryNUmber");
	int num=sc.nextInt();
	int sum=0; 
	int rem;
	int pow=1;
	while(num>0)//1>0
	{
		
		
		rem=num%2;
		num=num/2;
		sum=sum+rem*pow;	
		pow=pow*10;
	}
	System.out.println(sum);
	
}
	
	
	
}
