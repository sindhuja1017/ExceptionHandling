package classesAndObjects;

public class PowerArgs {
	public static void main(String[] args) {
		Power p=new Power();
		for(int x=1;x<=10000;x++)
		{
			p.sum=0;
			p.pro=1;
			p.calPower(x);
			p.compare(x);
		}
	}
}
class Power
{
	int sum=0,pro=1;
	public void calPower(int a)
	{
		for(int y=a;y>0;y/=10)
		{
			int rem=y%10;
			sum=sum+rem;
			pro=pro*rem;
		}
	}
	public void compare(int a)
	{
		if(sum==pro)
		{
			System.out.println(a);
		}
	}
}
