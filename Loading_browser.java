import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loading_browser {
	public static WebDriver wd;
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver_win32\\chromedriver.exe");
	   wd = new ChromeDriver();
	  wd.get("https://www.facebook.com/");
	  
	  List<WebElement> ls = wd.findElements(By.xpath("//*[@id='month']/option"));
	  System.out.println("Size is :"+CountOfElementsIndrpDwn(ls));
	  
	  System.out.println("Size is :"+CountOfElementByXpathDrpDown("//*[@id='month']/option"));
	  
	  
  }

  
  public static int CountOfElementByXpathDrpDown(String locator) {
	  try {
		 
		  return  wd.findElements(By.xpath(locator)).size();
	  }catch(Exception e ) {
		  e.printStackTrace();
		  return 0;
	  }
	
  }
 
  public static int CountOfElementsIndrpDwn(List<WebElement> ls) {
	  try {
		  
		  return ls.size();
	  }catch(Exception e) {
		  return 0;
	  }

	  
  }

}


