package launch_browser_window;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Browser_Window_Using_UserInput {

	static WebDriver driver;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter browser name: ");
		String browser_name = scanner.next();

		if (browser_name.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browser_name.equals("firefox")) {
			driver = new EdgeDriver();

		} else if (browser_name.equals("edge")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}

	}

}
