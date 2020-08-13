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
  
  
  @Given("^Open the Website URL\\.$")
	public void open_the_Website_URL() throws InterruptedException {
		
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

	@Then("^user enter email and password epu$")
       public void user_enter_email_and_password_epu() throws InterruptedException  {
    
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
		
		WebElement footer_1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/best-presentation-on-myself-powerpoint-presentation-slide.html'][contains(.,'Free Business PPT')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",footer_1);
		footer_1.click();
		log.info("FOOTER --> 1 || FREE STUFF || FREE BUSINESS PPT");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^Free PPTs\\.$")
	public void Free_PPTs() throws Throwable {
		
		WebElement footer_Free_PPT= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[2]/a")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_PPT);
		footer_Free_PPT.click();
		log.info("FOOTER --> 2 || FREE STUFF || FREE PPTS");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^Free PPT template\\.$")
	public void Free_PPT_template() throws Throwable {
		
		WebElement footer_Free_PPT_template= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[3]/a")));
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
		
		WebElement footer_free_Ediatble_PPT= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[4]/a")));
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
		
		WebElement footer_Free_Google_Slide= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[5]/a")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_Google_Slide);
		footer_Free_Google_Slide.click();
		log.info("FOOTER --> 5 || FREE STUFF || FREE GOOGLE SLIDE ");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
		
	}

	@Then("^Free Start Up Pitch\\.$")
	public void Free_Start_UP_Pitch() throws Throwable {
	    
		WebElement footer_Free_Start_UP_Pitch= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[6]/a")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_Start_UP_Pitch);
		footer_Free_Start_UP_Pitch.click();
		log.info("FOOTER --> 6 || FREE STUFF || FREE START UP PITCH ");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
		
	}

	@Then("^Free Timeline\\.$")
	public void Free_Timeline() throws Throwable {
	    
		WebElement footer_Free_Timeline= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[7]/a")));
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
		
		WebElement footer_Free_Investor_Pitch= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[8]/a")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_Investor_Pitch);
		footer_Free_Investor_Pitch.click();
		log.info("FOOTER --> 8 || FREE STUFF || FREE INVESTOR PITCH");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}
			 
	@Then("^Free Sales and Mktg\\.$")
	public void Free_Sales_and_Mktg() throws Throwable {
		
		WebElement footer_Free_Sales_and_Mktg= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[9]/a")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_Sales_and_Mktg);
		footer_Free_Sales_and_Mktg.click();
		log.info("FOOTER --> 9 || FREE STUFF || FREE SALES AND MKTG");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}
			 

	@Then("^Free Template\\.$")
	public void Free_Template() throws Throwable {
		
		WebElement footer_Free_Template= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[10]/a")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_Template);
		footer_Free_Template.click();
		log.info("FOOTER --> 10 || FREE STUFF || FREE TEMPLATE");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^Free Slides\\.$")
	public void Free_Slides() throws Throwable {
		
		
		  WebElement footer_Free_Slides= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[11]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",footer_Free_Slides);
		  footer_Free_Slides.click();
		  log.info("FOOTER --> 11 || FREE STUFF || FREE SLIDES"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	   
	}
			 
	@Then("^Free Business Plan\\.$")
	public void Free_Business_Plan() throws Throwable {
		
		
		  WebElement footer_Free_Business_Plan= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[12]/a")));
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
		
		
		  WebElement Footer_View_All_1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/footer/div/div/div[2]/div/div[1]/ul/li[13]/a")));
		  Thread.sleep(3000); 
		js.executeScript("arguments[0].scrollIntoView();",Footer_View_All_1);
		  Footer_View_All_1.click();
		  log.info("FOOTER --> 13 || FREE STUFF || View All"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
	}
	}
	
