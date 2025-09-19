/*Write a program to find the cube of given number using functional interface */

interface printnumber
{
	public void print(int num1);
}

public class slip10_1
{
	public static void main(String[] a)
	{
		printnumber p=n-> System.out.println("cube is:"+n*n*n);
		p.print(3);//p.print(3);
	}
}

