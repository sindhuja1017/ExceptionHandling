package strings;

public class DividingEqualParts {

	public static void main(String[] args) {
		String s="hellothisisdividingequalparts.";
		String[] s1=new String[10];
		char c[]=s.toCharArray();
		int x=0;
		String sum="";
		for(int i=0;i<s1.length;i++)
		{
			sum="";
			if(x<s.length())
			{
				for(int j=x;j<x+5;j++)
				{
					sum=sum+c[j];
				}
			}
			s1[i]=sum;
			x=x+5;
		}
		for(String temp:s1)
			System.out.println(temp);
	}

}
