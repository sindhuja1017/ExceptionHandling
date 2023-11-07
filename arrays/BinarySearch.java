package arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]=new int[] {10,100,20,90,30,80,70,40,50,60};
		int search=90,enable=0;
		int low=0,mid=0,high=9;
		Arrays.sort(a);
		System.out.println("Binary search for "+search+" element.");
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
			System.out.println("Element is not found.");
	}

}
