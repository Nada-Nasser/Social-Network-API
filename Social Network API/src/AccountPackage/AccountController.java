package AccountPackage;


public class AccountController 
{
	
	AccountManager accountManager = new AccountManager();
	
	public AccountController(AccountManager manager) 
	{
		// TODO Auto-generated constructor stub
		accountManager = manager;
	}
	
	/**
	 * 
	 * @param name
	 * @param email
	 * @param password
	 */
	public String RequestRegister(String name, String email, String password) 
	{
		// TODO - implement AccountsCntroller.RequestRegister
		throw new UnsupportedOperationException();
	}

	/**
	 * @param Username
	 * @param Password
	 * @param email
	 * 
	 * @return {@link Account}
	 */
	public Account ActivateAccount(String Username, String Password, String email) 
	{
		// TODO - implement AccountsCntroller.ActivateAccount
		int UserID = accountManager.CheckLoginInfo(Username, Password, email);
		Account account; 
		if(UserID != -1)
		{
			account = accountManager.getUser(UserID);
			account.setLoggedin(true);
			return account;
		}
		else
		{
			return null;
		}	
	///	throw new UnsupportedOperationException();
	}
	public Account RequestUserByname(String name)
	{
		for(int i = 0; i < accountManager.getAllAccount().size(); i++)
		{
			if(accountManager.getAllAccount().get(i).getName().equals(name))
			{
				return accountManager.getAllAccount().get(i);
			}
		}
		return null;
	}
	public Account RequestUserByID(int ID)
	{
		for(int i = 0; i < accountManager.getAllAccount().size(); i++)
		{
			if(accountManager.getAllAccount().get(i).getUserID() == ID)
			{
				return accountManager.getAllAccount().get(i);
			}
		}
		return null;
	}

}
