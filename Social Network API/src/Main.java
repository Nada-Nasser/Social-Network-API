import java.util.Date;

import AccountPackage.*;

public class Main {

	public static void main(String[] args) 
	{
		UserInterface userInterface = new UserInterface();
		
		try {
			
			Account account = userInterface.Register("email","Name", "Password", "gender", "country", new Date(12));
			System.out.println(AccountManager.getnAccounts());
			Account account2 = userInterface.Register("email2","Name2", "Password2", "gender", "country", new Date(12));
			System.out.println(AccountManager.getnAccounts());
			Account account3 = userInterface.Register("email3","Name2", "Password2", "gender", "country", new Date(12));
			System.out.println(AccountManager.getnAccounts());
			Account account4 = userInterface.Register("email4","Name2", "Password2", "gender", "country", new Date(12));
			System.out.println(AccountManager.getnAccounts());
			
			System.out.println(account.getUserID() + " " + account.isLoggedin());
			System.out.println(account2.getUserID() + " " + account2.isLoggedin());
			System.out.println(account3.getUserID() + " " + account2.isLoggedin());
			System.out.println(account4.getUserID() + " " + account2.isLoggedin());
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
