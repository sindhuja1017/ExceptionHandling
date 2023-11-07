package arrays;

import java.util.Scanner;

public class ArraySearchLinear {

	public static void main(String[] args) {
		int count=0;
		int a[]=new int[]{1,2,3,4,5,6,7,8,9,5,5,6,2,8};
		System.out.println("Enter number to be searched ");
		Scanner s=new Scanner(System.in);
		int var=s.nextInt();
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==var)
				count++;
		}
		if(count!=0)
		{
			System.out.println("The element is present and the count it appeared is : "+count);
		}
		s.close();
	}

}
