package com.example.stepsdef;

import com.example.steps.CarritoStep;
import com.example.steps.HomeStep;
import com.example.steps.LoginStep;
import com.example.utils.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarritoStepDef {
    protected Hooks hooks;
    protected HomeStep homeStep;
    protected CarritoStep carritoStep;
    public CarritoStepDef(Hooks hooks) {
        this.hooks = hooks;
        carritoStep = new CarritoStep();
        homeStep = new HomeStep();
    }
    @Given("el usuario hace clic en Envio Gratis")
    public void el_usuario_hace_clic_en_envio_gratis() {
        homeStep.clicEnvioGratis();
    }
    @When("el usuario se encuentra en el catalogo hace clic en el Primer Producto")
    public void el_usuario_se_encuentra_en_el_catalogo_hace_clic_en_el_primer_producto() {
        carritoStep.clicElegirProducto();
    }
    @And("el usuario añade un producto al carrito")
    public void el_usuario_anade_un_producto_al_carrito() {
        carritoStep.clicAnadirCarrito();
    }
    @And("el usuario va al carrito")
    public void elUsuarioVaAlCarrito() {
        carritoStep.clicIrAlCarrito();
    }



    @Then("valida que el producto se encuentre en el carrito {string}")
    public void validaQueElProductoSeEncuentreEnElCarrito(String cantidad) {
        carritoStep.validarProductoCarrito(cantidad);
    }

    @And("valida el nombre del producto {string}")
    public void validaElNombreDelProducto(String nombreProducto) {
        carritoStep.validarProductoNombre(nombreProducto);
    }
}
