package strings;

public class DeleteMethod {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Hello eveeryone How Are You");
		
		System.out.println(s);
		String s1=new String(s);
		String[] a=s1.split("o");
		for(String temp:a)
			System.out.println(temp);
		
	}

}
