package classesAndObjects;

import java.util.Scanner;
class EvilRange
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Extraction e1=new Extraction();
		System.out.println("Enter a number");
		e1.num=s.nextInt();
		
		e1.squ=e1.num*e1.num;
		e1.temp=e1.num;
		e1.extractingDigits();	
		e1.Compare();
	}
}
class Extraction
{
	public int num,squ,sum=0,rem,temp;
	void extractingDigits()
	{
		for(;temp>0;temp/=10)
		{
			rem=temp%10;
			sum+=rem;
		}
	}
	void Compare()
	{
		if(num==sum)
		{
			System.out.println("Evil number");
		}	
		else
			System.out.println("Not evil number");
	}
}
