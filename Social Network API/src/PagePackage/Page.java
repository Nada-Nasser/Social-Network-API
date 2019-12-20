package PagePackage;

import java.io.File;

public class Page 
{

	private int nLikes;
	private String name;
	private String type;
	private File Picture;
	private String about;
	private int PageID;
	public int getnLikes() 
	{
		return nLikes;
	}
	public void setnLikes(int nLikes) 
	{
		this.nLikes = nLikes;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public File getPicture() 
	{
		return Picture;
	}
	public void setPicture(File picture) 
	{
		Picture = picture;
	}
	public String getAbout() 
	{
		return about;
	}
	public void setAbout(String about) 
	{
		this.about = about;
	}
	public int getPageID() 
	{
		return PageID;
	}
	public void setPageID(int pageID) 
	{
		PageID = pageID;
	}

}
