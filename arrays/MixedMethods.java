package arrays;

import java.util.Arrays;

public class MixedMethods {

	public static void main(String[] args) {
		int index=5,element=55;
		int search=90;
		System.out.println("Performing Left rotation");
		Methods.leftRotation();
		System.out.println();
		System.out.println("Performing Right rotation");
		Methods.rightRotation();
		System.out.println();
		System.out.println("Performing Insertion");
		Methods.insertElement(index,element);
		System.out.println();
		System.out.println("Performing Deletion");
		Methods.deleteElement(index);
		System.out.println();
		System.out.println("Searching "+search+" Element");
		Methods.LinearSearch(search);
		System.out.println();
		System.out.println("Smallest Number ");
		Methods.smallestNumber();
		System.out.println();
		System.out.println("Largest Number ");
		Methods.largestNumber();
		System.out.println();
		System.out.println("Binary Search for "+search);
		Methods.binarySearch(search);
		
		
		
	}
}
class Methods
{
	static int x,y;
	static void leftRotation()
	{
		
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int index=4;
		for(x=index;x<a.length-1;x++)
		{
			System.out.print(a[x]+"  ");
		}
		for(y=0;y<index;y++)
			System.out.print(a[y]+"  ");
	}
	static void rightRotation()
	{
		
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int index=4;
		for(x=a.length-index;x<a.length;x++)
		{
			System.out.print(a[x]+"  ");
		}
		for(y=0;y<a.length-index;y++)
			System.out.print(a[y]+"  ");
	}
	
	static void insertElement(int index,int element)
	{
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		
		for(y=a.length-1;y>index;y--)
		{
			a[y]=a[y-1];
		}
		a[index]=element;
		for(int x:a)
			System.out.print(x+"  ");
	}
	
	static void deleteElement(int index)
	{
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		
		for(y=index;y<a.length-1;y++)
		{
			a[y]=a[y+1];
		}
		for(x=0;x<a.length;x++)
			System.out.print(a[x]+"  ");
	}
	
	static void LinearSearch(int search)
	{
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		for(int y:a)
			System.out.print(y+"  ");
		System.out.println();
		for(x=0;x<a.length;x++)
		{
			if(a[x]==search)
			System.out.println("Element found at "+x+"index");
		}
	}
	
	static void smallestNumber()
	{
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int small=a[0];
		for(x=0;x<a.length;x++)
		{
			if(a[x]<small)
				small=a[x];
		}
		System.out.println("Smallest element is "+small);
	}
	
	static void largestNumber()
	{
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		int large=a[0];
		for(x=0;x<a.length;x++)
		{
			if(a[x]>large)
				large=a[x];
		}
		System.out.println("Largest Number is "+large);
	}
	
	static void binarySearch(int search)
	{
		int a[]=new int[] {10,20,80,90,40,100,60,30,50,70};
		int low=0,mid=0,high=9,enable=0;
		Arrays.sort(a);
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]>search)
				high=mid-1;
			else if(a[mid]<search)
				low=mid+1;
			else
			{
				enable=1;
				break;
			}
		}
		if(enable==1)
			System.out.println("Element found at "+mid);
		else
			System.out.println("Element not found");
	}
}
