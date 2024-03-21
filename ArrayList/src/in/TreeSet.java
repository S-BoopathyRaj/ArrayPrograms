package in;

public class TreeSet {
public static void main(String[] args) {
	java.util.TreeSet<Integer> t=new java.util.TreeSet<Integer>();
	t.add(1);
	t.add(2);
	t.add(3);
	t.add(4);
	t.add(5);
	t.add(16);
	System.out.println(t);
	for(int ele:t)
	{
		System.out.println(ele);
	}
	
	
}
}
