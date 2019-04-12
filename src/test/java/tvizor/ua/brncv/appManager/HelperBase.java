package tvizor.ua.brncv.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;


public class HelperBase {
    public WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(String locator) {
        driver.findElement(By.name(locator)).click();
    }

    protected void type(String locator, String name) {
        click(locator);
        driver.findElement(By.name(locator)).clear();
        driver.findElement(By.name(locator)).sendKeys(name);
    }
    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

}
