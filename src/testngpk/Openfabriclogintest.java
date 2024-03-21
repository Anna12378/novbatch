package testngpk;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Openfabriclogintest {
	    public static void main(String[] args) {
	        
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
 
	        WebDriver driver = new ChromeDriver();
	        String baseurl="https://openfabric.ai/login";

	       
	        driver.get(baseurl);

	       
	        WebElement usernameInput = driver.findElement(By.id("username"));
	        WebElement passwordInput = driver.findElement(By.id("password"));
	        WebElement loginButton = driver.findElement(By.id("login-button"));

	        
	        usernameInput.sendKeys("your_username");
	        passwordInput.sendKeys("your_password");

	       
	        loginButton.click();

	      
	        try {
	            Thread.sleep(3000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	       
	        WebElement dashboardElement = driver.findElement(By.className("dashboard"));
	        if (dashboardElement.isDisplayed()) {
	            System.out.println("Login successful! Dashboard page is displayed.");
	        } else {
	            System.out.println("Login failed! Dashboard page is not displayed.");
	        }

	     
	        driver.quit();
	    }
	}


