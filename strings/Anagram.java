package strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="SILENT";
		String s2="LISTNE";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean flag=false;
		for(int x=0;x<c1.length;x++)
		{
			if(c1[x]==c2[x])
				flag=true;
			else
				flag=false;
		}
		if(flag)
			System.out.println("Anagram");
		else
			System.out.println("Not anagram");
	}

}
