package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AmazonPage;

public class AmazonSteps {

    AmazonPage amazon = new AmazonPage();

    @Given("Accedo a la pagina de Amazon")
    public void navigateToAmazon(){
    amazon.navigateToAmazon();
    
    }

    @When("Escribo el nombre del articulo en el campo de busqueda")
    public void searchItem(){
        amazon.enterSearchCriteria("gaming headset");
        amazon.clickItemSearch();


    }

    @Then("Elijo el articulo que me interesa")
    public void chooseItem(){

    }
    
    @And("Agrego dicho articulo al carrito")
    public void addItem(){

    }

    
    @Then("Regreso a la pagina de resultados")
    public void backToResults(){
        
    }
    

    @Then("Busco el otro articulo")
    public void searchNextItem(){

    }

    
    @When("Elijo el otro articulo que me interesa")
    public void chooseNextArticle(){

    } 


    @And("Procedo al checkout")
    public void proceedCheckout(){

    }



    @Then("Flujo completado")
    public void completedTest(){


    }






}
