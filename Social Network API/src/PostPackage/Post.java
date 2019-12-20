package PostPackage;

import javax.swing.Spring;

public class Post {

	private int PostID;
	private String content;
	private HashTag hashTag;
	private int nLikes;
	private int nShares;
	private String PrivacyStatus;
	
	public int getPostID() {
		return PostID;
	}
	public void setPostID(int postID) {
		PostID = postID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public HashTag getHashTag() {
		return hashTag;
	}
	public void setHashTag(HashTag hashTag) {
		this.hashTag = hashTag;
	}
	public int getnLikes() {
		return nLikes;
	}
	public void setnLikes(int nLikes) {
		this.nLikes = nLikes;
	}
	public int getnShares() {
		return nShares;
	}
	public void setnShares(int nShares) {
		this.nShares = nShares;
	}
	public String getPrivacyStatus() {
		return PrivacyStatus;
	}
	public void setPrivacyStatus(String privacyStatus) {
		PrivacyStatus = privacyStatus;
	}

}