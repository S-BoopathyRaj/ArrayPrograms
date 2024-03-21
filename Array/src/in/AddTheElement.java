package in;

import java.util.Arrays;

public class AddTheElement {
public static void main(String[] args) {
	int a[]= {10,20,30,40};
	int b[]= {50,60,70,80};
	int c[]=new int[a.length+b.length];
	for (int i = 0,m=0,n=b.length-1; i < c.length; i++) {
		if(m<a.length)
			c[i]=a[m++];
		else if(n>=0)
			c[i]=b[n--];
	}
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(c));
	
}
}
