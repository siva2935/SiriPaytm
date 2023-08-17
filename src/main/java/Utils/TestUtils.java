package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.BaseClass;

public class TestUtils extends BaseClass {

	public static void takeaScreenshot() throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentdir = System.getProperty("user.dir");
		FileUtils.copyFile(src, new File(currentdir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

}
