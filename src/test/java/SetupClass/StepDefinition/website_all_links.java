package SetupClass.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class website_all_links extends Setup {

	WebDriverWait wait = new WebDriverWait(driver, 50);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void clear_cache() throws InterruptedException {
		/*
		 * driver.manage().deleteAllCookies(); Thread.sleep(4200);
		 * log.info("DELETE COOKIES");
		 */
		driver.get(AppURL);
	}

	public void err_page() throws InterruptedException {

		pagetitle = driver.getTitle().toUpperCase();
		System.out.println("Title of the Page is:-" + "" + pagetitle);
		Thread.sleep(3500);

		try {
			driver.getPageSource().contains("404 Not Found");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void chat_pop_up() throws InterruptedException {
		try {
			WebElement iframe = driver.findElement(By.id("livechat-full-view"));
			if (iframe.isDisplayed()) {
				driver.switchTo().frame(iframe);
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.cssSelector("#title .icon-minimize"))).build().perform();
				Thread.sleep(2000);
				WebElement chat1 = driver.findElement(By.cssSelector("#title .icon-minimize"));
				Thread.sleep(1000);
				chat1.click();
				Thread.sleep(1000);
				driver.switchTo().defaultContent();
				Thread.sleep(1000);
				driver.switchTo().parentFrame();
				Thread.sleep(1000);
			} else {
				System.out.println("chat window does not open");
			}
		} catch (NoSuchElementException NCP) {

		}
	}

	@Given("^Open the Website URL\\.$")
	public void open_the_Website_URL() throws InterruptedException {

		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
		driver.get("https://www.slidegeeks.com");
		
		Thread.sleep(2000);
		try {
			driver.findElement(By.cssSelector(".authorization-link > a:nth-child(1)")).click();
			Thread.sleep(2000);
			log.info("It's opening the website URL");
		} catch (NoSuchElementException popup) {
		}
	}

	@Then("^user enter email and password epu$")
	public void user_enter_email_and_password_epu() throws InterruptedException {

		WebElement old_paid_email = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/form/fieldset/div[2]/div/input")));
		old_paid_email.sendKeys("sakshi.pathania@slidetech.in");

		WebElement old_paid_pass = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/form/fieldset/div[3]/div/input")));
		old_paid_pass.sendKeys("Qwerty@1");

		Thread.sleep(3000);
		WebElement old_paid_login_btn = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.login > span:nth-child(1)")));
		old_paid_login_btn.click();
	}

	@Then("^Pricing Page\\.$")
	public void Pricing_Page() throws Throwable {
		Thread.sleep(4000);
		WebElement price = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("PRICING")));
		// clear_cache();
		Thread.sleep(3000);
		price.click();
		log.info("PRICING");
		Thread.sleep(3000);
		// chat_pop_up();
		err_page();

	}

	@Then("^New Additions\\.$")
	public void New_Additions() throws Throwable {

		WebElement price = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'New Additions')]")));
		// clear_cache();
		Thread.sleep(3000);
		price.click();
		log.info("NEW ADDITIONS");
		Thread.sleep(3000);
		// chat_pop_up();
		err_page();

	}

	@Then("^Most Popular\\.$")
	public void Most_Popular() throws Throwable {

		WebElement price = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Most Popular')]")));
		// clear_cache();
		Thread.sleep(3000);
		price.click();
		log.info("MOAT POPULAR");
		Thread.sleep(3000);
		// chat_pop_up();
		err_page();

	}

	@Then("^Free PPTs Page\\.$")
	public void Free_PPTs_Page() throws Throwable {

		WebElement free_ppt = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Free Slides')]")));
		// clear_cache();
		Thread.sleep(3000);
		free_ppt.click();
		log.info("FREE SLIDES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
		// Thread.sleep(5000);
		// Actions actions = new Actions(driver);
		// WebElement
		// free_ppt_btn1=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Free
		// Stuff")));
		// actions.moveToElement(free_ppt_btn1).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Free
		// PPTs')]"))).click().build().perform();
		// Thread.sleep(7000);

		// WebElement
		// free_ppt_btn2=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Free
		// Stuff")));
		// actions.moveToElement(free_ppt_btn2).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Free
		// Business PPTs')]"))).click().build().perform();
		// Thread.sleep(7000);

	}

	@Then("^Visual Search\\.$")
	public void Visual_Search() throws Throwable {
		WebElement visual_search = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Visual Search')]")));
		// clear_cache();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", visual_search);
		visual_search.click();
		log.info("VISUAL SEARCH");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Discussion\\.$")
	public void Discussion() throws Throwable {
		WebElement Discussion = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//a[@class='discussions-top-menu-itemnav-link'][contains(.,'Discussion')]")));
		// clear_cache();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", Discussion);
		Discussion.click();
		log.info("DISCUSSION");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Blog Page\\.$")
	public void Blog_Page() throws Throwable {
		WebElement blog_page = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='blog-top-menu nav-link']")));
		// clear_cache();
		Thread.sleep(3000);
		blog_page.click();
		log.info("BLOG");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Ebooks\\.$")
	public void Ebooks() throws Throwable {
		WebElement eBooks = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Ebooks']")));
		// clear_cache();
		Thread.sleep(3000);
		eBooks.click();
		log.info("EBOOKS");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();

	}

	@Then("^Free PPT Templates\\.$")
	public void Free_PPT_Templates() throws Throwable {
		WebElement Free_PPT_Templates = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Free PPT Templates')]")));
		// clear_cache();
		Thread.sleep(3000);
		Free_PPT_Templates.click();
		log.info("FREE PPT TEMPLATES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Agenda Slide\\.$")
	public void Agenda_Slide() throws Throwable {
		WebElement Agenda_Slide = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Agenda Slide')]")));
		// clear_cache();
		Thread.sleep(3000);
		Agenda_Slide.click();
		log.info("AGENDA SLIDE");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Roadmap Slide\\.$")
	public void Roadmap_Slide() throws Throwable {
		WebElement Roadmap_Slide = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Roadmap Slide')]")));
		// clear_cache();
		Thread.sleep(3000);
		Roadmap_Slide.click();
		log.info("ROADMAP SLIDE");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Birthday PPT\\.$")
	public void Birthday_PPT() throws Throwable {
		WebElement Birthday_PPT = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Birthday PPT')]")));
		// clear_cache();
		Thread.sleep(3000);
		Birthday_PPT.click();
		log.info("BIRTHDAY PPT");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Powerpoint Table Template\\.$")
	public void Powerpoint_Table_Template() throws Throwable {
		WebElement Powerpoint_Table_Template = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Powerpoint Table Template')]")));
		// clear_cache();
		Thread.sleep(3000);
		Powerpoint_Table_Template.click();
		log.info("POWERPOINT TABLE TEMPLATE");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Introduction Slide\\.$")
	public void Introduction_Slide() throws Throwable {
		WebElement Introduction_Slide = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Introduction Slide')]")));
		// clear_cache();
		Thread.sleep(3000);
		Introduction_Slide.click();
		log.info("INTRODUCTION SLIDE");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Conclusion Slide\\.$")
	public void Conclusion_Slide() throws Throwable {
		WebElement Conclusion_Slide = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Conclusion Slide')]")));
		// clear_cache();
		Thread.sleep(3000);
		Conclusion_Slide.click();
		log.info("CONCLUSION SLIDE");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Powerpoint List Template\\.$")
	public void Powerpoint_List_Template() throws Throwable {
		WebElement Powerpoint_List_Template = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Powerpoint List Template')]")));
		// clear_cache();
		Thread.sleep(3000);
		Powerpoint_List_Template.click();
		log.info("POWERPOINT LIST TEMPLATE");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Self Introduction PPT\\.$")
	public void Self_Introduction_PPT() throws Throwable {
		WebElement Self_Introduction_PPTs = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Self Introduction PPT')]")));
		// clear_cache();
		Thread.sleep(3000);
		Self_Introduction_PPTs.click();
		log.info("SELF INTRODUCTION PPT");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Cash Position Report\\.$")
	public void Cash_Position_Report() throws Throwable {
		WebElement Cash_Position_Report = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Cash Position Report')]")));
		// clear_cache();
		Thread.sleep(3000);
		Cash_Position_Report.click();
		log.info("CASH POSITION REPORT");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Powerpoint Award Templates\\.$")
	public void Powerpoint_Award_Templates() throws Throwable {
		WebElement Powerpoint_Award_Template = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Powerpoint Award Template')]")));
		// clear_cache();
		Thread.sleep(3000);
		Powerpoint_Award_Template.click();
		log.info("POWERPOINT AWARD TEMPLATE");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Powerpoint Award Template\\.$")
	public void Powerpoint_Award_Template() throws Throwable {
		WebElement Powerpoint_Award_Template = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Powerpoint Award Template')]")));
		// clear_cache();
		Thread.sleep(3000);
		Powerpoint_Award_Template.click();
		log.info("POWERPOINT AWARD TEMPLATE");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Newspaper Template Powerpoint\\.$")
	public void Newspaper_Template_Powerpoint() throws Throwable {
		WebElement Newspaper_Template_Powerpoint = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Newspaper Template Powerpoint')]")));
		// clear_cache();
		Thread.sleep(3000);
		Newspaper_Template_Powerpoint.click();
		log.info("NEWSPAPER TEMPLATE POWERPOINT");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Achievement Presentation\\.$")
	public void Achievement_Presentation() throws Throwable {
		WebElement Achievement_Presentation = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Achievement Presentation')]")));
		// clear_cache();
		Thread.sleep(3000);
		Achievement_Presentation.click();
		log.info("ACHIEVEMENT PRESENTATION");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Milestone PPT\\.$")
	public void Milestone_PPT() throws Throwable {
		WebElement Milestone_PPT = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Milestone PPT')]")));
		// clear_cache();
		Thread.sleep(3000);
		Milestone_PPT.click();
		log.info("MILESTONE PPT");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Music Powerpoint Templates\\.$")
	public void Music_Powerpoint_Templates() throws Throwable {
		WebElement Music_Powerpoint_Templates = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Music Powerpoint Templates')]")));
		// clear_cache();
		Thread.sleep(3000);
		Music_Powerpoint_Templates.click();
		log.info("MUSIC POWERPOINT TEMPLATES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Checklist PPT\\.$")
	public void Checklist_PPT() throws Throwable {
		WebElement Checklist_PPT = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Checklist PPT')]")));
		// clear_cache();
		Thread.sleep(3000);
		Checklist_PPT.click();
		log.info("CHECKLIST PPT");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^About Us Page\\.$")
	public void about_Us_Page() throws Throwable {
		try {
			WebElement about_us_footer = wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'About Us')]")));
			// clear_cache();
			Thread.sleep(3000);
			js.executeScript("arguments[0].scrollIntoView();", about_us_footer);
			about_us_footer.click();
			log.info("FOOTER --> ABOUT US");
			Thread.sleep(3000);
			chat_pop_up();
			err_page();
		} catch (Exception e) {
		}
	}

	@Then("^Contact Us Page\\.$")
	public void Contact_Us_Page() throws Throwable {

		try {
			WebElement iframe = driver.findElement(By.id("livechat-full-view"));
			if (iframe.isDisplayed()) {
				driver.switchTo().frame(iframe);
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.cssSelector("#title .icon-minimize"))).build().perform();
				Thread.sleep(2000);
				WebElement chat1 = driver.findElement(By.cssSelector("#title .icon-minimize"));
				Thread.sleep(1000);
				chat1.click();
				Thread.sleep(1000);
				driver.switchTo().defaultContent();
				Thread.sleep(1000);
				driver.switchTo().parentFrame();
				Thread.sleep(1000);
			} else {
				System.out.println("chat window does not open");
			}
		} catch (NoSuchElementException NCP) {

		}
		WebElement contact_us_footer = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Contact Us')]")));
		// clear_cache();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", contact_us_footer);
		contact_us_footer.click();
		log.info("FOOTER --> CONTACT US");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Privacy Policy\\.$")
	public void Privacy_Policy() throws Throwable {
		WebElement Privacy_Policy = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Privacy Policy')]")));
		// clear_cache();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", Privacy_Policy);
		Privacy_Policy.click();
		log.info("FOOTER --> PRIVACY POLICY");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Terms and Contidion\\.$")
	public void Terms_and_Contidion() throws Throwable {
		WebElement Terms_and_Contidion= driver.findElement(By.xpath("/html/body/div[1]/footer/div/div[2]/div[5]/div/nav/ul/li[4]/a"));
		//clear_cache();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",Terms_and_Contidion);
		Terms_and_Contidion.click();
		log.info("FOOTER -->TERMS AND CONDITION");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^FAQ Page\\.$")
	public void faq_Page() throws Throwable {
		WebElement faq_footer = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'FAQ')]")));
		// clear_cache();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", faq_footer);
		faq_footer.click();
		log.info("FOOTER --> FAQ");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Coupon Code\\.$")
	public void Coupon_Code() throws Throwable {
		WebElement CC_footer = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Coupon Code')]")));
		Thread.sleep(3000);
		// clear_cache();
		js.executeScript("arguments[0].scrollIntoView();", CC_footer);
		CC_footer.click();
		log.info("FOOTER --> COUPON CODE");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Custom Design Services Page\\.$")
	public void Custom_Design_Services_Page() throws Throwable {
		WebElement cds_footer = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Design Services')]")));
		Thread.sleep(3000);
		// clear_cache();
		js.executeScript("arguments[0].scrollIntoView();", cds_footer);
		cds_footer.click();
		log.info("FOOTER --> CUSTOM DESIGN SERVICES");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

	@Then("^Research Services Page\\.$")
	public void Research_Services_Page() throws Throwable {
		WebElement Research_footer = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@class='nav-link'][contains(.,'Research Services')]")));
		Thread.sleep(3000);
		clear_cache();
		js.executeScript("arguments[0].scrollIntoView();", Research_footer);
		Research_footer.click();
		log.info("FOOTER --> RESEARCH SERVICES");
		Thread.sleep(2000);
		driver.get("https://www.slidegeeks.com/");
		Thread.sleep(3000);
		chat_pop_up();
		err_page();
	}

}
