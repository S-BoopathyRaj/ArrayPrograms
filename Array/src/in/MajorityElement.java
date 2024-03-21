package in;
/*
[1,2,2,3,1,2]==n/2 element so 2 is higest presesnt in array
o/p =2 
 */
public class MajorityElement {
public static void main(String[] args) {
	int a[]= {1,2,2,3,1,2};
	int element=a[0];//2
	int count=1;     //1<6,2<6
	for (int i = 0; i < a.length; i++) {
		if(count==0)//1==0 false,1==0 false,1==0 false 0==0 true
		{
			element=a[i];
		}
		else if(a[i]==element)//1==1,2==1,2==1
		{
			count++;//count=2
		}
		else
		{
			count--;//count=1,count=0
		}
	}
	System.out.println(element);
}
}
