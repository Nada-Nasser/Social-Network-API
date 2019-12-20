package AccountPackage;

import java.util.Vector;

import PostPackage.Post;

public class AccountManager 
{


	private int nAccounts;
	
	/**
	 * 
	 * All Accounts that's saved in the database
	 */
	private static  Vector<Account> AllAccount = new Vector<Account>();
	
	
	/**
	 * 
	 * @param ID
	 * 
	 * @return {@link Account}
	 */
	public Account getUser(int ID) 
	{
		// TODO - implement AccountManager.getUser
		for(int i = 0 ; i < AllAccount.size() ;i++)
		{
			Account account = AllAccount.get(i);
			if(account.getUserID() == ID)
			{
				return account;
			}
		}
		return null;
	}

	/**
	 * search for the account that has these data in {@link AccountManager}.AllAccount
	 * @param name
	 * @param Password
	 * @param email
	 * 
	 * @return {@link Account}.UserID
	 */
	public int CheckLoginInfo(String name, String Password, String email) 
	{
		// TODO - implement AccountManager.CheckInfo
		for(int i = 0 ; i < AllAccount.size() ;i++)
		{
			Account account = AllAccount.get(i);
			if(account.getEmail().equals(email) && account.getName().equals(name) && account.getPassword().equals(Password))
			{
				return account.getUserID();
			}
		}
		return -1;
	}
	
	public int CheckInfo(String name, String Password, String email)
	{
		throw new UnsupportedOperationException();
	}
	/**
	 * 
	 * @param Account
	 */
	public void AddAcount(Account account) {
		// TODO - implement AccountManager.AddAcount
		AllAccount.add(account);
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public boolean ValidateUserID(int ID) 
	{
		// TODO - implement AccountManager.ValidateUserID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param post
	 * @param User
	 */
	public boolean CheckUserHasLike(Post post, Account User) {
		// TODO - implement AccountManager.CheckUserHasLike
		throw new UnsupportedOperationException();
	}

	public int getnAccounts() 
	{
		return nAccounts;
	}

	public void setnAccounts(int nAccounts) 
	{
		this.nAccounts = nAccounts;
	}

	public static Vector<Account> getAllAccount() 
	{
		return AllAccount;
	}

	public static void setAllAccount(Vector<Account> allAccount) 
	{
		AllAccount = allAccount;
	}
	
}
