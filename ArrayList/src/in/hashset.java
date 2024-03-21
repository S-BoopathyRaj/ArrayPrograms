package in;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class hashset {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(1);
	a1.add(1);
	a1.add(1);
	a1.add(1);
	a1.add(2);
	a1.add(2);
	a1.add(2);
	a1.add(2);
	a1.add(3);
	a1.add(3);
	a1.add(3);
    a1.add(4);
    System.out.println(a1);
    Set<Integer> s=new HashSet<Integer>(a1);
    for(int ele:s)
    {
    	System.out.println(ele);
    }
	
}
}
