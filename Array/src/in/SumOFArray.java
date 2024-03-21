package in;
/*
 * intput:[1,22,333,4444]
 * count the  each element of the array  if the element is even number the find the countDigit and sum the value...
 * output:6
 */


public class SumOFArray {
	static int sum=0;
	static int count=0;
	public static void main(String[] args) {
		int arr[]= {1,22,333,4444};
		
		for (int i = 0; i < arr.length; i++) {
			 count =countDigit(arr[i]);
			if(count %2==0)
			{
				 int x=findCount();
				 System.out.println(x);
			}
			
		}
	}
	
	public  static int  findCount()
	{
		while(count!=0)
		{
		    count=count/10;
		    sum++;
	
		}
		return sum;
	}
		public static int  countDigit(int a)
		{
			
			return a;
			
		}
	
}
