package in;

public class LinkedList {
public static void main(String[] args) {
java.util.LinkedList<String>l1=new java.util.LinkedList<String>();
l1.add("boopathy");
l1.add("boopath");
l1.add("boopaty");
l1.add("boopthy");
l1.remove("boopathy");
if(l1.contains("boopathy"))
{
	System.out.println("present");
}
else
{
	System.out.println("NOt present");
}

for(String ele:l1)
{
	System.out.println(ele);
}
}
}
