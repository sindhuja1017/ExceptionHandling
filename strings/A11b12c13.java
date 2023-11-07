package strings;

public class A11b12c13 {

	public static void main(String[] args) {
		String s=new String("a11b12c13");
		char[] a=s.toCharArray();
		int num=0;
		char z=' ';
		for(int x=0;x<a.length;x++)
		{
			char c=a[x];
			if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			{
				num=0;
				z=c;
			}
			
			if(c>='0' && c<='9')
			{
				int y=Character.getNumericValue(c);			
				num=num*10+y;
			}
			if(num>1)
			{
				for(int y=1;y<=num;y++)
				{
					System.out.print(z+"");
				}
			}
			
		}
	}

}
