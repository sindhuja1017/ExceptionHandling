package arrays;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements ");
		for(int x=0;x<a.length;x++)
			a[x]=sc.nextInt();
		int sumeven=0,sumodd=0,sumpos=0,sumneg=0;
		for(int temp:a)
		{
			if(temp%2==0)
				sumeven++;
			if(temp%2!=0)
				sumodd++;
			if(temp>0)
				sumpos++;
			if(temp<0)
				sumneg++;
		}
		System.out.println("Sumeven "+sumeven+"\nSumodd "+sumodd+"\nSumpos "+sumpos+"\nsumneg "+sumneg);
	}

}
