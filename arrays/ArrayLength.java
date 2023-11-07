package arrays;

public class ArrayLength {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,67,23,91};
		int length=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]!=0)
			{
				length++;
			}
		}
		System.out.println("Length of integer array: "+length);
		String s[]={"Hello","Hi","Bye"};
		int length2=0;
		for(int x=0;x<s.length;x++)
		{
			if(s[x]!=null)
			{
				length2++;
			}
		}
		System.out.println("Length of string array: "+length2);
	}
}
