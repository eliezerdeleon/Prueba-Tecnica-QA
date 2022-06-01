Feature: Realizar el checkout de uno o varios productos en Amazon.com

    Automatize la pagina https://www.amazon.com/ hasta realizar el checkout de uno o varios productos

Scenario: Como usuario agrego articulos al carrito y procedo al checkout
    Given Accedo a la pagina de Amazon
    When Escribo el nombre del articulo en el campo de busqueda
    Then Elijo el articulo que me interesa
    And Agrego dicho articulo al carrito
    Then Regreso a la pagina de resultados
    Then Busco el otro articulo
    When Elijo el otro articulo que me interesa
    Then Agrego dicho articulo al carrito
    And Procedo al checkout
    Then Flujo completado