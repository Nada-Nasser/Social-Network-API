package AccountPackage;


public class PremiumUser extends Account {

	public PremiumUser(AccountController Controller) {
		super(Controller);
		// TODO Auto-generated constructor stub
	}
	public PremiumUser(AccountController Controller , String name , String password , String e_mail , int ID)
	{
		super(Controller);
		Name = name;
		Password = password;
		email = e_mail;
		userID = ID;
	}
	private int nOfAds;
	private boolean checkNads;

	public void payMentMethod() {
		// TODO - implement Premium.payMentMethod
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param content
	 * @param nOfadds
	 */
	public void makeAd(int content, int nOfadds) {
		// TODO - implement Premium.makeAd
		throw new UnsupportedOperationException();
	}

	public int getnOfAds() {
		return nOfAds;
	}

	public void setnOfAds(int nOfAds) {
		this.nOfAds = nOfAds;
	}

	public boolean isCheckNads() {
		return checkNads;
	}

	public void setCheckNads(boolean checkNads) {
		this.checkNads = checkNads;
	}

}
