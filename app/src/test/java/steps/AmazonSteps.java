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
    System.out.println ("ACCEDIENDO A AMAZON.COM");
    
    }

    @When("Escribo el nombre del articulo en el campo de busqueda")
    public void searchItem(){
        String criteriaGH = "gaming headset";
        amazon.enterSearchCriteria(criteriaGH);
        amazon.clickItemSearch();

        System.out.println ("BUSCANDO "+criteriaGH+" EN EL CAMPO DE BUSQUEDA");
    }

    @Then("Elijo el articulo que me interesa")
    public void chooseItem(){
        amazon.eliegirArticulo();

        System.out.println ("ARTICULO ELEGIDO");
    }
    
    @And("Agrego dicho articulo al carrito")
    public void addItem(){
        amazon.agregarAlCarrito();

        System.out.println ("AGREGADO AL CARRITO");
    }

    
    @Then("Regreso a la pagina anterior")
    public void backToPreviousPage(){
        amazon.regresarPaginaAnterior();

        System.out.println ("REGRESANDO A PAGINA ANTERIOR");
    }
    

    @Then("Busco el otro articulo")
    public void searchNextItem(){
        String criteriaGK = "gaming keyboard";
        amazon.clickOnSearch();
        amazon.enterSearchCriteria(criteriaGK);
        amazon.clickItemSearch();

        System.out.println ("BUSCANDO OTRO ARTICULO");
        System.out.println ("BUSCANDO "+criteriaGK+" EN EL CAMPO DE BUSQUEDA");

    }

    
    @When("Elijo el otro articulo que me interesa")
    public void chooseNextArticle(){
        amazon.segundoArticuloElegir();
        
        System.out.println ("ARTICULO SELECCIONADO");

    } 


    @And("Procedo al checkout")
    public void proceedCheckout(){
        amazon.procederCheckout();

        System.out.println ("PROCEDIENDO AL CHECKOUT");
        
    }



    @Then("Flujo completado")
    public void completedTest(){
        System.out.println ("FLUJO COMPLETADO");

    }






}
