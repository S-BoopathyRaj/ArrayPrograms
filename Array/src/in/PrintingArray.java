package in;
import java.util.*;
public class PrintingArray {
	static Scanner sc=new  Scanner(System.in);
public static void main(String[] args) {
	System.out.println("enter the array");
	int size=sc.nextInt();
	int a[]=new int[size];
	for (int i = 0; i < a.length; i++) {
		a[i]=sc.nextInt();
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
}
}
