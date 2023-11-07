package classesAndObjects;
import com.org.codinghub.package1.PrimeCal;

public class Prime
{
	public static void main(String[] args)
	{
		PrimeCal prime1=new PrimeCal();
		prime1.number=5;
		int a=prime1.forLoop();
		if(a==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	
}
