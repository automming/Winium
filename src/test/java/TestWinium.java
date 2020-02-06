import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class TestWinium {

	public static void main(String[] args) throws Exception {

		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\WINWORD.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		Thread.sleep(5000);
		
		List<WebElement> elements = driver.findElementsById("AIOStartDocument");
		System.out.println(elements.size());
		
		List<WebElement> element = driver.findElementsByClassName("NetUIStickyButton");
		element.get(1).click();
		
		List<WebElement> element1 = driver.findElementsByClassName("NetUIGalleryButton");
		element1.get(3).click();
		
		Thread.sleep(5000);
	}

}
