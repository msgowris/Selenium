package browser_actions.launch_browser_window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Browser_Window_Using_WebDriver {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();

	}

}
