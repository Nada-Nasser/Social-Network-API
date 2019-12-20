import java.util.Date;

import AccountPackage.*;

public class Main {

	public static void main(String[] args) 
	{
		AccountManager manager = new AccountManager();
		AccountController accountController = new AccountController(manager);
		UserInterface userInterface = new UserInterface(accountController);
		
		
			
		userInterface.Register("email","Hussein", "Password", "gender", "country", new Date(12));
		userInterface.Register("email1","omar", "Password", "male", "country", new Date(12));
			
		//	AccountManager.AddAcount(new NormalAccount(accountController,"Name", "Password", "email", 1));
			//AccountManager.AddAcount(new NormalAccount(accountController,"Name2", "Password2", "email2", 2));
			
		 Account account = userInterface.login("email", "Hussein", "Password");
		 Account account2 = userInterface.login("email1", "omar", "Password");
		 
		 account2.sendFriendRequest();
		 
		 
		 for(int i = 0; i < account.getNotification().size(); i++)
		 {
			 System.out.println(account.getNotification().get(i).getContent());
		 }
		 
		 account.acceptFriendRequest();
		
		 for(int i = 0; i < account.getFriend().size(); i++)
		 {
			 System.out.println(account.getFriend().get(i).getName());
		 }
		 
			
			System.out.println(account.isLoggedin());
			System.out.println(account.getType());

			account.upgradeToPremium();
			
			account = manager.getUser(1);
			
			System.out.println(account.getType());
			

		}
		
	}

