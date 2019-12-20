package AccountPackage;

import java.util.Scanner;

public class NormalAccount extends Account 
{
	Scanner keyboard = new Scanner(System.in);
	
	public NormalAccount(AccountController Controller) {
		super(Controller);
		// TODO Auto-generated constructor stub
	}

	public NormalAccount(AccountController Controller , String name , String password , String e_mail , int ID)
	{
		super(Controller);
		Name = name;
		Password = password;
		email = e_mail;
		userID = ID;
	}
	
	public void upgradeToPremium() {
		// TODO - implement Normal.upgradeToPremium
		boolean paymentSuccessful;
		System.out.println("please choose your payment method:");
		System.out.println("1- credit\n2-PayPal");
		int Choice = keyboard.nextInt();
		
		switch (Choice) {
		case 1:
			/*will use normal Credit API*/
			System.out.println("input the amount of money you will pay");
			break;
		case 2:
			/*will use PayPal's API*/
		default:
			System.out.println("wrong input");
			break;
		}
		
		
		throw new UnsupportedOperationException();
	}
}
