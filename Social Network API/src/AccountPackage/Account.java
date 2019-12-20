package AccountPackage;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

import GroupsPackage.*;
import MessagesPackage.*;
import NotificationPackage.*;
import PagePackage.*;
import PostPackage.*;

public abstract class Account 
{
	protected String Name;
	protected String email;
	protected String Password;
	protected File ProfilePic;
	protected int userID;
	protected String gender;
	protected Date dateOfBith;
	protected String country; 
	protected String UserType;
	protected boolean isLoggedin;
	protected Vector<Notification> notifications = new Vector<Notification>();
	protected Vector<Account> friends = new Vector<Account>();
	protected HashMap<Integer, Message> Messages = new HashMap<Integer, Message>();
	protected Vector<Page> FollowPages = new Vector<Page>();
	protected Vector<Group> JoinedGroup =new Vector<Group>();
	protected Vector<Post> Posts = new Vector<Post>();
	protected AccountController accountController;
	
	public Account(AccountController Controller) 
	{
		// TODO Auto-generated constructor stub
		this.setAccountController(Controller);
	}
	
	
	/**
	 * @param content
	 * @param hashtag
	 * @param Privacy
	 * 
	 * @return {@link Post}
	 */
	public Post writePost(String content, HashTag hashtag, String Privacy) {
		// TODO - implement Account.writePost
		throw new UnsupportedOperationException();
	}

	/**
	 * @param destinationID
	 * 
	 * @return {@link Message}
	 */
	public Message sendMsg(int destinationID) {
		// TODO - implement Account.sendMsg
		throw new UnsupportedOperationException();
	}

	/**
	 * @param Name
	 * @param Pic
	 * @param about
	 * @param type
	 * 
	 * @return {@link Page}
	 */
	public Page createPage(String Name, File Pic, String about, String type) 
	{
		// TODO - implement Account.createPage
		throw new UnsupportedOperationException();
	}

	/**
	 * @param hashtag
	 */
	public Post[] retrievePosts(HashTag hashtag) {
		// TODO - implement Account.retrievePosts
		throw new UnsupportedOperationException();
	}

	/**
	 * @param PostID
	 */
	public void LikePost(int PostID) {
		// TODO - implement Account.LikePost
		throw new UnsupportedOperationException();
	}

	/**
	 * @param PostID
	 * 
	 * @return {@link Post}
	 */
	public Post sharePost(int PostID) 
	{
		// TODO - implement Account.sharePost
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param friend
	 */
	public void sendFriendRequest() 
	{
		// TODO - implement Account.AddFriend
		Scanner keybord = new Scanner(System.in);
		System.out.println("Enter name of friend: ");
		String name = keybord.nextLine();
		boolean foundAsFriend = false; 
		
		/* first check if user already exist in friends list */
		for(int i = 0; i < friends.size(); i++)
		{
			if(friends.get(i).getName().equals(name))
			{
				foundAsFriend = true;
				System.out.println("already exist in friends list");
			}
		}
		
		/* Two scenarios exist
		 * 	1- The user does not exist in the system.
		 * 	2- the user is not a friend but exist in the system.
		 * 		2.1- make notification contain the ID of the sender account & content = "New friend"
		 */
		if(!foundAsFriend)
		{
			if(accountController.RequestUserByname(name) == null)
			{
				System.out.println("This account does not exist");
			}
			else
			{
				Notification notify = new Notification();
				notify.setUserID(getUserID());
				notify.setContent("New friend request from " + this.Name);
				accountController.RequestUserByname(name).getNotification().add(notify);
			}
		}
		
		throw new UnsupportedOperationException();
	}
	
	
	
	public void acceptFriendRequest() 
	{
		// TODO - implement Account.AddFriend
		for(int i = 0; i < notifications.size(); i++)
		{
			if(notifications.get(i).getContent().contains("New friend"))
			{
				friends.add(accountController.RequestUserByID(notifications.get(i).getUserID()));
			}
		}
		throw new UnsupportedOperationException();
	}
	public void upgradeToPremium() {
		
	}

	/**
	 * 
	 * @param Name
	 * @param Privacy
	 * 
	 * @return {@link Group}
	 */
	public Group CreateGroup(String Name, String Privacy) 
	{
		// TODO - implement Account.CreateGroup
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param msg
	 */
	public void receiveMessage(Message msg) {
		// TODO - implement Account.receiveMessage
		throw new UnsupportedOperationException();
	}

	/**
	 * @param GroupID
	 */
	public void joinGroup(int GroupID) {
		// TODO - implement Account.joinGroup
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Gname
	 * 
	 * @return {@link Vector<Group>}
	 */
	public Group searchGroup(int GroupName) {
		// TODO - implement Account.searchGroup
		throw new UnsupportedOperationException();
	}

	/**
	 *  @return {@link Account.Name}
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public File getProfilePic() {
		return ProfilePic;
	}

	public void setProfilePic(File profilePic) {
		ProfilePic = profilePic;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public boolean isLoggedin() {
		return isLoggedin;
	}

	public void setLoggedin(boolean isLoggedin) {
		this.isLoggedin = isLoggedin;
	}


	public void setNotifications(Vector<Notification> notifications) {
		this.notifications = notifications;
	}
	
	public Vector<Notification> getNotification()
	{
		return notifications;
	}

	public HashMap<Integer, Message> getMessages() {
		return Messages;
	}

	public void setMessages(HashMap<Integer, Message> messages) {
		Messages = messages;
	}

	public Vector<Page> getFollowPages() {
		return FollowPages;
	}

	public void setFollowPages(Vector<Page> followPages) {
		FollowPages = followPages;
	}

	public Vector<Group> getJoinedGroup() {
		return JoinedGroup;
	}

	public void setJoinedGroup(Vector<Group> joinedGroup) {
		JoinedGroup = joinedGroup;
	}

	public Vector<Post> getPosts() {
		return Posts;
	}

	public void setPosts(Vector<Post> posts) {
		Posts = posts;
	}

	public AccountController getAccountController() {
		return accountController;
	}

	public void setAccountController(AccountController accountController) {
		this.accountController = accountController;
	}

	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String g)
	{
		gender = g;
	}
	
	public Date getDateOfBirth()
	{
		return dateOfBith;
	}
	
	public void setDateOfBirth(Date g)
	{
		dateOfBith = g;
	}
	
	public String getcountry()
	{
		return country;
	}
	
	public void setcountry(String c)
	{
		country = c;
	}
	public void SetType(String Type) {
		UserType = Type;
	}
	public String getType() {
		return UserType;
	}
}
