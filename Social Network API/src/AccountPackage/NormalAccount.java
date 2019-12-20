package AccountPackage;


public class NormalAccount extends Account 
{
	
	public NormalAccount(AccountController Controller) {
		super(Controller);
		// TODO Auto-generated constructor stub
	}

	public NormalAccount(AccountController Controller , String name , String password , String e_mail , int ID)
	{
		super(Controller);
		Name = name;
		Password = password;
		email = e_mail;
		userID = ID;
	}
	
	public void upgradeToPremium() {
		// TODO - implement Normal.upgradeToPremium
		throw new UnsupportedOperationException();
	}
}
