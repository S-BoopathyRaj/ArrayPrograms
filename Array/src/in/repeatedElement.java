package in;

import java.util.Iterator;

public class repeatedElement {
public static void main(String[] args) {
	int a[]= {1,2,2,3,4,5};
	int val=2;
	int d=0;
	int c[]= new int[a.length];
	for (int i = 0; i < c.length; i++) {
		if(a[i] !=val)
		{
			c[i]=a[i];
			d++;
		}
	}
}
}
