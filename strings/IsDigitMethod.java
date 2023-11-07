package strings;

public class IsDigitMethod {

	public static void main(String[] args) {
		String s="a1b2b3e7";
		int sum=0,max=0,num;
		char[] a=s.toCharArray();
		for(int x=0;x<a.length;x++)
		{
			char c=a[x];
			if(Character.isDigit(c)==true)
			{
				num=Character.getNumericValue(c);
				sum=sum+num;
				if(max<num)
					max=num;
			}
		}
		System.out.println("Sum : "+sum+" Max : "+max);
		
	}

}
