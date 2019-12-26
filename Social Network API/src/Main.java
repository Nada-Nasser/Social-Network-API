import java.util.Date;

import AccountPackage.*;

public class Main {

	public static void main(String[] args) 
	{
		UserInterface userInterface = new UserInterface();
		
		
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

			account = account.upgradeToPremium("PayPal" , 100);
			
			if(account!= null)
				System.out.println(account.getType());

			/*
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
		*/
	}
	}

