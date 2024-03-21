package in;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class DuplicateCollection {
public static void main(String[] args) {
ArrayList<String> a1=new ArrayList<String>();
a1.add("apple");
a1.add("apple");
a1.add("mango");
a1.add("bananna");
a1.add("pinapple");
System.out.println(a1);
Set<String> s=new LinkedHashSet<String>(a1);
System.out.println(s);

	
	
	
	
}
}
