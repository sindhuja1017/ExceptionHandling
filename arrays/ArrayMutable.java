package arrays;

public class ArrayMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayMut arr=new ArrayMut();
		System.out.println(arr);
		arr.a[2]=10;
		System.out.println(arr);
	}
}
class ArrayMut
{
	int a[]=new int[] {1,2,3,4,5};
}
