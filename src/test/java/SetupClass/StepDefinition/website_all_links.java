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

public class website_all_links extends Setup {
	
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
	
	@Then("^Pricing Page\\.$")
	public void Pricing_Page() throws Throwable {
	    
		WebElement price = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'Pricing')]")));
		clear_cache();
		Thread.sleep(3000);
		price.click();
		log.info("PRICING");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
		
	}
        
	@Then("^Free PPTs Page\\.$")
	public void free_PPTs_Page() throws Throwable {
	    
		WebElement free_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'Free PPTs')]")));
		clear_cache();
		Thread.sleep(3000);
		free_ppt.click();
		log.info("FREE PPT");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
		 
	}
	
	@Then("^Popular PPT Page\\.$")
	public void Popular_PPT_Page() throws Throwable {
		WebElement Popular_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'Popular PPTs')]")));
		clear_cache();
		Thread.sleep(3000);
		Popular_ppt.click();
		log.info("Popular PPTs");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}
	
	@Then("^Template Finder Page\\.$")
	public void template_Finder_Page() throws Throwable {
		WebElement template_finder= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'Template Finder')]")));
		clear_cache();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",template_finder);
		template_finder.click();
		log.info("TEMPLATE FINDER");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}


	@Then("^Check Ebooks Page\\.$")
	public void check_Ebooks_Page() throws Throwable {
		WebElement ebook = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'eBooks')]")));
		clear_cache();
		Thread.sleep(3000);
		ebook.click();
		log.info("EBOOKS");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}


	@Then("^Blog Page\\.$")
	public void blog_Page() throws Throwable {
		WebElement blog_page = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'Blog')]")));
		clear_cache();
		Thread.sleep(3000);
		blog_page.click();
		log.info("BLOG");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Free Business PPTs Page\\.$")
	public void free_Business_PPTs_Page() throws Throwable {
		WebElement free_business_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'Free Business PPTs')]")));
		clear_cache();
		Thread.sleep(3000);
		free_business_ppt.click();
		log.info("FREE BUSINESS PPT");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	

	@Then("^About Us Page\\.$")
	public void about_Us_Page() throws Throwable {
		try {
		WebElement about_us_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title=' About Us'][contains(.,'About Us')]")));
		clear_cache();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",about_us_footer);
		about_us_footer.click();
		log.info("FOOTER --> ABOUT US");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
		}
	    catch (Exception e) {
		}
	}


	@Then("^Site Map Page\\.$")
	public void site_Map_Page() throws Throwable {
		WebElement site_map_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Site Map'][contains(.,'Site Map')]")));
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",site_map_footer);
		Thread.sleep(3000);
		site_map_footer.click();
		log.info("FOOTER --> SITE MAP");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Contact Us Page\\.$")
	public void contact_Us_Page() throws Throwable {
		WebElement contact_us_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title=' Contact Us'][contains(.,'Contact Us')]")));
		clear_cache();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",contact_us_footer);
		contact_us_footer.click();
		log.info("FOOTER --> CONTACT US");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^FAQ Page\\.$")
	public void faq_Page() throws Throwable {
		WebElement faq_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='FAQ'][contains(.,'FAQ')]")));
		clear_cache();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",faq_footer);
		faq_footer.click();
		log.info("FOOTER --> FAQ");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Terms of Use Page\\.$")
	public void terms_of_Use_Page() throws Throwable {
		WebElement terms_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title=' Terms of Use'][contains(.,'Terms of Use')]")));
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",terms_footer);
		Thread.sleep(3000);
		terms_footer.click();
		log.info("FOOTER --> TERMS OF USE");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Privacy Policy Page\\.$")
	public void Privacy_Policy_Page() throws Throwable {
		WebElement p_policy_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Privacy Policy'][contains(.,'Privacy Policy')]")));
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",p_policy_footer);
		Thread.sleep(3000);
		p_policy_footer.click();
		log.info("FOOTER --> PRIVACY POLICY");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Popular Free Slides Page\\.$")
	public void Popular_Free_Slides_Page() throws Throwable {
		WebElement popular_free_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Popular Free Slides'][contains(.,'Popular Free Slides')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",popular_free_footer);
		popular_free_footer.click();
		log.info("FOOTER --> POPULAR FREE SLIDES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}
	
	@Then("^Custom Design Services Page\\.$")
	public void Custom_Design_Services_Page() throws Throwable {
		WebElement cds_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Research Services'][contains(.,'Custom Design Services')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",cds_footer);
		cds_footer.click();
		log.info("FOOTER --> CUSTOM DESIGN SERVICES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}


	@Then("^Research Services Page\\.$")
	public void Research_Services_Page() throws Throwable {
		WebElement rs_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Research Services'][contains(.,'Research Services')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",rs_footer);
		rs_footer.click();
		log.info("FOOTER --> RESEARCH SERVICES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}
	
	@Then("^Resume Services Page\\.$")
	public void Resume_Services_Page() throws Throwable {
		WebElement Resume_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Research Services'][contains(.,'Resume Services')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",Resume_footer);
		Resume_footer.click();
		log.info("FOOTER --> RESUME SERVICES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Google Slides Page\\.$")
	public void google_Slides_Page() throws Throwable {
		WebElement g_slide_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Google Slides'][contains(.,'Google Slides')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",g_slide_footer);
		g_slide_footer.click();
		log.info("FOOTER --> GOOGLE SLIDES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}
	
		@Then("^Coupon Code\\.$")
	public void Coupon_Code() throws Throwable {
		WebElement CC_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Google Slides'][contains(.,'Google Slides')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",CC_slide_footer);
		CC_slide_footer.click();
		log.info("FOOTER --> COUPON CODE);
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}
	
		@Then("^Newly Added\\.$")
	public void Newly_Added() throws Throwable {
		WebElement nd_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Google Slides'][contains(.,'Google Slides')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();",nd_footer);
		nd_footer.click();
		log.info("FOOTER --> NEWLY ADDED");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

  			 
			 
	@Given("^user is already on Website Footer\\.$")
	public void user_is_already_on_Website_Footer() throws Throwable {
		
	  
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
