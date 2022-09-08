package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;

    public VerifyWomenNewIn womenNewIn;
    public UserAbleToSearchProduct ableToSearch;
    public PageFactory(WebDriver driver){
        this.driver = driver;
    }

    public VerifyWomenNewIn getHomePage(){
        if(womenNewIn == null){
            womenNewIn = new VerifyWomenNewIn(driver);
        }
        return womenNewIn;
    }

    public UserAbleToSearchProduct getAbleToSearch(){
        if(ableToSearch == null){
            ableToSearch = new UserAbleToSearchProduct(driver);
        }
        return ableToSearch;
    }
}
