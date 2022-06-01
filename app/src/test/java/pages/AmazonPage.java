package pages;

public class AmazonPage extends BasePage {

    private String searchButton = "";
    private String searchTextField = "";


    public AmazonPage(){
        super(driver);
    }


    public void navigateToAmazon(){

        navigateTo("https://www.amazon.com/");

    }

    public void clickItemSearch(){


    }

public void enterSearchCriteria(String criteria){
    

}

    
}
