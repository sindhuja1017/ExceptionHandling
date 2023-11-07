package arrays;

public class MinMaxNumber {

	public static void main(String[] args) {
		int a[]=new int[] {14,52,98,12,30,63};
		int largest=a[0],smallest=a[0];
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>largest)
				largest=a[x];
			if(a[x]<smallest)
				smallest=a[x];
		}
		System.out.println("Largest : "+largest +" Smallest : "+smallest);

	}

}
