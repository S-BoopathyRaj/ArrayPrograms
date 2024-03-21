package in;

import java.util.Arrays;

public class zigzag {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int b[]= {60,70,80,90,100};
	int c[]=new int [a.length+b.length];
	for (int i = 0,m=0,n=0; i < c.length; i++) {
		if(i%2==0)
		{
			c[i]=b[n++];
		}
		else
		{
			c[i]=a[m++];
		}
		
	}
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(c));
	
	
}
}
