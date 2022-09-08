package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAbleToSearchProduct {
    WebDriver driver;
    By Search = By.xpath("(//input[@class='navigation-search-bar--search'])[1]");
    By Searchby = By.xpath("(//input[@class='navigation-search-bar--search'])[2]");
    By button = By.xpath("//button[@class='navigation-search-bar--submit   navigation-btn__blackicon--search']");


    public UserAbleToSearchProduct(WebDriver driver) {
        this.driver=driver;
    }

    public void searchProduct() throws InterruptedException {
        driver.findElement(Search).click();
        driver.findElement(Searchby).sendKeys("Shirts");
        driver.findElement(button).click();
        String actual = driver.findElement(By.xpath("(//div[@class='filter__label'])[1]")).getText();
        Assert.isTrue(actual.equals("Categories"), "Expected result does not match with actual result");
    }
}
