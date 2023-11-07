package classesAndObjects;
import java.util.Scanner;
public class ProductApp {

	public static void main(String[] args) {
		
		Product p1=new Product();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name ");
		p1.name=s.nextLine();
		System.out.println("Enter id");
		p1.id=s.nextInt();
		System.out.println("Enter price");
		p1.price=s.nextInt();
		System.out.println("Enter quantity");
		p1.quantity=s.nextInt();
		System.out.println("Enter discount");
		p1.discount=s.nextDouble();
		p1.quantityCal();
		p1.calDiscount();
		p1.display();
		
	}
}
class Product
{
	int id,price,quantity,total;
	String name;
	double discount,finalamount;
	void quantityCal()
	{
		total=price*quantity;
	}
	void calDiscount()
	{
		finalamount=total-(discount/100*total);
	}
	void display()
	{
		System.out.println("Name : "+name+"\nPrice :"+price);
		System.out.println("Id :"+id+"\nQuantity: "+quantity);
		System.out.println("Total: "+total);
		System.out.println("Discount: "+discount+"%");
		System.out.println("Final amount: "+finalamount);
	}
}
