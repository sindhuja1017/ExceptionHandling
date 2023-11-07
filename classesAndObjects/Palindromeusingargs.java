package classesAndObjects;

import java.util.Scanner;

public class Palindromeusingargs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		Palindro p=new Palindro();
		
		if(p.display(num,0,0)==num)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}

}
class Palindro
{
	public int display(int n,int rem,int rev)
	{
		
		for(;n>0;n/=10)
		{
			rem=n%10;
			rev=rev*10+rem;
		}
		return rev;
	}
}
