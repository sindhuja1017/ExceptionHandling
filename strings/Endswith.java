package strings;

public class Endswith {

	public static void main(String[] args) {
		String s="Java Practice";
		String s2="ic";
		if(s.endsWith(s2))
			System.out.println("Yes");
		else
			System.out.println("No");
		if(s.contains(s2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
