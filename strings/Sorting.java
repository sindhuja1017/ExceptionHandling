package strings;

public class Sorting {

	public static void main(String[] args) {
		String s=new String("good morning everyone");
		char a[]=s.toCharArray();
		int x,y,count=0;
		char temp=' ';
		for(x=0;x<a.length;x++)
		{
			for(y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		for(char z:a)
		{
			if(z!=' ')
				System.out.print(z+"");
		}
		for(char z:a)
		{
			if(z==' ')
				count++;
			
		}
		System.out.println();
		System.out.println("No of spaces are "+count);
	}

}
