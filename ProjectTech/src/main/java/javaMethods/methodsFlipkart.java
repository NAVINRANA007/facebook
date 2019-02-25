package javaMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class methodsFlipkart {
	
	libaryMethods gmail=new libaryMethods();
	
	WebDriver driver;
	
	/*
	public void LoginToFlipKartMethod(WebDriver driver,String userId,String password) throws Exception
	{
		try {
			gmailPageLoctor login=PageFactory.initElements(driver, gmailPageLoctor.class);

			gmail.SendTextToWebElement(login.userName, userId);
		

			gmail.SendTextToWebElement(login.userPassword, password);
			gmail.clickActionToWebElement(login.LoginButton);
			
		}
		catch(Exception e)
		
		{
			e.getMessage();
		}
	}

	public void SelectProductFromFlipKart(WebDriver driver,String productSelection) throws Exception
	{
		try {
			gmailPageLoctor login=PageFactory.initElements(driver, gmailPageLoctor.class);


			gmail.mouseHoverAction(driver, login.MensMenu, productSelection);


		}
		catch(Exception e)
		{
			e.getMessage();
		}
} */
	public void launchURL(WebDriver driver,String url)
	{
	

	    driver.manage().window().maximize();
		
	    //Launch to Flipkart


		driver.get(url);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void registrationInputs(WebDriver driver,String URL2) throws Exception
	{

		gmailPageLoctor reg=PageFactory.initElements(driver, gmailPageLoctor.class);
		
		Thread.sleep(5000);
	
		String email=this.tempEmailfetchMethods(driver, URL2);
		
		gmail.SendTextToWebElement(reg.FirstNametxt,"Navin");
		gmail.SendTextToWebElement(reg.SurNametxt,"Rana");
		gmail.SendTextToWebElement(reg.NewPasswordtxt,"Test0001");
		gmail.SendTextToWebElement(reg.RegistratedEmailtxt,email);
		gmail.selectDropDown(driver, reg.CalenderDaydrpdn,"23");
		gmail.selectDropDown(driver, reg.CalenderMonthdrpdn,"3");
		gmail.selectDropDown(driver, reg.CalenderYeardrpdn,"1991");
		gmail.clickActionToWebElement(reg.Malechkb);
		gmail.clickActionToWebElement(reg.Submitbtn);
		
		
	}
	
	public String tempEmailfetchMethods(WebDriver driver,String URL2) throws Exception
	{
		gmailPageLoctor temp=PageFactory.initElements(driver, gmailPageLoctor.class);
		String parentWindow=driver.getWindowHandle();
		
		
		
		this.launchURL(driver, URL2);
		
		String childWindow=driver.getWindowHandle();
		Thread.sleep(5000);
		
		String temEmail=temp.mailAddresstxt.getText();
		driver.switchTo().window(parentWindow);
		
		 System.out.println("hello world !!");
		 return temEmail;
		
		
	}
}
