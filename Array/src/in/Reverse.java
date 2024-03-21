package in;

import java.util.Arrays;

public class Reverse {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int res[]=new int[a.length];
	for (int i=0,j=a.length-1;i<res.length;i++)
	{
		res[i]=a[j];
	}
	System.out.println(Arrays.toString(a)); 
	System.out.println(Arrays.toString(res)); 
	
}
}
