package in;

public class MissingNumber {
public static void main(String[] args) {
  int []a= {1,2,5,7,9,14};
  int b[]=new int [a.length];
  for (int i = 0,j=a[i]; i < b.length; i++,j++) {
	if(a[i]!=j)
	{
		System.out.println(j);
	    i--;
	}
}
  
  
}
}
