package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VerifyWomenNewIn {
    WebDriver driver;
    By Women = By.xpath("(//a[@class='nav-primary__menu-link icon--hdr-arrow-right'])[1]");
    By veiwAll = By.xpath("(//a[contains(text(),'View All')])[1]");
    By NewIN =By.xpath("//h1[@class='product-listing__title']");

    public VerifyWomenNewIn(WebDriver driver) {
        this.driver=driver;
    }

    public void verifyWomenNewIn() {
        WebElement ele = driver.findElement(Women);
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        driver.findElement(veiwAll).click();
        String actual = driver.findElement(NewIN).getText();
        Assert.isTrue(actual.equals("Women’s New In"),"Expected result does not match with Actual Result");
    }
}
