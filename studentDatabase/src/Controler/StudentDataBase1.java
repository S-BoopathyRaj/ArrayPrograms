package Controler;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;

import model.Student;

public class StudentDataBase1  implements StudentDatabase2{
	static Scanner sc=new Scanner(System.in);
	TreeSet<StudentDataBase1> t=new TreeSet<StudentDataBase1>();
	LinkedHashMap<Integer,Student> db=new LinkedHashMap<Integer,Student>();

	@Override
	public void addstudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the age");
		int age =sc.nextInt();
		System.out.println("enter the marks");
		Double mark=sc.nextDouble();
		System.out.println("enter the sid");
		int sid=sc.nextInt();
        Student s= new Student(name,age,mark,sid);
        db.put(s.getSid(), s);
       System.out.println("Successfully");
		
	}

	@Override
	public void displayAllStudent() {
		Set<Integer> s1=db.keySet();
		for(int ele:s1)
		{
			System.out.println(db.get(ele));
		}
	}

	@Override
	public void searching() {
		System.out.println("enter the sid");
		int id=sc.nextInt();
		
	    if(db.containsKey(id))
	    {
	    	System.out.println(db.get(id));
	        System.out.println("present");
	    }
	    else
	    {
	    	System.out.println("NotPresent");
	    }	
	}
	@Override
	public void shorting() {
	 	sortsid s=new sortsid();
	 	TreeSet<Student> t=new TreeSet<Student>(s);
	    t.addAll(db.values());
	    for(Student ele: t)
	    {
	    	System.out.println(ele);
	    }
	 	System.out.println("ID Sorted Successfully");
	 	
	}

	@Override
	public void heighstMark() {
		sortmark s=new sortmark();
		TreeSet<Student> t1=new TreeSet<Student>(s);
		t1.addAll(db.values());
		Student Studenmaxvalues=t1.first();
		System.out.println(Studenmaxvalues.getMark());	
	}
}
class sortsid implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return s1.getSid()-s2.getSid();//Ascending
		
	}
	
}
class sortmark implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return (int) (s1.getMark()- s1.getMark());//Ascending
		
	}
	
}
