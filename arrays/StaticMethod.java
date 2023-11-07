package arrays;

import java.util.Arrays;

public class StaticMethod {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,45,234,61,64,9,3,10};
		Arr.sorting(a);	
	}
}
class Arr
{
	static void sorting(int[] a)
	{
		Arrays.sort(a);
		for(int temp:a)
			System.out.print(temp+"  ");
	}
	
}
