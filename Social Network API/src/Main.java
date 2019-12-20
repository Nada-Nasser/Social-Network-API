import java.util.Date;

import AccountPackage.*;

public class Main {

	public static void main(String[] args) 
	{
		AccountManager manager = new AccountManager();
		AccountController accountController = new AccountController(manager);
		UserInterface userInterface = new UserInterface(accountController);
		
		try {
			
			userInterface.Register("email","Name", "Password", "gender", "country", new Date(12));
			
			manager.AddAcount(new NormalAccount(accountController,"Name", "Password", "email", 1));
			manager.AddAcount(new NormalAccount(accountController,"Name2", "Password2", "email2", 2));
			
			Account account = userInterface.login("email", "Name", "Password");
			Account account2 = userInterface.login("email", "Name2", "Password");// returns NULL
			
			System.out.println(account.isLoggedin());
			//System.out.println(account2.isLoggedin());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
