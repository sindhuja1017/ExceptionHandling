package strings;

public class VIRUS {

	public static void main(String[] args) {
		String s1=new String("Vital Information Resources Under Sieze");
		String[] s2=s1.split(" ");
		String s3="";
		for(int x=0;x<s2.length;x++)
		{
			char c=s2[x].charAt(0);
			s3=s3+c;
		}
		System.out.println(s3);
		
	}
}