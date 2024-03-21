package in;

import java.util.Arrays;

public class Anagrom {
public static void main(String[] args) {
	String input ="earth";
	String input1="heart";
	System.out.println(input +""+input1);
	 String  lower1 =input.toLowerCase();
     String  lower2=input1.toLowerCase();
     if(lower1.length()==	lower2.length())
     {
    	 char[] arr=lower1.toCharArray();// 'e','a'
    	 char[] arr1=lower1.toCharArray();  //'e','a'
    	 
          Arrays.sort(arr);//'a','e'
    	System.out.println(arr);
    	
    	Arrays.sort(arr1);//'a','e'
    	System.out.println(arr1); 
    	if(Arrays.equals(arr,arr1))
    	{
    		System.out.println("both are anogram function");
    	}
    	else
    	{
    		System.out.println("Both are not anaogram function");
    		
    	}
    		 
     }else
     {
    	 System.out.println("both are not anogram");
    	 
     }
}
}
