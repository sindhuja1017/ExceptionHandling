package arrays;

public class DiagonalMatrix {

	public static void main(String[] args) {
		int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Left diagonal");
		System.out.println("Transpose ");
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<3;i++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
