package arrays;

public class FrequencyOfElements {

	public static void main(String[] args) {
		int a[]=new int[] {23,45,23,67,81,23,66,89,89,89,34,45,77,81,100};
		int count=1;
		boolean b[]=new boolean[a.length];
		System.out.println("Frequency of duplicate elements ");
		for(int i=0;i<a.length;i++)
		{
			count=1;
			if(b[i]==true)
				continue;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					b[j]=true;
					count++;
				}
			}
			if(count>1)
				System.out.println("Frequency of "+a[i]+" is "+count);
		}
	}

}
