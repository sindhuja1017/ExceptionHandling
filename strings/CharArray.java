package strings;

public class CharArray {

	public static void main(String[] args) {
		String s=new String("a1b2c9");
		char[] c=s.toCharArray();
		System.out.println("Sum : "+Character123.Sum123(c));
	}
}
class Character123
{
	static int Sum123(char[] c) {
		int sum=0;
		for(int x=0;x<c.length;x++)
		{
			char ch=c[x];
			if(ch>='0' && ch<='9')
			{
				sum=sum+Character.getNumericValue(ch);
			}
		}
		return sum;
	}
}