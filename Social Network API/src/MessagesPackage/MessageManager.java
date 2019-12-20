package MessagesPackage;

import java.util.Vector;

public class MessageManager {
	private int nMessages;
	private Vector<Message> Messages;
	/**
	 * 
	 * @param FriendID
	 */
	public boolean ValidateUserID(int FriendID) {
		// TODO - implement MessageManager.ValidateUserID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param msg
	 */
	public void AddMessage(Message msg) {
		// TODO - implement MessageManager.AddMessage
		throw new UnsupportedOperationException();
	}

	public int getnMessages() {
		return nMessages;
	}

	public void setnMessages(int nMessages) {
		this.nMessages = nMessages;
	}

	public Vector<Message> getMessages() {
		return Messages;
	}

	public void setMessages(Vector<Message> messages) {
		Messages = messages;
	}
}
