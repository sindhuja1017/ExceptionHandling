package classesAndObjects;

import java.util.Scanner;

public class Primeusingargs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		Prime2 pri=new Prime2();
		int result=pri.calFactors(num);
		if(result==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
class Prime2
{
	public int calFactors(int n)
	{
		int factor=0;
		for(int x=2;x<=n/2;x++)
		{
			if(n%x==0)
			{
				factor++;
				break;
			}
		}
		return factor;
	}
}
