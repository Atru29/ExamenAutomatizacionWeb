Feature: Inicio de Sesión en el Sistema Web Juntoz

  @LoginConCredencialesCorrectas
  Scenario Outline: Inicio de sesion en Juntoz
    Given el usuario se encuentra en el Home Page "https://juntoz.com/"
    And el usuario hace clic en cuenta
    And el usuario hace clic en ingresar
    When el usuario se encuentra en el inicio se sesion
    And el usuario ingresa su email "<email>"
    And el usuario ingresa su password "<password>"
    And el usuario hace clic en Login
    Then el usuario valida su nombre en el HomePage "<nombre>"
    And el usuario hcae clic en Mi Cuenta
    And el usuario valida su nombre "<nombre>"
    And el usuario valida su apellido "<apellido>"
    And el usuario valida su dni "<dni>"
    And el usuario valida su email "<email>"
    And el usuario valida su celular "<celular>"
    And el usuario valida la la opcion de salir de la sesion "<mensaje>"
    Examples:
      | email                      | password          | nombre | apellido | dni      | celular   | mensaje           |
      | juanarturo290820@gmail.com | contraPrueba1234@ | Juan   | Rojas    | 70115103 | 994643374 | Ajustes de cuenta |
