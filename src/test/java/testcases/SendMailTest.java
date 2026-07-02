package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.AppUtils;

public class SendMailTest extends AppUtils
{

	@Parameters({"email","sub"})
	@Test
	public void sendMail(String mailid,String sub)
	{
		System.out.println("Mail Sent to "+mailid+" with the subject "+sub);
	}
	
	
}
