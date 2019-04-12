package tvizor.ua.brncv.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver driver)
    {
        super(driver);
    }
    public void login(String username, String password) {
        type(("user"),username);
        type(("pass"),password);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
    }
}




