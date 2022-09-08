package Test;

import org.testng.annotations.Test;

public class TestToVerifyWomenNewIn extends BaseClass{

    @Test
    public void VerifyRedirectToWomenNewIn(){

        pageFactory.getHomePage().verifyWomenNewIn();
    }
}
