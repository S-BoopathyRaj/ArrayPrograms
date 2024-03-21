package in;
import java.util.*;
public class LinearSearch {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {	
	int a[]= {1,2,3,4,5};
	String res="true";
	System.out.println("enter the key");
	int key=sc.nextInt();
	for (int i = 0; i < a.length; i++) {
		if(a[i]==key) 
		{
			res="preset";
		  break;
		}
		else
		{
			System.out.println("not present");
		}	
		}
	System.out.println(res);
}
}

