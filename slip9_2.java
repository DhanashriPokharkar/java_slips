/*Write a program to using marker interface create a class Product (product_id, product_name,
product_cost, product_quantity) default and parameterized constructor. Create objectsof class
product and display the contents of each object and Also display the object count. */

import java.util.*;

interface Maker
{

}

class product1 implements Maker
{
	int pro_id;
	String name;
	int pro_cost;
	int quantity;
	static int count=0;

product1()
{
	pro_id=0;
	name=null;
	pro_cost=0;
	quantity=0;
	count++;
}


product1(int pro_id,String name,	int pro_cost,int quantity)
{
	this.pro_id=pro_id;
	this.name=name;
	this.pro_cost=pro_cost;
	this.quantity=quantity;
	count++;
}



void read()
{

	Scanner sc=new Scanner(System.in);
		System.out.println("enter  id:");
		pro_id=sc.nextInt();
		System.out.println("enter name:");
		name=sc.next();
		System.out.println("enter product cost:");
		pro_cost=sc.nextInt();
		System.out.println("enter quantity :");
		quantity=sc.nextInt();

}


void display()
{
System.out.println("product id=" +pro_id);
System.out.println("product name=" +name);
System.out.println("product cost=" +pro_cost);
System.out.println("product quantity=" +quantity);
System.out.println("product count=" +count);
		
}

/*static void count()
		{
			count++;
			System.out.println("count="+count);
		}*/
}

class product 
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	product1[] s1=new product1[10];
	for(int i=0;i<n;i++)
	{
		s1[i]=new product1();
		s1[i].read();
		s1[i].display();
	}
	
	
}

}
	


