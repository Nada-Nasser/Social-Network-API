package MessagesPackage;

import AccountPackage.Account;

public class Message {

	private String content;
	private Account sender;
	private Account receiver;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Account getSender() {
		return sender;
	}
	public void setSender(Account sender) {
		this.sender = sender;
	}
	public Account getReceiver() {
		return receiver;
	}
	public void setReceiver(Account receiver) {
		this.receiver = receiver;
	}

}
