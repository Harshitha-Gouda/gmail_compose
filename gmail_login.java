package SeleniumStudy;

import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_login {

	public static void main(String[] args) {
		ChromeDriver ch = null;
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Harshitha\\Java\\Selenium_Java\\web-drivers\\chrome\\chromedriver.exe");
			
			ch = new ChromeDriver();
			
			ch.manage().window().maximize();
			
			ch.get("https://accounts.google.com/signin");
			
			ch.findElementByXPath("//input[@class='whsOnd zHQkBf']").sendKeys("harshithag768@gmail.com");
			ch.findElementByXPath("//div[@class='VfPpkd-RLmnJb']").click();
			Thread.sleep(2000);
			
			ch.findElementByXPath("//input[@class='whsOnd zHQkBf']").sendKeys("Chowdeshwari7*");
			ch.findElementByXPath("//div[@class='VfPpkd-RLmnJb']").click();
			Thread.sleep(2000);
			
			ch.findElementByXPath("//div[@class='T-I T-I-KE L3']").click();
			
			ch.close();
			
		} catch (Exception e) {
			System.out.println(e);
		} 
		finally {
			ch = null;
		}

	}
}
