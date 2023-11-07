package strings;

public class Mutability {

	public static void main(String[] args) {
		String s1=new String("Sindhuja");
		s1.concat("hi");
		//String is immutable
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1=s1.concat(" Reddy");
		//if we update string and assign to new object it is accepted
		System.out.println(s1);//prints "Sindhuja Reddy"
		System.out.println(s1.hashCode());
		//StringBuffer is mutable
		StringBuffer sb=new StringBuffer("Sindhu");
		sb.append("HI");
		System.out.println(sb);
		//StringBuilder is mutable
		StringBuilder sv=new StringBuilder("Hello");
		sv.append("hi");
		System.out.println(sv);
	}

}
