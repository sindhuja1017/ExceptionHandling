package strings;

public class Palindrome {

	public static void main(String[] args) {
		String s1=new String("madam arora teaches malayalam");
		System.out.println("No of palindromic words "+Counting.counter(s1));
	}
}
class Counting
{
	static int counter(String s1)
	{
		int count=0;
		String s[]=s1.split(" ");
		for(int x=0;x<s.length;x++)
		{
			StringBuffer sb=new StringBuffer(s[x]);
			String s2=sb.reverse().toString();
			if(s[x].equals(s2))
				count++;
		}
		
		return count;
	}
}