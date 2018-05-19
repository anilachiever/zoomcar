package zoomcar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnBangalore {

	public static void main(String[] args) throws Throwable {
		

		System.setProperty("webdriver.chrome.driver","./jar/chromedriver");

		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://zoomcar.com");

		Thread.sleep(4000);

		Actions act=new Actions(driver);

		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='home']/div[1]/div/div/div/div/div[4]/div"));


		for (WebElement x : elements) {

			if (x.getText().equalsIgnoreCase("Bangalore"))
			{
				act.moveToElement(x).click();
				act.build().perform();
				Thread.sleep(3000);

				System.out.println("loop");
				break;

			}

			System.out.println("********done***************");



		}
	
}
}
