Feature: Interaccion con el Carrito de Compras de Sistema Web Juntoz

  @AgregarProductoAlCarrito
  Scenario Outline: Agregar Producto al Carrito de Compras
    Given el usuario se encuentra en el Home Page "https://juntoz.com/"
    And el usuario hace clic en Envio Gratis
    When el usuario se encuentra en el catalogo hace clic en el Primer Producto
    And el usuario añade un producto al carrito
    And el usuario va al carrito
    Then valida que el producto se encuentre en el carrito "<cantidad>"
    And valida el nombre del producto "<nombreProducto>"
    Examples:
      | cantidad      |nombreProducto|
      | (1 productos) |Sofa seccional Derecho Lujo Vitoriano - Color: Gris|

