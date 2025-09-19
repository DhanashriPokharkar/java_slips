/*  Write a program to accept ‘n’ name of cities from the user and sort them in ascending
order.*/

import java.util.*;
 class slip1
{

	public static void main(String args[])
 	{
 	   Scanner sc=new Scanner(System.in);
 	    System.out.println("enter the number of cities ");
 	   int n=sc.nextInt();
	 	System.out.println("enter the cities name");
      String[] cities =new String[n];
      
      for(int i=0;i<n;i++)
      {
      		cities[i]=sc.next();
      		 		
	 }

	  Arrays.sort(cities);
	   for(int i=0;i<n;i++)
	   {	
	   		System.out.println(" sorted cities="+cities[i]);
	   	}
	  }
}

