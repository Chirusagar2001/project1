package ecommerce;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ECommerse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//2. Write a code to validate if the given URL Link is broken.

		driver.get("https://www.bestbuy.com/");

		WebElement selectNation = driver.findElement(By.xpath("//div[@lang='en']//img[@alt='United States']"));
		selectNation.click();
		try {
			System.out.println("Successfully opened Best Buy website.");
		} catch (Exception e) {
			System.out.println("Failed to open Best Buy website. Error: " + e.getMessage());
		}
		
		// 3. Write a code to do Sign-Up and Login functionality.
		/*
		Thread.sleep(1500);
		WebElement signin = driver.findElement(By.xpath("//button[@id='account-menu-account-button']"));
		signin.click();

		WebElement signinto = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
		signinto.click();

		WebElement emailid = driver.findElement(By.xpath(" //input[@id='fld-e']"));
		emailid.sendKeys("some2002@gmail.com");

		WebElement emailpass = driver.findElement(By.xpath("//input[@id='fld-p1']"));
		emailpass.sendKeys("Some@2002_Chiru");

		WebElement signbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		signbutton.click();
		*/
		//4. Write a code for navigation of all Menu and validation of title in each page.

		driver.findElement(By.linkText("Top Deals")).click();

     
		String pageTitle = driver.getTitle();
		if (pageTitle.contains("Top Deals")) {
			System.out.println("Page title is correct.");
		} else {
			System.out.println("Page title is incorrect.");
		}
		
		driver.findElement(By.linkText("Deal of the Day")).click();

	     
		String pageTitle1 = driver.getTitle();
		if (pageTitle1.contains("Deal of the Day")) {
			System.out.println("Page title Deal of the Day is correct.");
		} else {
			System.out.println("Page title Deal of the Day is incorrect.");
		}
		
		driver.findElement(By.linkText("My Best Buy Memberships")).click();

	     
		String pageTitle2 = driver.getTitle();
		if (pageTitle2.contains("My Best Buy Memberships")) {
			System.out.println("Page title My Best Buy Memberships is correct.");
		} else {
			System.out.println("Page title My Best Buy Memberships is incorrect.");
		}
		
		driver.findElement(By.linkText("Credit Cards")).click();

	     
		String pageTitle3 = driver.getTitle();
		if (pageTitle3.contains("Credit Cards")) {
			System.out.println("Page title Credit Cards is correct.");
		} else {
			System.out.println("Page title Credit Cards is incorrect.");
		}
		
		driver.findElement(By.linkText("Best Buy Outlet")).click();

	     
		String pageTitle4 = driver.getTitle();
		if (pageTitle4.contains("Best Buy Outlet")) {
			System.out.println("Page title Best Buy Outlet is correct.");
		} else {
			System.out.println("Page title Best Buy Outlet is incorrect.");
		}
		
		driver.findElement(By.linkText("Gift Cards")).click();

	     
		String pageTitle5 = driver.getTitle();
		if (pageTitle5.contains("Gift Cards")) {
			System.out.println("Page title Gift Cards is correct.");
		} else {
			System.out.println("Page title Gift Cards is incorrect.");
		}
		
		driver.findElement(By.linkText("Yes, Best Buy Sells That")).click();

	     
		String pageTitle6 = driver.getTitle();
		if (pageTitle6.contains("Yes, Best Buy Sells That")) {
			System.out.println("Page title Yes, Best Buy Sells That is correct.");
		} else {
			System.out.println("Page title Yes, Best Buy Sells That is incorrect.");
		}
		
		driver.findElement(By.linkText("Gift Ideas")).click();

	     
		String pageTitle7 = driver.getTitle();
		if (pageTitle7.contains("Gift Ideas")) {
			System.out.println("Page title Gift Ideas is correct.");
		} else {
			System.out.println("Page title Gift Ideas is incorrect.");
		}
		
		driver.findElement(By.linkText("Best Buy Business")).click();

	     
		String pageTitle8 = driver.getTitle();
		if (pageTitle8.contains("Best Buy Business")) {
			System.out.println("Page title Best Buy Business is correct.");
		} else {
			System.out.println("Page title Best Buy Business is incorrect.");
		}
		
		
		//5. Write a code to validate the bottom links on the homepage.
		
		driver.findElement(By.xpath("//a[normalize-space()='Accessibility']")).click();

	     
		String pageTitle11 = driver.getTitle();
		if (pageTitle11.contains("Accessibility")) {
			System.out.println("Page title Accessibility is correct.");
		} else {
			System.out.println("Page title Accessibility is incorrect.");
		}
		
		
		//6. Write code to search for and add an item to the shopping cart.
		
		WebElement search = driver.findElement(By.xpath("//input[@id='gh-search-input']"));
		search.sendKeys("smart watch for samsung");

		// Find and click the search button
		WebElement searchButton = driver.findElement(By.xpath("//span[@class='header-search-icon']//*[name()='svg']"));
		searchButton.click();

		Thread.sleep(1500);
		// Find and click the "Add to Cart" button
		WebElement addToCartButton = driver.findElement(By.xpath("//button[normalize-space()='Add to Cart']"));
		addToCartButton.click();

		Thread.sleep(2500);
		WebElement shopByDepartmentMenu = driver.findElement(By.xpath("//button[@aria-label='Menu']//*[name()='svg']"));
		shopByDepartmentMenu.click();

		
		//7. Write a code to select and add an item from (Menu à Shop by Department).
		
        Thread.sleep(2500);
		// Select a department, e.g., "Electronics" (you can change this)
		WebElement computers = driver.findElement(By.xpath("//button[normalize-space()='Computers & Tablets']"));
		computers.click();

		// Select a category or subcategory, e.g., "Laptops" (you can change this)
		WebElement laptops = driver.findElement(By.xpath("//button[normalize-space()='Laptops & Desktops']"));
		laptops.click();

		// Find and click the item you want to add to the cart
		WebElement exactlaptop = driver.findElement(By.xpath("//a[normalize-space()='Laptops']"));
		exactlaptop.click();

		Thread.sleep(3500);
		WebElement alllaptop = driver.findElement(By.xpath("//a[normalize-space()='All Laptops']"));
		alllaptop.click();

		Thread.sleep(3500);

		WebElement addToCartInDepartment = driver
				.findElement(By.xpath("(//button[@data-button-state='ADD_TO_CART'])[1]"));
		addToCartInDepartment.click();

		// 8. Write a code to select and add an item from (Menu à Brands à Select Any Brand). 

		Thread.sleep(2500);
		WebElement shopByDepartmentMenu1 = driver
				.findElement(By.xpath("//button[@aria-label='Menu']//*[name()='svg']"));
		shopByDepartmentMenu1.click();

		WebElement brand = driver.findElement(By.xpath("//button[normalize-space()='Brands']"));
		brand.click();

		WebElement samsung = driver.findElement(By.xpath("//a[@data-lid='ubr_shp_see']"));
		samsung.click();

		Thread.sleep(2500);

		WebElement shopnow1 = driver.findElement(By.xpath(
				"//div[@class='mt-500 v-text-tech-black']//a[@class='btn btn-secondary'][normalize-space()='Shop now']"));
		shopnow1.click();

		Thread.sleep(3500);
		WebElement addtocartbrand = driver.findElement(By.xpath("(//button[@data-button-state='ADD_TO_CART'])[1]"));
		addtocartbrand.click();

		// 9. Write code to navigate to the checkout page and fill out the form with dummy payment information.

		WebElement cartlabel = driver.findElement(By.xpath("//span[@class='cart-label']"));
		cartlabel.click();

		WebElement checkout = driver.findElement(By.xpath("//button[normalize-space()='Checkout']"));
		checkout.click();

		WebElement continueasguest = driver.findElement(By
				.xpath("//button[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']"));
		continueasguest.click();

		WebElement emailid1 = driver.findElement(By.xpath("//input[@id='user.emailAddress']"));
		emailid1.sendKeys("some2001@gmail.com");

		WebElement phonenumber = driver.findElement(By.xpath("//input[@id='user.phone']"));
		phonenumber.sendKeys("7353888398");

		WebElement textupdate = driver.findElement(By.xpath("//input[@id='text-updates']"));
		textupdate.click();

		WebElement payment = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-block btn-secondary']"));
		payment.click();

		WebElement creditcardnumber = driver.findElement(By.xpath("//input[@id='number']"));
		creditcardnumber.sendKeys("7363562467249834");

		// Wait for the order confirmation page to load and verify the confirmation
		
		WebElement confirmationMessage = driver.findElement(By.cssSelector("div.order-confirmation"));
		String message = confirmationMessage.getText();

		if (message.contains("Order placed successfully")) {
			System.out.println("Order placed successfully!");
		} else {
			System.out.println("Order placement failed.");
		}

	}

}
