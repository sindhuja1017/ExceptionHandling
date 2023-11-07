package classesAndObjects;

public class ToString {

	public static void main(String[] args) {
		
		String1 s1=new String1();
		s1.roll=34;
		s1.name="Sindhuja";
		s1.section='B';
		s1.marks=100;
		s1.grade='A';
		System.out.println(s1.toString());
		System.out.println(s1.display());
	}
}
class String1
{
	int roll,marks;
	String name;
	char section,grade;
	public String toString()
	{
		return roll+"";
	}
	public String display()
	{
		return marks+" "+grade+" ";
	}
}
