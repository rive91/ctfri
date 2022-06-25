package ct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seltest {

	public static void main(String[] args) {
		String exePath = "./driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", exePath); //agregando la propiedad con la ruta del chrome driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}

}
