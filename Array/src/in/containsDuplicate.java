package in;

import java.util.Arrays;

public class containsDuplicate {
public static void main(String[] args) {
 int a[]= {1,2,3,1,2,3,5};
 Arrays.sort(a);
 for (int i = 0; i < a.length-1; i++) {
	 if(a[i]==a[i+1])
	 {
		 System.out.println("true");
		 break;
	 }
	 
}

 
}
}
