package strings;
public class RemovingDuplicates {
	public static void main(String[] args) {
		String s1=" Hello Everybody ";
		
		s1=s1.trim();
		s1=s1.replace("l", "p");
		System.out.println(s1.indexOf("l"));
		//if letter is not present it returns -1
		System.out.println(s1.indexOf("z"));
		//if it is repeating last occurrence index will be returned
		System.out.println(s1.lastIndexOf("o"));
		String s2="";
		for(int x=0;x<s1.length();x++)
		{
			char c=s1.charAt(x);
			if(s2.indexOf(c)==-1)
				s2=s2+c;
			
		}
		System.out.println("After removing duplicates:"+s2);
	}

}
