package AddvertisementPackage;

import java.util.Vector;

public class Advertisement 
{
	private int userID;
	private String header;
	private Vector<String> description;
	private Vector<String> headlines;
	public int getUserID() 
	{
		return userID;
	}
	public void setUserID(int userID) 
	{
		this.userID = userID;
	}
	public String getHeader() 
	{
		return header;
	}
	public void setHeader(String header) 
	{
		this.header = header;
	}
	public Vector<String> getDescription() 
	{
		return description;
	}
	public void setDescription(Vector<String> description) 
	{
		this.description = description;
	}
	public Vector<String> getHeadlines() 
	{
		return headlines;
	}
	public void setHeadlines(Vector<String> headlines) 
	{
		this.headlines = headlines;
	}
}
