package oops;

public class ConstructorApplication {

	public static void main(String[] args) {
		System.out.println("     Student Application");
		System.out.println();
		Total total=new Total();
		int sum=total.calMarks();
		double percentage=total.calPercentage();
		char grade=total.calGrade();
		total.display();
	}
}
class Total
{
	char section;
	String name;
	int rollno;
	int age;
	int[] marks=new int[6];
	int sum=0;
	String address;
	int percentage;
	char grade;
	Total()
	{
		name="Sindhuja Reddy";
		section='A';
		age=21;
		rollno=24;
		marks[0]=95;
		marks[1]=90;
		marks[2]=96;
		marks[3]=100;
		marks[4]=89;
		marks[5]=89;
		address="Karimnagar";
	}
	int calMarks()
	{
		
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		return sum;
	}
	int calPercentage()
	{
		percentage=0;
		percentage=sum*100/600;
		return percentage;
	}
	char calGrade()
	{
		
		if(percentage>60 && percentage<=70)
			grade='C';
		else if(percentage>70 && percentage<=80)
			grade='B';
		else if(percentage>80 && percentage<=90)
			grade='A';
		else if(percentage>90 && percentage<=100)
			grade='O';
		
		return grade;
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollno);
		System.out.println("Section: "+section);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
		System.out.println("Total marks: "+sum);
		System.out.println("Percentage: "+percentage);
		System.out.println("Grade: "+grade);
	}
}



