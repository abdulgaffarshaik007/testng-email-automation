package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils
{

	@BeforeTest
	public void login()
	{
		System.out.println("Login to GMail");
	}
	
	
	@AfterTest
	public void logout()
	{
		System.out.println("Logout from GMail");
	}
	
	@BeforeSuite
	public static void launchApp()
	{
		System.out.println("Launch GMail App");
	}
	
	@AfterSuite
	public static void closeApp()
	{
		System.out.println("Close GMail App");
	}
	
	
}
