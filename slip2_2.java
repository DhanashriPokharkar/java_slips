/*define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
Create an array of n player objects .Calculate the batting average for each player using static
method avg(). Define a static sort method which sorts the array on the basis of average. Display
the player details in sorted order.*/

import java.util.*;

	class cricket
{
	
	String name;
	int innings;
	int notout;
	int totalruns;
	float avg;


	void read()
{
	Scanner sc=new Scanner(System.in);
		System.out.println("enter a c_name");
		 name=sc.next();
		System.out.println("enter a no_of _innings");
		 innings=sc.nextInt();
		System.out.println("enter a no_of_time_notout");
		 notout=sc.nextInt();
		System.out.println("enter a c_totalruns");
	 	totalruns=sc.nextInt();
		System.out.println("enter a 	bat_avg");
	 	avg=sc.nextFloat();
	}
	
	
	
	static void sort(cricket[]s,int n)
	{
		cricket temp=new cricket();
		for(int i=0;i<n;i++)
		{
					for(int j=0;j<n-1;j++)
				{
				if(s[j].avg>s[j+1].avg)
					{
				temp=s[j];
				s[j]=s[j+1];
				s[j+1]=temp;
					}
				}
			}
	}
	
	
	void display()
	{
		System.out.println("c_name="+name);
		System.out.println("no_of _innings="+innings);
		System.out.println("no_of_time_notout="+notout);
		System.out.println("c_totalruns="+totalruns);	
		System.out.println("bat_avg="+avg);	
	}
	
	
	
	
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();	
		cricket []s=new cricket[20];
		for(int i=0;i<n;i++)
		{
				s[i]=new cricket();
				s[i].read();
				s[i].display();
		}
		cricket.sort(s,n);
        
	
	for(int i=0;i<n;i++)
	{
		s[i].display();
	}
	}
}
	
				

