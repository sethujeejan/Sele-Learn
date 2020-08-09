package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBSignup {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Auomation\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		Thread.sleep(5000);
		d.get("https://www.facebook.com");
		Thread.sleep(5000);
		d.manage().window().maximize();
		Thread.sleep(5000);
		WebElement fname=d.findElement(By.name("firstname"));
		fname.sendKeys("Sethulakshmy");
		Thread.sleep(5000);
		WebElement lname=d.findElement(By.name("lastname"));
		lname.sendKeys("C S");
		Thread.sleep(5000);
		WebElement emailid=d.findElement(By.cssSelector("input[name='reg_email__']"));
		emailid.sendKeys("sethujee2016@gmail.com");
		Thread.sleep(5000);
		d.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).isEnabled();
		WebElement reenteremail=d.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
		reenteremail.sendKeys("sethujee2016@gmail.com");
		Thread.sleep(5000);
		WebElement newpwd=d.findElement(By.cssSelector("input#password_step_input"));
		newpwd.sendKeys("Sethu-123");
		Thread.sleep(5000);
		WebElement gender=d.findElement(By.cssSelector("input[value='1']"));
		gender.click();
		Thread.sleep(5000);
		WebElement signup=d.findElement(By.cssSelector("button[name='websubmit']"));
		signup.click();
		Thread.sleep(5000);
		d.close();
	}
}
