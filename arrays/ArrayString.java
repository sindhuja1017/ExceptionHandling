package arrays;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s[]=new String[5] ;
		for(int x=0;x<5;x++)
		{
			System.out.println("Enter "+x+"index value");
			s[x]=sc.nextLine();
		}
		for(int x=0;x<5;x++)
		{
			System.out.print(s[x]+"  ");
		}
	}

}
