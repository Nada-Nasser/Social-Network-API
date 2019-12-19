package PostPackage;

import AccountPackage.Account;

public class PostController {

	/**
	 * 
	 * @param content
	 * @param hashtag
	 * @param Privacy
	 */
	public Post RequestCreatePost(String content, HashTag hashtag, String Privacy) {
		// TODO - implement PostController.RequestCreatePost
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param post
	 * @param Privacy
	 * @param User
	 */
	public void ResquestToShare(Post post, String Privacy, Account User) {
		// TODO - implement PostController.ResquestToShare
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param post
	 */
	public void incerementNumShares(Post post) {
		// TODO - implement PostController.incerementNumShares
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param post
	 */
	public int incerementLikes(Post post) {
		// TODO - implement PostController.incerementLikes
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param post
	 */
	public int decerementShares(Post post) {
		// TODO - implement PostController.decerementShares
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param PostID
	 */
	public Post RetrievePost(int PostID) {
		// TODO - implement PostController.RetrievePost
		throw new UnsupportedOperationException();
	}

}