package AccountPackage;

import java.util.Scanner;
import java.util.Vector;

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
	
	@Override
	public Account upgradeToPremium(String PaymentMethod , int AmountToPay) {
		// TODO - implement Normal.upgradeToPremium
		boolean paymentSuccessful;
		int Choice;
		int amountPayed = 0;
		PremiumUser PU = null;
		
	/*	System.out.println("You can get all the previliges of a premium user just for 99$/year!");
		System.out.println("please choose your payment method:");
		System.out.println("1-credit\n2-PayPal");
		Choice = keyboard.nextInt();
*/
		switch (PaymentMethod) {
		case "credit":
			//System.out.println("input the amount of money you will pay");
			//will use normal Credit API///through them we should know if payment was successful or not
			//amountPayed = keyboard.nextInt();
			break;
		case "PayPal":
			//System.out.println("input the amount of money you will pay");
			//will use PayPal's API//
		//	amountPayed = keyboard.nextInt();
			break;
		default:
			System.out.println("wrong input");
			//amountPayed =0;
			return null;
		}
		
		
		if(AmountToPay < 99) {
			System.out.println("subscription was not successful, Try Again");
			return null;
		}
		else {
			System.out.println("payment successful");
			PU = new PremiumUser(this.accountController, this.Name, this.Password, this.email, this.userID);
			PU.SetType("Premium User");
		
			AccountManager AM = new AccountManager();
			 AM.removeUser(this.userID);
			 AM.AddAcount(PU);
				return PU;
		}
	}
}
