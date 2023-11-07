package oops;

public class setget {

	public static void main(String[] args) {
		SetterGetters setter=new SetterGetters();
		setter.setname("Sindhuja");
		setter.setsection('B');
		setter.setrollno(15);
		setter.setaddress("Karimnagar");
		setter.setmarks(95);
		System.out.println("Name: "+setter.getname()+" Section:  "+setter.getsection()+" Rollno: "+setter.getrollno());
		System.out.println("Marks: "+setter.getmarks()+" Address: "+setter.getaddress());
	}

}
