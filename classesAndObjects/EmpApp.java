package classesAndObjects;
import java.util.Scanner;
public class EmpApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Employee e1=new Employee();
		System.out.println("Enter basic salary");
		e1.basic=s.nextInt();
		e1.name="Sri Ram";
		e1.id=149;
		e1.department="Maths";
		e1.age=28;
		e1.da=2000;
		e1.hra=5000;
		e1.ta=3000;
		e1.tax=15;//15 Percent
		e1.addingtobasic();
		e1.subtractingtax();
		e1.display();
	}
}
class Employee
{
	int id,age;
	String name,department;
	double basic,grosssalary,afteradding;
	int da,ta,hra;
	int tax;
	void addingtobasic()
	{
		afteradding=basic+da+ta+hra;
	}
	void subtractingtax()
	{
		grosssalary=afteradding-((tax/100.0)*afteradding);
	}
	void display()
	{
		System.out.println("Name: "+name+"\nId: "+id);
		System.out.println("Department: "+department+"\nAge: "+age);
		System.out.println("Basic salary: "+basic);
		System.out.println("Gross salary : "+grosssalary);
	}
}