package arrays;

public class Arraychar {

	public static void main(String[] args) {
		char c[]=new char[] {'c','3','(','!'};
		for(int x=0;x<c.length;x++)
		{
			System.out.print(c[x]+"  ");
		}
		System.out.println();
		short s[]=new short[] {1,2,3,78,92};
		for(int x=0;x<s.length;x++)
		{
			System.out.print(s[x]+"  ");
		}
		System.out.println();
		long l[]=new long[] {23452,65342456,958798175};
		for(int x=0;x<l.length;x++)
		{
			System.out.print(l[x]+"   ");
		}
		System.out.println();
		boolean b[]=new boolean[] {true,false,true,false,true,false};
		for(int x=0;x<b.length;x++)
		{
			System.out.print(b[x]+"   ");
		}
		System.out.println();
		byte b1[]=new byte[] {25,127};
		for(int x=0;x<b1.length;x++)
		{
			System.out.print(b1[x]+"   ");
		}
	}

}
