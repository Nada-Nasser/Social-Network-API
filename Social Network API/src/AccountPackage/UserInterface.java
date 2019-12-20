package AccountPackage;


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
	 */
	public Account Register(String email, String Name, String Password) {
		// TODO - implement UserInterface.Register
		throw new UnsupportedOperationException();
	}

	/** 
	 * @param email
	 * @param Name
	 * @param Password
	 */
	public Account login(String email, String Name, String Password) {
		// TODO - implement UserInterface.login
		return accountController.ActivateAccount(Name, Password, email);
	
		///throw new UnsupportedOperationException();
	}

}
