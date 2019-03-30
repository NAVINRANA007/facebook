package javaMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class gmailPageLoctor
{

	WebDriver driver;

	public gmailPageLoctor(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	//Login to Gmail 

	/*@FindBy(how=How.CSS,using="input[type='text'][class='_2zrpKA']")
	WebElement userName;

	@FindBy(how=How.CSS,using="input[type='password'][class*='_2zrpKA']")
	WebElement userPassword;

	@FindBy(how=How.CSS,using="button[type='submit'][class*='_2AkmmA']")
	WebElement LoginButton;

	@FindBy(how=How.CSS,using="div[id='container']>div>header>div:nth-child(3)>ul>li:nth-child(3)>span")
	WebElement MensMenu;

	@FindBy(how=How.CSS,using="a[title='Watches'][href*='Men']")
	WebElement MensWatches;
	*/
	
	@FindBy(how=How.CSS,using="input[type='email'][id='email']")
	WebElement EmailorPhonetxt;
	@FindBy(how=How.CSS,using="input[type='password'][id='pass']")
	WebElement Passwordtxt;
	@FindBy(how=How.CSS,using="input[name='firstname']")
	WebElement FirstNametxt;
	@FindBy(how=How.CSS,using="input[name='lastname']")
	WebElement SurNametxt;
	@FindBy(how=How.CSS,using="input[name='reg_email__']")
	WebElement RegistratedEmailtxt;
	@FindBy(how=How.CSS,using="input[name='reg_passwd__']")
	WebElement NewPasswordtxt;
	@FindBy(how=How.CSS,using="select[name='birthday_day']")
	WebElement CalenderDaydrpdn;
	@FindBy(how=How.CSS,using="select[name='birthday_month']")
	WebElement CalenderMonthdrpdn;
	@FindBy(how=How.CSS,using="select[name='birthday_year")
	WebElement CalenderYeardrpdn;
	@FindBy(how=How.CSS,using="input[name='sex'][value='2']")
	WebElement Malechkb;
	@FindBy(how=How.CSS,using="input[name='sex'][value='1']")
	WebElement Femalechkb;
	@FindBy(how=How.CSS,using="button[name='websubmit']")
	WebElement Submitbtn;
	@FindBy(how=How.CSS,using="input[id='mailAddress']")
	WebElement mailAddresstxt;
	@FindBy(how=How.CSS,using="input[id='mail'] ")
	WebElement tempMail;
	@FindBy(how=How.CSS,using="input[name^='reg_email_confirmation']")
	WebElement mailAddressConfirmation;
	@FindBy(how=How.CSS,using="input[name='code']")
	WebElement fbCode;
	@FindBy(how=How.CSS,using="input[name='code']")
	WebElement confirmbtn;
	@FindBy(how=How.CSS,using="div>h4[class='pm-subject']")
	WebElement mailSubject;
	@FindBy(how=How.XPATH,using="//table[@id='mails']//tr/td[3]/a")
	WebElement mailAnchorLink;
	@FindBy(how=How.CSS,using="button[value='Secure Account']")
	WebElement secureConnectionbtn;
	
}
