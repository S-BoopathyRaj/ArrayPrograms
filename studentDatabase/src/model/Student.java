package model;

import java.util.Objects;

public class Student {
 private String name;
 int age;
 double mark;
 int sid;
public Student(String name, int age, double mark,int sid) {
	super();
	this.name = name;
	this.age = age;
	this.mark = mark;
    this.sid=sid++;	
}

public Student(String string, int i, int j, int k) {
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getMark() {
	return mark;
}


public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public void setMark(double mark) {
	this.mark = mark;
}

@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", mark=" + mark + ", sid=" + sid + "]";
}

@Override
public int hashCode() {
	return Objects.hash(age, mark, name, sid);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return age == other.age && Double.doubleToLongBits(mark) == Double.doubleToLongBits(other.mark)
			&& Objects.equals(name, other.name) && sid == other.sid;
}


}
