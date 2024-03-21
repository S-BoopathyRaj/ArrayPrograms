package in;
import java.util.*;
public class BinaryTODecimal {
public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	System.out.println("enter the binaryNUmber");
	int num=sc.nextInt();//1010
	int sum=0; //sum=0
	int pow=1;//pow=1
	while(num>0)//1>0
	{
		sum=sum+num%10 *pow;//10
		
		num=num/10;//0
		pow=pow*2;
		
	}
	System.out.println(sum);
	
}
}
