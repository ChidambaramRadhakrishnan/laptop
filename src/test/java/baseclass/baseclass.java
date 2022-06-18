package baseclass;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import commonMethods.commonMethods;

public class baseclass extends commonMethods{

	@BeforeClass
	public void launch() throws IOException {
		file();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		browser(browser);
		url(url);
	}
	
	@AfterClass
	public void close() {
		quit();
	}
}
