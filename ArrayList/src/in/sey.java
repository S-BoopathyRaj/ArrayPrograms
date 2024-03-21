package in;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sey {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(3);
	hs.add(3);
	hs.add(3);	
	System.out.println(hs);
	Iterator<Integer> ele=hs.iterator();
	while(ele.hasNext())
	{
		System.out.println(ele.next());
	}
     
	
	
}
}
