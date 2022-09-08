package Test;

import org.testng.annotations.Test;

public class TestToVerifyAbleToSearch extends BaseClass{

    @Test
    public void AbleToSearch() throws InterruptedException {
        pageFactory.getAbleToSearch().searchProduct();
    }
}
