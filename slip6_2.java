/*2) Create an abstract class “order” having members id, description. Create two subclasses
“PurchaseOrder” and “Sales Order” having members customer name and Vendor name
respectively. Definemethods accept and display in all cases. Create 3 objects each of Purchase
Order and Sales Order  */

import java.util.*;
abstract class order
{
	int id;
	String description;
	
	
void read1()
{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter order id:");
		id=sc.nextInt();
		System.out.println("enter order description:");
		description=sc.next();
}
void display1()
{
		System.out.println("order id:="+id);
		System.out.println("order description:="+description);
}
}

class purchaseorder extends order
{	

	
	String cname;
void read1()
	{
	
		Scanner sc=new Scanner(System.in);
		super.read1();
		System.out.println("enter coustmer name:");
		cname=sc.next();
	}
	void display1()
	{
		super.display1();
		System.out.println("enter coustmer name:="+cname);
	}
}

class saleorder extends order
{
	String vname;
	
void read1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter sales id:");
		id=sc.nextInt();
		System.out.println("enter sales description:");
		description=sc.next();
		System.out.println("enter vendor name:");
		vname=sc.next();
	}
	void display1()
	{
		System.out.println(" order id:="+id);
		System.out.println(" order description:="+description);
		System.out.println(" vendor name:="+vname);
	}
	
}
	
class salesorder
{	
	public static void main(String args[])
	{
		
		saleorder[] s1=new saleorder[10];
		for(int i=0;i<3;i++)
		{
			
			s1[i]=new saleorder();
			s1[i].read1();
		}
		
		
		
		purchaseorder[] s2=new purchaseorder[10];
		for(int i=0;i<3;i++)
		{
			s2[i]=new purchaseorder();
			s2[i].read1();
		}
		System.out.println("display salesorder");
		for(int i=0;i<3;i++)
		{
			s1[i].display1();
		}
			System.out.println("display purchaseorder");
			for(int i=0;i<3;i++)
		{
			s2[i].display1();
		}
		
		
		
		
		//purchaseorder c1=new purchaseorder();
		//saleorder s1=new saleorder();
		//s1.read1();
		//c1.read1();
			
		//System.out.println("");
		
		//s1.display1();
		//c1.display1();
	}
}

		

