package jen;

import DriverUtilities.WebDriverConfigure;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LearningTest extends WebDriverConfigure {

	@Test
	public void testEasy() {

		driver.get("http://www.google.com");
		Assert.assertTrue(driver.getTitle().contains("Google"));
		
	}


}
