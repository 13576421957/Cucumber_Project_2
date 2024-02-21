package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverClass;

import java.time.Duration;

public class Parent {
    public WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(20));
    Actions actions = new Actions(DriverClass.getDriver());

    public void myClick(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        actions.scrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String str) {
        wait.until(ExpectedConditions.visibilityOf(element));
        actions.scrollToElement(element);
        element.clear();
        element.sendKeys(str);
    }

}
