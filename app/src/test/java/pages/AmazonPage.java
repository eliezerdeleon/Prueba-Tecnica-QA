package pages;

public class AmazonPage extends BasePage {

    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String searchTextField = "//input[@id='twotabsearchtextbox']";


    public AmazonPage(){
        super(driver);
    }


    public void navigateToAmazon(){

        navigateTo("https://www.amazon.com/");

    }

    public void clickItemSearch(){
        clickElement(searchButton);

    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);

}

    
}
