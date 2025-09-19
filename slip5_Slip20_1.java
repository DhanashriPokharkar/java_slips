/*1) Write a program for multilevel inheritance such that Country is inherited from Continent.
State is inherited from Country. Display the place, State, Country and Conut*/

import java.util.*;

class continent
{
	String cname;

void read1()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the continent name");
	cname=sc.next();
	
}

void display1()
{
	System.out.println("continent name=" +cname);
}
}
class country extends continent
{
	String countryname;

void read2()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the country name");
	countryname=sc.next();
	
}

void display2()
{
	System.out.println("country name=" +countryname);
}
}

class state extends country
{
	String sname;
	String pname;

void read3()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the state name");
	sname=sc.next();
	System.out.println("enter the place name");
	pname=sc.next();
}

void display3()
{
	System.out.println("state name=" +sname);
	System.out.println("place name=" +pname);
}

public static void main(String args[])
	{
		state obj1=new state();
		obj1.read3();
		obj1.display3();
	
		obj1.read1();
		obj1.display1();
		
		obj1.read2();
		obj1.display2();
		
	}
}
		
	

