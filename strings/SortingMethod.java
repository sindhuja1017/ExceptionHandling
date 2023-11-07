package strings;

import java.util.Arrays;

public class SortingMethod {

	public static void main(String[] args) {
		String s1=new String("apple is a healthy fruit");
		String[] a=s1.split(" ");
		Arrays.sort(a);
		for(String temp:a)
			System.out.println(temp);
	}

}
