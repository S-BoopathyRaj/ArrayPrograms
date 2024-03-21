package view;

import java.util.Scanner;

import Controler.StudentDataBase1;
import Controler.StudentDatabase2;

public class StudentDriver {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	boolean res=true;
	   StudentDatabase2 sd=new StudentDataBase1();
	
	do {
		System.out.println("select the option");
		System.out.println("1.addtheStudent\n2.displaytheStudent\n3.searching\n4.sorting\n5.displayHeigestmark");
		int choose=sc.nextInt();
		switch(choose)
		{
		case 1:
		{
			sd.addstudent();
			break;
		}
		case 2:
		{
			sd.displayAllStudent();
			break;
		}
		case 3:
		{
			sd.searching();
		}
		case 4:
		{
			sd.shorting();
		}
		case 5:
		{
			sd.heighstMark();
		}
		
		}		
	} while (res);
}
}
