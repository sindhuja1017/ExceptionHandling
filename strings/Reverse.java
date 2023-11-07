package strings;

public class Reverse {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Hello");
		System.out.println(s1.reverse());
		for(int x=s1.length()-1;x>=0;x--)
		{
			System.out.print(s1.charAt(x)+"");
		}
	}
}
