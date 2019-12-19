package PostPackage;

public class HashTag {

	@SuppressWarnings("unused")
	private String name;
	private int importance;
	private int nPosts;
	private Post[] posts;

	/**
	 * 
	 * @param nPosts
	 */
	public void incermementNumPosts(int nPosts) {
		// TODO - implement HashTag.incermementNumPosts
		throw new UnsupportedOperationException();
	}

	public int getnPosts() {
		return nPosts;
	}

	public void setnPosts(int nPosts) {
		this.nPosts = nPosts;
	}

	public Post[] getPosts() {
		return posts;
	}

	public void setPosts(Post[] posts) {
		this.posts = posts;
	}

	public int getImportance() {
		return importance;
	}

	public void setImportance(int importance) {
		this.importance = importance;
	}

}