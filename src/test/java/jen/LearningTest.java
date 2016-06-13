package jen;

import DriverUtilities.WebDriverConfigure;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class LearningTest extends WebDriverConfigure {

	@Test
	public void testEasy() {

		getDriver().get("http://www.google.com");
		String title = getDriver().getTitle();
		Assert.assertTrue(title.contains("Google"));
	}

	@AfterTest
	public void afterTest() {
		getDriver().quit();
	}
}
