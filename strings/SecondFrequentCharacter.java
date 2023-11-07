package strings;

public class SecondFrequentCharacter {

	public static void main(String[] args) {
		String s1=new String("Buny is a gooood girl");
		char[] a=s1.toCharArray();
		int max=0;
		char maxch=' ';
		int count[]=new int[a.length];
		boolean b[]=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{		
					count[i]++;
				}
			}	
			if(count[i]>max)
			{
				max=count[i];
				maxch=a[i];
				System.out.println(maxch);
			}
		}
		System.out.println("Maxch "+maxch);
		
		
	}

}
