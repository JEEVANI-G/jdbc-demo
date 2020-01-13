import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneWeb 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver ObjDriver=new ChromeDriver();
	ObjDriver.get("https://demo.opencart.com/");
	System.out.println("open cart is loaded");
	String var1=ObjDriver.getTitle();
	System.out.println("title of the page"+var1);
	WebElement Obj1=ObjDriver.findElement(By.xpath("//html/body/footer/div/div/div[4]/ul/li[1]/a"));
	Obj1.click();
	String var2=ObjDriver.getTitle();
	System.out.println("title o fthe page"+var2);
}
}
