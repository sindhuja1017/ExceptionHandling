package arrays;

public class Rotationusing1loop {

	public static void main(String[] args) {
		int rotation=3;
		int a[]=new int[] {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Before Rotation");
		for(int x:a)
			System.out.print(x+"  ");System.out.println();
		System.out.println("After "+rotation+ " Right rotation");
		for(int x=rotation;x<a.length;x++)
			System.out.print(a[x]+"  ");
		for(int x=0;x<rotation;x++)
			System.out.print(a[x]+"  ");
		
		
		
	}

}
