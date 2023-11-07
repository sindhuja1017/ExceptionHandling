package classesAndObjects;

public class Student
{
	public String name;
	public int roll;
	public int marks;
	public double total;
	public double percentage;
	public void calPercentage()
	{
		percentage=(marks/total)*100;
	}
	public void calDisplay()
	{
		System.out.println(name+ " " +roll+ " " +percentage);
	}
}
