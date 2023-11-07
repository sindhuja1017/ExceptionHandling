package classesAndObjects;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Arm1 ob=new Arm1();
		
		System.out.println("Enter any num");
		ob.num=sc.nextInt();
		ob.temp=ob.num;
		
		ob.digits();
		int x=ob.Sum();
	
		if(x==ob.temp)
		{
			System.out.println("Armstrong");
		}
		else
			System.out.println("Not Armstrong");
		
	}

}
class Arm1
{
	int num,sum=0,rem=0,count=0,temp;
	void digits()
	{
		for(int x=num;x>0;x/=10)
		{
			count++;
		}
	}
	public int Sum()
	{
		for(;num>0;num/=10)
		{
			rem=num%10;
			sum=sum+(int)Math.pow(rem, count);
		}
		return sum;
	}

}
