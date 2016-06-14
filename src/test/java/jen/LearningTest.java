package jen;

import DriverUtilities.WebDriverConfigure;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LearningTest extends WebDriverConfigure {

	@Test
	public void testEasy() throws InterruptedException {

		driver.get("http://www.google.com");
		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("Google"));
		
	}


}
