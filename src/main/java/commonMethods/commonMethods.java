package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonMethods {
	
	public static Properties properties= null;
	public static WebDriver driver;
	public Properties file() throws IOException {
		File fl=new File("C:\\Users\\Chidambaram\\OneDrive\\Documents\\GitHub\\laptop\\src\\main\\java\\commonMethods\\config.properties");
		FileInputStream flips = new FileInputStream(fl);
		properties = new Properties();
		properties.load(flips);
		return properties;
	}

	
	public static void browser(String browser) {
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		default:
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		}
	}
	
	public static void url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void quit() {
		driver.quit();
	}
	
}
