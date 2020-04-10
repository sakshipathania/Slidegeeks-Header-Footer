package SetupClass.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;

public class website_all_links extends Setup {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	
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
		clear_cache();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(5300);
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

	@Then("^Pricing Page\\.$")
	public void pricing_Page() throws Throwable {
	    
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

	@Then("^Most Downloaded Page\\.$")
	public void most_Downloaded_Page() throws Throwable {
		WebElement most_download_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'Most Downloaded')]")));
		clear_cache();
		Thread.sleep(3000);
		most_download_ppt.click();
		log.info("MOST DOWNLOADED");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Newly Added Page\\.$")
	public void newly_Added_Page() throws Throwable {
		WebElement new_add_ppt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'Newly Added')]")));
		clear_cache();
		Thread.sleep(3000);
		new_add_ppt.click();
		log.info("NEWLY ADDED");
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

	@Then("^Template Finder Page\\.$")
	public void template_Finder_Page() throws Throwable {
		WebElement template_finder= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='menu-link'][contains(.,'Template Finder')]")));
		clear_cache();
		Thread.sleep(3000);
		template_finder.click();
		log.info("TEMPLATE FINDER");
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
		about_us_footer.click();
		log.info("FOOTER --> ABOUT US");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	} catch (NoSuchElementException popup) {
		}
	}

	@Then("^How it Works page\\.$")
	public void how_it_Works_page() throws Throwable {
		WebElement how_works_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='How It Works'][contains(.,'How It Works')]")));
		clear_cache();
		Thread.sleep(3000);
		how_works_footer.click();
		log.info("FOOTER --> HOW IT WORKS");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Site Map Page\\.$")
	public void site_Map_Page() throws Throwable {
		WebElement site_map_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Site Map'][contains(.,'Site Map')]")));
		clear_cache();
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
		Thread.sleep(3000);
		terms_footer.click();
		log.info("FOOTER --> TERMS OF USE");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Privacy Policy Page\\.$")
	public void privacy_Policy_Page() throws Throwable {
		WebElement p_policy_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Privacy Policy'][contains(.,'Privacy Policy')]")));
		clear_cache();
		Thread.sleep(3000);
		p_policy_footer.click();
		log.info("FOOTER --> PRIVACY POLICY");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Popular Free Slides Page\\.$")
	public void popular_Free_Slides_Page() throws Throwable {
		WebElement popular_free_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Popular Free Slides'][contains(.,'Popular Free Slides')]")));
		Thread.sleep(3000);
		clear_cache();
		popular_free_footer.click();
		log.info("FOOTER --> POPULAR FREE SLIDES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Research Services Page\\.$")
	public void research_Services_Page() throws Throwable {
		WebElement rs_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Research Services'][contains(.,'Research Services')]")));
		Thread.sleep(3000);
		clear_cache();
		rs_footer.click();
		log.info("FOOTER --> RESEARCH SERVICES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Google Slides Page\\.$")
	public void google_Slides_Page() throws Throwable {
		WebElement g_slide_footer= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Google Slides'][contains(.,'Google Slides')]")));
		Thread.sleep(3000);
		clear_cache();
		g_slide_footer.click();
		log.info("FOOTER --> GOOGLE SLIDES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Given("^user is already on Website Footer\\.$")
	public void user_is_already_on_Website_Footer() throws Throwable {
		
	  
	}

	@Then("^Advertising Test Diagram Page\\.$")
	public void advertising_Test_Diagram_Page() throws Throwable {
		
		WebElement footer_1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/powerpoint-presentation-slides/advertising-powerpoint-templates-and-presentation-slides.html'][contains(.,'Advertising')]")));
		Thread.sleep(3000);
		clear_cache();
		footer_1.click();
		log.info("FOOTER --> 1 || DIAGRAM || ADVERTISING");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^View All Test Diagram Page\\.$")
	public void view_All_Test_Diagram_Page() throws Throwable {
		
		WebElement footer_1_1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/powerpoint-presentation-slides.html'][contains(.,'View all')]")));
		Thread.sleep(3000);
		clear_cache();
		footer_1_1.click();
		log.info("FOOTER --> 1 || DIAGRAM || VIEW ALL");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^About Us Company Details Business Details Page\\.$")
	public void about_Us_Company_Details_Business_Details_Page() throws Throwable {
		
		WebElement footer_2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/powerpoint-presentation-essentials/about-us-company-detail-templates.html'][contains(.,'About Us Company Details')]")));
		Thread.sleep(3000);
		clear_cache();
		footer_2.click();
		log.info("FOOTER --> 2 || BUSINESS SLIDES || ABOUT US COMPANY DETAILS");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^View All Business Slides Page\\.$")
	public void view_All_Business_Slides_Page() throws Throwable {
		
		WebElement footer_2_1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/powerpoint-presentation-essentials.html'][contains(.,'View all')]")));
		Thread.sleep(3000);
		clear_cache();
		footer_2_1.click();
		log.info("FOOTER --> 2 || BUSINESS SLIDES || VIEW ALL");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^Arrows and Targets Flat Designs Page\\.$")
	public void arrows_and_Targets_Flat_Designs_Page() throws Throwable {
		
		WebElement footer_3= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/flat-design-diagrams/arrows-targets-flat-design.html'][contains(.,'Arrows and Targets')]")));
		Thread.sleep(3000);
		footer_3.click();
		log.info("FOOTER --> 3 || FLAT DESIGNS || ARROWS AND TARGETS ");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
		
	}

	@Then("^View All Flat Designs Page\\.$")
	public void view_All_Flat_Designs_Page() throws Throwable {
	    
		WebElement footer_3_1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/flat-design-diagrams.html'][contains(.,'View all')]")));
		Thread.sleep(3000);
		footer_3_1.click();
		log.info("FOOTER --> 3 || FLAT DESIGNS || VIEW ALL ");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
		
	}

	@Then("^Abstract Themes Page\\.$")
	public void abstract_Themes_Page() throws Throwable {
	    
		WebElement footer_4= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/powerpoint-templates/abstract.html'][contains(.,'Abstract')]")));
		Thread.sleep(3000);
		footer_4.click();
		log.info("FOOTER --> 4 || THEMES || ABSTRACT");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
		
	}

	@Then("^View All Themes Page\\.$")
	public void view_All_Themes_Page() throws Throwable {
		
		WebElement footer_4_1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/powerpoint-templates.html'][contains(.,'View all')]")));
		Thread.sleep(3000);
		footer_4_1.click();
		log.info("FOOTER --> 4 || THEMES || VIEW ALL");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^Abstract Icons Page\\.$")
	public void abstract_Icons_Page() throws Throwable {
		
		WebElement footer_5= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/powerpoint-images/abstract.html'][contains(.,'Abstract')]")));
		Thread.sleep(3000);
		footer_5.click();
		log.info("FOOTER --> 5 || ICONS || ABSTRACT");
		chat_pop_up();
		Thread.sleep(1500);
		err_page();
	    
	}

	@Then("^View All Icons Page\\.$")
	public void view_All_Icons_Page() throws Throwable {
		
		
		  WebElement footer_5_1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/powerpoint-images.html'][contains(.,'View all')]")));
		  Thread.sleep(3000); 
		  footer_5_1.click();
		  log.info("FOOTER --> 5 || ICONS || VIEW ALL"); 
		  chat_pop_up();
		  Thread.sleep(1500); 
		  err_page();
		 
		
		/*
		 * driver.get("https://www.slideteam.net/waejhcdl"); Thread.sleep(2000);
		 * err_page();
		 */
	   
	}



}
