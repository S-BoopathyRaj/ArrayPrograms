package in;

import java.util.Arrays;

public class OddOrEven {
public static void main(String[] args) {
	int a[]= {10,11,23,13,44,66};
	boolean t[]=new boolean[a.length];
	for (int i = 0; i < t.length; i++) {
		if(a[i]%2==0)
			t[i]=true;
		
	}
	System.out.println(Arrays.toString(t)); 
	System.out.println(Arrays.toString(a)); 
}
}
