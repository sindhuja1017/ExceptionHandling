package oops;

public class SetterGetters {

	private String name;
	private char section;
	private int rollno;
	private int marks;
	private String address;
	public static void main(String[] args) {	
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setsection(char section)
	{
		this.section=section;
	}
	public char getsection()
	{
		return section;
	}
	public void setrollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getrollno()
	{
		return rollno;
	}
	public void setmarks(int marks)
	{
		this.marks=marks;
	}
	public int getmarks()
	{
		return marks;
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public String getaddress()
	{
		return address;
	}
	
}
