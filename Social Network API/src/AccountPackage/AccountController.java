package AccountPackage;

import java.util.Date;

public class AccountController 
{
	
	AccountManager accountManager = new AccountManager();
	
	public AccountController(AccountManager manager) {
		// TODO Auto-generated constructor stub
		accountManager = manager;
	}
	
	/**
	 * 
	 * @param name
	 * @param email
	 * @param password
	 * 
	 * @return {@link Account} if there isn't any account has same email in Account Manager
	 * else it will return {@value null}
	 */
	public Account RequestRegister(String email, String name, String password, String gender, String country,
			Date dateOfBirth) {
		// TODO Auto-generated method stub
		boolean  isValid = accountManager.CheckRegsterInfo(email);
		Account account = null;
		if(isValid)
		{
			int ID = accountManager.getnAccounts()+1;
			account = new NormalAccount(this, name, password, email, ID);
			
			accountManager.AddAcount(account);
		}
		return account;
	}

	/**
	 * @param Username
	 * @param Password
	 * @param email
	 * 
	 * @return {@link Account}
	 */
	public Account RequestLogin(String Username, String Password, String email) {
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
	}

	

}
