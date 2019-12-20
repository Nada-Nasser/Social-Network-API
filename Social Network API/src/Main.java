import java.util.Date;

import AccountPackage.*;

public class Main {

	public static void main(String[] args) 
	{
		AccountManager manager = new AccountManager();
		AccountController accountController = new AccountController(manager);
		UserInterface userInterface = new UserInterface(accountController);
		
		
			
			userInterface.Register("email","Name", "Password", "gender", "country", new Date(12));
			
		//	AccountManager.AddAcount(new NormalAccount(accountController,"Name", "Password", "email", 1));
			//AccountManager.AddAcount(new NormalAccount(accountController,"Name2", "Password2", "email2", 2));
			
		 Account account = userInterface.login("email", "Name", "Password");
		//	Account account2 = userInterface.login("email", "Name2", "Password");// returns NULL
			
			System.out.println(account.isLoggedin());
			System.out.println(account.getType());

			account.upgradeToPremium();
			
			account = manager.getUser(1);
			
			System.out.println(account.getType());
			

		}
		
	}

