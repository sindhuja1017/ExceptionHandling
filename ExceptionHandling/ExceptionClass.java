package ExceptionHandling;

import java.util.Scanner;

public class ExceptionClass {

	public static void main(String[] args) {
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
			catch(Throwable e)
			{
				System.out.println("Exception occured");
			}
	}

}
