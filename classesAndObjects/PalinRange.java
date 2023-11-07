package classesAndObjects;

public class PalinRange {

	public static void main(String[] args) {
		int start=1,end=121,x;
		Palin p=new Palin();
		
		for(x=start;x<=end;x++)
		{
			p.rev=0;
			p.checkPalin(x);
			p.isCompare(x);
		}
	}
}

class Palin
{
	int rem,rev=0;
	public void checkPalin(int n)
	{
		for(int y=n;y>0;y/=10)
		{
			rem=y%10;
			rev=rev*10+rem;
		}
	}
	public void isCompare(int n)
	{
		if(rev==n)
			System.out.println(n);
		
	}
}
