package GroupsPackage;

import java.io.File;

public class Group {
	private int GroupID;
	private String Name;
	private String PrivacyStatus;
	private File Picture;
	
	
	public int getGroupID() {
		return GroupID;
	}
	public void setGroupID(int groupID) {
		GroupID = groupID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPrivacyStatus() {
		return PrivacyStatus;
	}
	public void setPrivacyStatus(String privacyStatus) {
		PrivacyStatus = privacyStatus;
	}
	public File getPicture() {
		return Picture;
	}
	public void setPicture(File picture) {
		Picture = picture;
	}
}
