package ExceptionHandling;

import java.util.Scanner;

public class MultipleCatchBlocks 
{

	public static void main(String[] args) 
	{
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x value");
		int x=sc.nextInt();
		int a[]=new int[5];
		int y;
		for(y=0;y<a.length;y++)
		{
			System.out.println(a[y]/x);
		}
		System.out.println(a[y]);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("arithmetic exception occured cannot execute");
		}
		catch(NegativeArraySizeException n)
		{
			System.out.println("negative size exception occured cannot execute");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("array index out of bounds exception occured cannot execute");
		}
		
		
	}

}
