package oops;

public class BANKapplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Union Bank");
		System.out.println("Our terms and charges");
		System.out.println();
		System.out.println();
		
		UnionBank ub=new UnionBank();
		ub.credit();
		ub.withdrawal();
		ub.maxtransaction();
		ub.minbalance();
		ub.servicecharge();
		ub.maintenancefee();
		System.out.println("---------------------------------------------------");
		System.out.println("Welcome to SBI bank");
		System.out.println("Our terms and charges");
		System.out.println();
		System.out.println();
		SBI sbi=new SBI();
		sbi.credit();
		sbi.withdrawal();
		sbi.maxtransaction();
		sbi.minbalance();
		sbi.servicecharge();
		sbi.maintenancefee();
	}
}
interface Bank
{
	public void credit();
	public void withdrawal();
	public void maxtransaction();
	public void minbalance();
	public void servicecharge();
	public void maintenancefee();
}
class UnionBank implements Bank
{
	public void credit()
	{
		System.out.println("Maximum Credit Amount : 30000rs");
	}
	public void withdrawal()
	{
		System.out.println("Maximum withdrawal amount per transaction : 10000rs");
	}
	public void maxtransaction()
	{
		System.out.println("Maximum transactions per day cannot exceed 10 transactions");
	}
	public void minbalance()
	{
		System.out.println("Minimum balance to be maintained in the account:1000rs");
	}
	public void servicecharge()
	{
		System.out.println("Service Charges per month : 50rs");
	}
	public void maintenancefee()
	{
		System.out.println("Maintenance fee per year : 1000rs");
	}
}
class SBI implements Bank
{
	public void credit()
	{
		System.out.println("Maximum credit amount : 20000rs");
	}
	public void withdrawal()
	{
		System.out.println("Maximum withdrawal amount per transaction : ");
	}
	public void maxtransaction()
	{
		System.out.println("Maximum transaction per day cannot exceed 20 transactions");
	}
	public void minbalance()
	{
		System.out.println("Minimum balance to be maintained in the amount:1200rs");
	}
	public void servicecharge()
	{
		System.out.println("Service charge per month : 50rs");
	}
	public void maintenancefee()
	{
		System.out.println("Maintenance fee per year : 1200rs");
	}
}


