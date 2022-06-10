Feature: Interactuar con la pagina testproject para realizar el browse

  @tag1
  Scenario: realizar el filtrado por la marca Adidas
    Given que el usuario se encuentra en la pagina principal
    When ingresa la busqueda <word>
    And filtrar por la marca Adidas
    And Imprimir y Ordenar 5 primeros productos y precios
    And Imprimir y Deshabilitar filtro
   Then Validar 5 primeros productos
     Examples: 
      | word    |
      | zapatilla | 

    