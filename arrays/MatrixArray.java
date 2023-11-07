package arrays;
import java.util.Scanner;
public class MatrixArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=3,c=3;
		int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int c1[][]=new int[3][3];
		System.out.println("Enter array elements");
		System.out.println("Rows "+r+" Cols "+c);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				c1[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("C elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{	
				System.out.println(c1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
