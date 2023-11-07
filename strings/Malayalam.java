package strings;

public class Malayalam {

	public static void main(String[] args) {
		String s1=new String("malayalam");
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		String s2=new String(sb);
		if(s1.equals(s2))
			System.out.println("palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
