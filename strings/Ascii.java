package strings;

public class Ascii {

	public static void main(String[] args) {
		String s1=new String("Hello 123@!");
		int lower=0,upper=0,spe=0,num=0;
		for(int x=0;x<s1.length();x++)
		{
			char c=s1.charAt(x);
			int y=(int)(c);
			if(y>=97 && y<=122)
				lower++;
			else if(y>=65 && y<=90)
				upper++;
			else if(y>=48 &&y<=57)
				 num++;
			else
				spe++;
		}
		System.out.println("No of upper case letters : "+upper);
		System.out.println("No of lower case letters : "+lower);
		System.out.println("No of numbers : "+num);
		System.out.println("Special symbols : "+spe);
	}

}
