//Define an abstract class Staff with protected members id and name. Define a parameterized
//constructor. Define one subclass OfficeStaff with member department. Create n objects of
//OfficeStaff and display all details.


import java.util.*;

abstract class staff 
{
	protected int id;
	protected String name;
	
	staff(int id, String name)
	{
	this.id = id;
	this.name = name;
	}
}

class of extends staff
{	
	String department;
	
	of(int id,String name,String department)
	{
		super(id,name);
		this.department=department;
	}

void display()
{
	System.out.println("id="+id);
	System.out.println("name="+name);
	System.out.println("department="+department);
}
}

class officestaff {
	public static void main(String args[])
	{
	int n;
	int id;
	String name,dname;
	
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	of s[]=new of[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("enter the id");
		id=sc.nextInt();
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the dname");
		dname=sc.next();
	s[i]=new of(id,name,dname);
	s[i].display();
	
	}
	}
}
	

