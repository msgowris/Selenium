package browser_navigations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_Navigations {
	public static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();

		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());

		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());

		driver.navigate().refresh();
		driver.navigate().forward();

		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());

		driver.quit();

	}

}
