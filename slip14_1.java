/*
Write a program to accept a number from the user, if number is zero then throw user defined
exception “Number is 0” otherwise check whether no is prime or not (Use static keyword).
*/

import java.util.*;

class ZeroException extends Exception {
	ZeroException(){
		System.out.println("0 cannot be prime / not prime");
	}
}

class slip14_1 {
	public static void main(String args[]){
		int n, flag = 1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		try {
			if(n == 0)
				throw new ZeroException();
			for(int i=2; i<n; i++)
				if(n % i == 0)
					flag = 0;
			
			if(flag == 1)
				System.out.println("Number is prime");
			else
				System.out.println("Number is not prime");
		} catch (ZeroException e){}
	}
}
