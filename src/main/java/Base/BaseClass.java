package Base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Utils.WebEventListener;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	@SuppressWarnings("deprecation")
	public static EventFiringWebDriver edriver;
	public static WebEventListener EventListener;
	
	public BaseClass() {
		
		try {
			prop = new Properties();
			FileInputStream input = new FileInputStream("C:\\Users\\polis\\eclipse-workspace\\FBPageObjectModel2023\\src\\main\\java\\config\\config.properties");
			prop.load(input);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void inceptions() {
		String mybrowser = prop.getProperty("mybrowser");
		if(mybrowser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium documents\\SeJava\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(mybrowser.equals("Edge")) {
			System.setProperty("webdriver.Edge.driver", "D:\\Selenium documents\\SeJava\\geckodriver-v0.33.0-win-aarch64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		edriver = new EventFiringWebDriver(driver);
		EventListener = new WebEventListener();
		edriver.register(EventListener);
		driver= edriver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get(prop.getProperty("url"));
	}

}
