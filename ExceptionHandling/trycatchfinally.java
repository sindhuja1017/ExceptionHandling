package ExceptionHandling;

import java.util.Scanner;

public class trycatchfinally {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter required and total values");
		int required=sc.nextInt();
		int total=sc.nextInt();
		Bank.withdrawal(required, total);
	}
}
class Bank
{
	public static void withdrawal(int required,int total)
	{
		if(required<=total)
		{
			System.out.println(total-required);
		}
		else 
		{
			try
			{
				throw new ArithmeticException("insufficient  balance");
			}
			catch(Exception e)
			{
				System.out.println("exception caught");
			}
			finally
			{
				System.out.println("program executed");
			}
		}
	}
}
