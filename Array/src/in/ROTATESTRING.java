package in;
/*
 in
 dcbam
 o/p
 bambc
*/
public class ROTATESTRING {
public static void main(String[] args) {
	String s="abcd";
	String s1="cdab";
	if(s.length()!=s1.length())
	{
		System.out.println("false");
		
	}
	else
	{
	String a=s+s1;
	int index=a.indexOf(s1);
	if(index>=0)
	{
		System.out.println("true");
	}
	}
}
}
