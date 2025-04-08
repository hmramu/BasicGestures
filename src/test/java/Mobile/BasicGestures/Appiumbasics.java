package Mobile.BasicGestures;

	import java.net.MalformedURLException;
	import java.net.URISyntaxException;

	import org.testng.annotations.Test;

	import io.appium.java_client.AppiumBy;

	public class Appiumbasics extends BaseTest{
		
		@Test
		public void WifiSettingsName() throws MalformedURLException, URISyntaxException {

			//AndroidDriver - create object for this driver class
			// Appium code --> Appium server --> Mobile
			//Actual automation
			//xpath, id, accessibilityId, classname, androidUIAutomator
			
			driver.findElement(AppiumBy.accessibilityId("Preference")).click();
			
			
		
		
		}
	}



