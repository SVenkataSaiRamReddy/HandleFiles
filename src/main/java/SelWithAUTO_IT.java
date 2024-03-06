import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelWithAUTO_IT {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "A:\\SELENIUM\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);		
		webDriver.get("https://www.ilovepdf.com/pdf_to_word");
		webDriver.findElement(By.id("pickfiles")).click();
		Runtime.getRuntime().exec("E:\\FileUploadScript.exe");
		webDriver.findElement(By.xpath("//*[@id=\"processTask\"]")).click();
	
	}
}
//AUTO IT CODE
ControlFocus("Open","","Edit1")
ControlSetText("Open","","Edit1","E:\mcafee.pdf")
ControlClick("Open","","Button1")

