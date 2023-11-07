package strings;

public class CompareTo {

	public static void main(String[] args) {
		String s1=new String("Apple");
		String s2=new String("apple");
		System.out.println(s1.compareTo(s2));
		if(s1.compareToIgnoreCase(s2)==0)
			System.out.println("Same");
		else
			System.out.println("Not same");
		String s3="everybody keep quiet";
		String s4="eve";
		if(s3.startsWith(s4))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
