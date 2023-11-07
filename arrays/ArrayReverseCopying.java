package arrays;

import java.util.Scanner;

public class ArrayReverseCopying {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[a.length];
		Scanner sc=new Scanner(System.in);
		for(int x=0;x<a.length;x++)
		{
			System.out.println("Enter "+x+" index value :");
			a[x]=sc.nextInt();
		}
		for(int x=a.length-1;x>=0;x--)
		{
			b[a.length-1-x]=a[x];//
		}
		for(int x=0;x<a.length;x++)
			System.out.print(a[x]+"  ");
		System.out.println();
		for(int x=0;x<b.length;x++)
		{
			System.out.print(b[x]+"  ");
		}
		
	}

}
