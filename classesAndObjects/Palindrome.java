package classesAndObjects;

public class Palindrome {

	public static void main(String[] args) {
		Palin1 p1=new Palin1();
		p1.num=121;
		p1.temp=p1.num;
		if(p1.calPalindrome()==p1.temp)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not palindrome");
	}

}
class Palin1
{
	int num,rev=0,rem,temp;
	public int calPalindrome()
	{
	for(;num>0;num/=10)
	{
		rem=num%10;
		rev=rev*10+rem;
	}
	return rev;
	}
}

