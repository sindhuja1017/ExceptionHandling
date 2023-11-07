package arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		for(int x=0;x<a.length;x++)
			if(a[x]==40)
				System.out.println("Element 40 found at "+x+" index.");
		sc.close();
	}

}
