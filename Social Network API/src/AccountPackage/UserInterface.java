package AccountPackage;

import java.util.Date;

public class UserInterface 
{
	AccountController accountController;
	
	public UserInterface(AccountController Controller) {
		// TODO Auto-generated constructor stub
		accountController=Controller;
	}
	
	/**
	 * @param email
	 * @param Name
	 * @param Password
	 * 
	 * @return {@link Account} 
	 */
	public Account Register(String email, String Name, String Password , String gender , String country,Date dateOfBirth)
	{
		return accountController.RequestRegister(email, Name,Password , gender , country , dateOfBirth);
	}

	/** 
	 * @param email
	 * @param Name
	 * @param Password
	 * 
	 * @return {@link Account} 
	 */
	public Account login(String email, String Name, String Password) 
	{
		return accountController.RequestLogin(Name, Password, email);
	}

}
