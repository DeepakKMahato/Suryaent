package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class LoginPage extends BasePage
{
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement usernametextfield;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordtextfield;
	
	@FindBy(xpath = "//button[@id='login']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//a[normalize-space()='Task']//i[@class='fa fa-tasks fa-fw']")
	private WebElement taskinmajortab;
	
	@FindBy(xpath = "//a[normalize-space()='New IT Development']")
	private WebElement newitdevlopmentmajortab;
	
	@FindBy(xpath = "//i[@class='fa fa-bars']")
	private WebElement menubar;
	
	@FindBy(xpath = "//a[normalize-space()='Task List']")
	private WebElement tasklistminortab;
	
	@FindBy(xpath = "//a[normalize-space()='Add Task']")
	private WebElement addtaskbutton;
	
	@FindBy(xpath = "//input[@id='titleadd']")
	private WebElement addtitletextbar;
	
	@FindBy(xpath = "//textarea[@id='descriptionadd']")
	private WebElement adddescriptiontextbar;

	@FindBy(xpath = "//span[@id='select2-reporteradd-container']")
	private WebElement reporterdropdownlist;
	
	
	
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void logininsuryammethod() throws InterruptedException
	{
		waitVisibilityofElement(driver, usernametextfield);
		javascriptHighlightElement(driver, usernametextfield);
		usernametextfield.sendKeys("jyotip");
		
		waitVisibilityofElement(driver, passwordtextfield);
		javascriptHighlightElement(driver, passwordtextfield);
		passwordtextfield.sendKeys("jyotis@123");
		
		waitVisibilityofElement(driver, loginbutton);
		clickOnElement(driver, loginbutton);
		
		
	}
	
	public void newitdevelopmenttabmethod()
	{
		waitVisibilityofElement(driver, menubar);
		clickOnElement(driver, menubar);
		
		waitVisibilityofElement(driver, newitdevlopmentmajortab);
		javascriptClick(driver, newitdevlopmentmajortab);
		
		waitVisibilityofElement(driver, tasklistminortab);
		javascriptClick(driver, tasklistminortab);
		
		
	}
	
	public void alltaskpagemethod() throws Exception
	{
		waitVisibilityofElement(driver, addtaskbutton);
		clickOnElement(driver, addtaskbutton);
		
		waitVisibilityofElement(driver, addtitletextbar);
		javascriptHighlightElement(driver, addtitletextbar);
		addtitletextbar.sendKeys("Testing module A");
		
		waitVisibilityofElement(driver, adddescriptiontextbar);
		javascriptHighlightElement(driver, adddescriptiontextbar);
		adddescriptiontextbar.sendKeys("Checking end to end scenarios");
		
		waitVisibilityofElement(driver, reporterdropdownlist);
		clickOnElement(driver, reporterdropdownlist);
//		selectByText(driver, reporterdropdownlist,  "Bikash Pradhan");
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
