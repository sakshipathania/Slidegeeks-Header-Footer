package SetupClass.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


import SetupClass.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;

public class Footer extends Setup {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void clear_cache() throws InterruptedException
	{
		driver.manage().deleteAllCookies();
		Thread.sleep(4200);
		log.info("DELETE COOKIES");
	}
	
	public void err_page() throws InterruptedException
	{
		
		pagetitle=driver.getTitle().toUpperCase();
		System.out.println("Title of the Page is:-"+""+pagetitle);
		Thread.sleep(3500);
		
		try
		{
			driver.getPageSource().contains("404 Not Found");
		}
	    catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void chat_pop_up() throws InterruptedException
	{
		try {
			WebElement iframe = driver.findElement(By.id("livechat-full-view"));
			if(iframe.isDisplayed()) {
				driver.switchTo().frame(iframe);   
				 Actions act = new Actions(driver);
				 act.moveToElement(driver.findElement(By.cssSelector("#title .icon-minimize"))).build().perform();
				 Thread.sleep(2000);
					WebElement chat1=driver.findElement(By.cssSelector("#title .icon-minimize"));
					 Thread.sleep(1000);
						chat1.click();
						 Thread.sleep(1000);
						 driver.switchTo().defaultContent();
						 Thread.sleep(1000);
						 driver.switchTo().parentFrame();
					 Thread.sleep(1000);
			}
			else {
					System.out.println("chat window does not open");
			     }
		}
				catch(NoSuchElementException NCP) {
					
				}
	}
  
  
  @Given("^Open the Website URL1\\.$")
	public void open_the_Website_URL1() throws InterruptedException {
		
		driver.get(AppURL);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	log.info("It's opening the website URL");
	Thread.sleep(1000);
	driver.get("https://www.slideteam.net");
	Thread.sleep(2000);
	driver.get("https://www.slideteam.net");
	Thread.sleep(2000);
         driver.manage().deleteAllCookies();
         Thread.sleep(2000);
	try {
		driver.findElement(By.cssSelector(".authorization-link > a:nth-child(1)")).click();
		Thread.sleep(2000);
		log.info("It's opening the website URL");
	} 
	catch (NoSuchElementException popup) {
	}
	}

	@Then("^user enter email and password$")
       public void user_enter_email_and_password() throws InterruptedException  {
    
	       WebElement old_paid_email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/form/fieldset/div[2]/div/input")));
               old_paid_email.sendKeys("sakshi.pathania@slidetech.in");
    
               WebElement old_paid_pass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/form/fieldset/div[3]/div/input")));
               old_paid_pass.sendKeys("Qwerty@1");
	       
	       Thread.sleep(3000);
	       WebElement old_paid_login_btn=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.login > span:nth-child(1)")));
	       old_paid_login_btn.click();
        }
        
      @Then("^Free Business PPT\\.$")
	public void Free_Business_PPT() throws Throwable {
		
		WebElement footer_1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='first'][contains(.,'Free Business PPT')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",footer_1);
		footer_1.click();
		log.info("FOOTER --> 1 || FREE STUFF || FREE BUSINESS PPT");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}


	@Then("^Free PPT template\\.$")
	public void Free_PPT_template() throws Throwable {
		
		WebElement footer_Free_PPT_template= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='first'][contains(.,'Free PPT template')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_PPT_template);
		footer_Free_PPT_template.click();
		log.info("FOOTER --> 3 || FREE STUFF || FREE PPT Template");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^Free Editable PPT\\.$")
	public void Free_Ediatble_PPT() throws Throwable {
		
		WebElement footer_free_Ediatble_PPT= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='first'][contains(.,'Free Editable PPT')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",footer_free_Ediatble_PPT);
		footer_free_Ediatble_PPT.click();
		log.info("FOOTER --> 4 || FREE STUFF || FREE EDITABLE PPT");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^Free Google Slide\\.$")
	public void Free_Google_Slide() throws Throwable {
		
		WebElement footer_Free_Google_Slide= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='first'][contains(.,'Free Google Slide')]")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_Google_Slide);
		footer_Free_Google_Slide.click();
		log.info("FOOTER --> 5 || FREE STUFF || FREE GOOGLE SLIDE ");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
		
	}

	
	@Then("^Free Timeline\\.$")
	public void Free_Timeline() throws Throwable {
	    
		WebElement footer_Free_Timeline= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='first'][contains(.,'Free Timeline')]")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_Timeline);
		footer_Free_Timeline.click();
		log.info("FOOTER --> 7 || FREE STUFF || FREE TIMELINE");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
		
	}

	@Then("^Free Investor Pitch\\.$")
	public void Free_Investor_Pitch() throws Throwable {
		
		WebElement footer_Free_Investor_Pitch= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='first'][contains(.,'Free Investor Pitch')]")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_Investor_Pitch);
		footer_Free_Investor_Pitch.click();
		log.info("FOOTER --> 8 || FREE STUFF || FREE INVESTOR PITCH");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}
			 
			 

	@Then("^Free Template\\.$")
	public void Free_Template() throws Throwable {
		
		WebElement footer_Free_Template= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='first'][contains(.,'Free Template')]")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_Template);
		footer_Free_Template.click();
		log.info("FOOTER --> 10 || FREE STUFF || FREE TEMPLATE");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

			 
	@Then("^Free Business Plan\\.$")
	public void Free_Business_Plan() throws Throwable {
		
		
		  WebElement footer_Free_Business_Plan= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='first'][contains(.,'Free Business Plan')]")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_Business_Plan);
		  footer_Free_Business_Plan.click();
		  log.info("FOOTER --> 12 || FREE STUFF || FREE BUSINESS PLAN"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
			 
	@Then("^View All\\.$")
	public void View_All() throws Throwable {
		
		
		  WebElement Footer_View_All_1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='last'][contains(.,'View All')]")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",Footer_View_All_1);
		  Footer_View_All_1.click();
		  log.info("FOOTER --> 13 || FREE STUFF || View All"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	}
	}
	
