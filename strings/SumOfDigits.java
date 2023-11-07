package strings;

public class SumOfDigits {

	public static void main(String[] args) {
		int x=Integer.parseInt("123");
		int rem,sum=0;
		for(;x>0;x/=10)
		{
			rem=x%10;
			sum=sum+rem;
		}
		System.out.println("Sum of digits "+sum);
	}

}
