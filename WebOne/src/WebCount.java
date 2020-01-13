import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCount {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver ObjDriver = new ChromeDriver();
		ObjDriver.get("http://demo.opencart.com");
		WebElement obj1=ObjDriver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[2]/div/a"));
		((JavascriptExecutor)ObjDriver).executeScript("arguments[0].click();",obj1);
		List<WebElement> links = ObjDriver.findElements(By.tagName("img"));
		System.out.println("number of images" + links.size());
		for (WebElement ele : links) {
			System.out.println(ele.getAttribute("src"));

		}
		ObjDriver.close();
	}
}
