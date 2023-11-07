package oops;
import java.util.Scanner;
public class CollegeMain 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		College college=new College();
		college.methodCollege();
	}
}
class College
{
	void methodCollege()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your qualification: Inter/Graduation");
	String pass=sc.next();
		if(pass.equalsIgnoreCase("Inter"))
		{
			System.out.println("Btech/Bsc");
			String ugpg=sc.next();
			if(ugpg.equalsIgnoreCase("btech"))
			{
				Btech btech=new Btech();
				btech.methodbtech();
			}
			else if(ugpg.equalsIgnoreCase("bsc"))
			{
				Bsc bsc=new Bsc();
				bsc.methodbsc();
			}
		}
		else if(pass.equalsIgnoreCase("Graduation"))
		{
			System.out.println("M.Tech/MCA");
			String choice=sc.next();
			if(choice.equalsIgnoreCase("MTech"))
			{
				Mtech mtech=new Mtech();
				mtech.mtechmethod();
			}
			else if(choice.equalsIgnoreCase("mca"))
			{
				Mca mca=new Mca();
				mca.mcamethod();			}
		}
	}
}
class Btech extends College
{
	Scanner sc=new Scanner(System.in);
	void methodbtech()
	{
		System.out.println("Select course : CSE/ECE/EEE ");
		String course=sc.next();
		if(course.equalsIgnoreCase("CSE"))
		{
			System.out.println("Fees for CSE: 100000 per year ");
		}
		else if(course.equalsIgnoreCase("ECE"))
		{
			System.out.println("Fees for ECE: 80000 per year");
		}
		else if(course.equalsIgnoreCase("EEE"))
		{
			System.out.println("Fees for EEE: 60000 per year");
		}
		else
			System.out.println("Error");
	}
}
class Bsc extends College
{
	void methodbsc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select course : radiology/physics/computers");
		String course1=sc.next();
		if(course1.equalsIgnoreCase("radiology"))
		{
			System.out.println("Fees for radiology : 50000 per year");
		}
		else if(course1.equalsIgnoreCase("computers"))
		{
			System.out.println("Fees for computers : 40000 per year");
		}
		else if(course1.equalsIgnoreCase("physics"))
		{
			System.out.println("Fees for physics : 30000 per year");
		}
		else
			System.out.println("Error");
	}
}
class Mtech extends College
{
	void mtechmethod()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select course: CSE/ECE/EEE");
		String course=sc.next();
		if(course.equalsIgnoreCase("CSE"))
		{
			System.out.println("Fees for CSE: 900000 per year ");
		}
		else if(course.equalsIgnoreCase("ECE"))
		{
			System.out.println("Fees for ECE: 60000 per year");
		}
		else if(course.equalsIgnoreCase("EEE"))
		{
			System.out.println("Fees for EEE: 50000 per year");
		}
		else
			System.out.println("Error");
	}
}
class Mca extends College
{
	void mcamethod()
	{
		System.out.println("Fees for MCA is 70000 per year");
	}
}