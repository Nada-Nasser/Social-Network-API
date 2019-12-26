package TestingAPI;

import org.testng.annotations.Test;

import AccountPackage.Account;
import AccountPackage.AccountController;
import AccountPackage.AccountManager;
import AccountPackage.NormalAccount;
import AccountPackage.UserInterface;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class RegisterTesting 
{

	UserInterface userInterface = new UserInterface();

		
	@Test(dataProvider = "dp")
	public void Register(String email, String Name, String Password , String gender , String country,Date dateOfBirth) 
	{
		  Account account1 = userInterface.Register( email,  Name,  Password ,  gender ,  country, dateOfBirth);
		  Assert.assertEquals(
				  account1.getUserID()
				  ,AccountManager.getnAccounts()-1);
	}

	@DataProvider
	public Object[][] dp() 
	{
	  return new Object[][] {
		  new Object[] {"email.gmail" , "Name" , "Password" , "M" , "us" , new Date(12)},
		  new Object[] {"email2.gmail" , "Name" , "Password" , "M" , "us" , new Date(12)},
		  new Object[] {"email3.gmail" , "Name" , "Password" , "M" , "us" , new Date(12)},	  
	  };
	}
}
