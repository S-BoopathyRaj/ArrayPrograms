package in;

import java.lang.reflect.Array;
import java.util.Arrays;

public class duplicate {
public static void main(String[] args) {
	int a[]= {1,2,3,1,3,4,6,2,3,4,7,7,34,5,66,77};
	System.out.println(Arrays.toString(a));
    Arrays.sort(a);	
    int b[]=new int[a.length];
    int count=0;
    for (int i = 0,j=0; i < a.length-1; i++,j++) {
		if(a[i]!=a[i+1])
		{
			b[j]=a[i];
			count++;
		}
	}
}
}
