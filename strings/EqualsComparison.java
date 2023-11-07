package strings;

public class EqualsComparison {

	public static void main(String[] args) {
		String s1=("Hello");
		String s2=("Hello");
		if(s1==s2)//Reference comparison
			System.out.println("Yes");
		else
			System.out.println("No");
		String s3=new String("Hi");
		String s4=new String("Hi");
		if(s3.equals(s4))//Content comparison
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
