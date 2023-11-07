package classesAndObjects;

import com.codinghub.Two;

public class One {

	public static void main(String[] args) {
		int x=1;
		Two two=new Two();
		int a=two.dataInt();
		System.out.println(two.dataBoolean());
		double b=two.dataDouble();
		char c=two.dataChar();
		System.out.println(a+" "+b+" "+c);
		if(two.dataBoolean())
		{
			x=45;
		}
		System.out.println(x);
		
	}

}
