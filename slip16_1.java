/*Slip 16
Q1) Write a program to find the Square of given number using function interface */

interface printnumber
{
	public void print(int num1);
}

public class slip16_1
{
	public static void main(String[] a)
	{
		printnumber p=n-> System.out.println("square is:"+n*n);
		p.print(25);
	}
}

