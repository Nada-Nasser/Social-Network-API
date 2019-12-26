package TestingAPI;

import static org.testng.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AccountPackage.Account;
import AccountPackage.UserInterface;

public class Send_AcceptTest {
  
	  public static UserInterface userInterface = new UserInterface();
	  public static Account reciever =  userInterface.Register("omar.gmail", "omar", "123456", "male", "Saudi-Arabia", new Date(4));
	  public static Account sender = userInterface.Register( "email1.gmail",  "hussein",  "1111" ,"male" ,  "Egypt", new Date(5));

  @Test
  public void SendAccept1() 
  {
	  String input = "omar";
	  InputStream in = new ByteArrayInputStream(input.getBytes());
	  System.setIn(in);

	 
	  
	  assertEquals(sender.sendFriendRequest(), true);
	  assertEquals(reciever.acceptFriendRequest(), true);
	  
  }
  @Test
  public void SendAccept2() 
  {
	  String input = "omar";
	  InputStream in = new ByteArrayInputStream(input.getBytes());
	  System.setIn(in);
	  
	  assertEquals(sender.sendFriendRequest(), false);
	  assertEquals(reciever.acceptFriendRequest(), false);

  }
  
  @Test
  public void SendAccept3() 
  {
	  String input = "fakhry";
	  InputStream in = new ByteArrayInputStream(input.getBytes());
	  System.setIn(in);
	  
	  assertEquals(sender.sendFriendRequest(), false);
	  assertEquals(reciever.acceptFriendRequest(), false);

  }
  
   
}
