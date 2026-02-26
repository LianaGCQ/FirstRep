package JenTestCases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class AddnTestCase {

    @Test
    public void additionTest() {
        int result = 2 + 2;
        Assert.assertEquals(4, result);
    }

    @Test
    public void verifyTitle() {
        // Example of a simple UI test case concept, typically using Selenium WebDriver
        // WebDriver driver = new RemoteWebDriver(...);
        // driver.get("https://www.example.com");
        // Assert.assertEquals(driver.getTitle(), "Example Domain");
        // driver.quit();
    }
}
