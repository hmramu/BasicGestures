package Mobile.BasicGestures;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscellaneousAppiumActions extends BaseTest{
	
	@Test
	public void Miscellaneous() throws MalformedURLException {
			
		DeviceRotation portrait = new DeviceRotation(0, 0, 0);
		driver.rotate(portrait);
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();

		driver.findElement(By.id("android:id/checkbox")).click();

		DeviceRotation landScape = new DeviceRotation(0, 0, 90);
		driver.rotate(landScape);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();	
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		//copy paste
		//copy to clipboard - paste it clipboard
		
		driver.setClipboardText("Rahul Wifi");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		//DeviceRotation portrait = new DeviceRotation(0, 0, 0);
		driver.rotate(portrait);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
	}
}
