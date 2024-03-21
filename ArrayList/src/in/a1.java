package in;

import java.util.ArrayList;
import java.util.Iterator;

public class a1 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(1);
	a1.add("boopathy");
	a1.add(323.1);
	a1.add(true);
	System.out.println(a1);
	a1.remove(1);
	System.out.println(a1);
	System.out.println(a1.contains(true));
	if(a1.contains(true))
	{
		System.out.println("present");
	
	}
	else
	{
		System.out.println("Not present");
	}
	System.out.println("Traversing the arrayList");
  Iterator	 i= a1.iterator();
  while(i.hasNext())
  {
	  System.out.println(i.next());
  }
}
}