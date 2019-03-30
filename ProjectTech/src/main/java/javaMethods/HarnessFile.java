package javaMethods;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HarnessFile  {

	

	// Browser Launch 


	public static void main(String [] args) throws Exception
	
	{
		Properties properties=new Properties();
		properties.load(new FileReader(new File("test.properties")));
		String driverPath=properties.getProperty("driverPath");
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver= new ChromeDriver();
		
		methodsFlipkart methods=new methodsFlipkart();
		
		//launch the url.
		
		String url=properties.getProperty("URL");
		
		methods.launchURL(driver, url);

		
       //Registration on Facebook.
		
		String URL2=properties.getProperty("url2");
		
		methods.registrationInputs(driver, URL2);
		
		//Verification code
		String verificationCode=methods.verificationCode(driver);
		
		String[] ar=verificationCode.split(" ");
		String getCode=ar[0];
		methods.facebookVerification(driver, getCode);
		
		

		


	}


}
