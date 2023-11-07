package classesAndObjects;

public class PowerReturnType {

	public static void main(String[] args) {
		NewPower p=new NewPower();
		for(int x=1;x<=10000;x++)
		{
			int sum=0,pro=1;
			int k=p.calPower(x, sum);
			int z=p.calPro(x,pro);
			p.compare(x, k, z);
		}	
	}
}
class NewPower
{
	public int calPower(int a,int sum)
	{
		for(int y=a;y>0;y/=10)
		{
			int rem=y%10;
			sum=sum+rem;
		}
		return sum;
	}
	public int calPro(int a,int pro)
	{
		for(int y=a;y>0;y/=10)
		{
			int rem=y%10;
			pro=pro*rem;
		}
		return pro;
	}
	public void compare(int x,int a,int b)
	{
		if(a==b)
			System.out.println(x);
	}
}
