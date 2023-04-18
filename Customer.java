package MyShop;

import java.util.Scanner;

public class Customer {

	String cname;
	String address;
	int pincode;
	void getData()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter customer name");
		cname=s.next();
		System.out.println("enter customer address");
		address=s.next();
		System.out.println("enter customer pincode");
		pincode=s.nextInt();
	}
	 void display()
	 {
		 System.out.println(cname +" "+ address+"  "+ pincode);
		 
	 }
}
