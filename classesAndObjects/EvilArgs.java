package classesAndObjects;
import java.util.Scanner;

public class EvilArgs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		Evil e=new Evil();
		int res=e.calEvil(num);
		System.out.println(res);
		if(res==num)
		{
			System.out.println("Evil");
		}
		else
			System.out.println("Not Evil");
		
	}

}
class Evil
{
	public int calEvil(int n)
	{
		int square=n*n,sum=0,rem;
		for(;square>0;square/=10)
		{
			rem=square%10;
			sum=sum+rem;
		}
		return sum;
	}
}
