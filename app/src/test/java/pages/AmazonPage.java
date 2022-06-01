package pages;

public class AmazonPage extends BasePage {

    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String searchTextField = "//input[@id='twotabsearchtextbox']";
    private String primerArticulo = "//span[contains(text(),'HyperX Cloud II - Gaming Headset, 7.1 Surround Sou')]";
    private String addToCartButton = "//input[@id='add-to-cart-button']";
    private String cerrarSidebarCart = "//a[@id='attach-close_sideSheet-link']";
    private String segundoArticulo = "//span[contains(text(),'HyperX Alloy Elite 2 – Mechanical Gaming Keyboard,')]";
    private String gotoCart = "//*[@id='sw-gtc']";
    private String checkOut = "//*[@id='sc-buy-box-ptc-button']/span/input";
    
    


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

    public void eliegirArticulo(){
        clickElement(primerArticulo);

    }

    public void agregarAlCarrito(){
        clickElement(addToCartButton);

    }

    public void regresarPaginaAnterior(){
        clickElement(cerrarSidebarCart);
    }

        public void clickOnSearch(){
            clickElement(searchTextField);
        }

        public void segundoArticuloElegir(){
            clickElement(segundoArticulo);
        }
    

        public void procederCheckout(){
            clickElement(checkOut);
        }

        public void goToCarttocheckout(){
            findElement(gotoCart);
            clickElement(gotoCart);
        }

}
