package com.example.stepsdef;

import com.example.pages.HomePage;
import com.example.steps.HomeStep;
import com.example.steps.LoginStep;
import com.example.utils.Base;
import com.example.utils.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

public class LoginStepsDef extends Base {

    protected Hooks hooks;
    protected LoginStep loginStep;
    protected HomeStep homeStep;

    public LoginStepsDef(Hooks hooks) {
        this.hooks = hooks;
        loginStep = new LoginStep();
        homeStep = new HomeStep();
    }

    @Given("el usuario se encuentra en el Home Page {string}")
    public void el_usuario_se_encuentra_en_el_home_page(String url) {
        driver.get(url);
        homeStep.closeAnuncio01();
        homeStep.closeAnuncio02();
    }

    @Given("el usuario hace clic en cuenta")
    public void el_usuario_hace_clic_en_cuenta() {
        homeStep.clicCuenta();
    }

    @Given("el usuario hace clic en ingresar")
    public void el_usuario_hace_clic_en_ingresar() {
        homeStep.clicIniciarSesion();
    }

    @When("el usuario se encuentra en el inicio se sesion")
    public void el_usuario_se_encuentra_en_el_inicio_se_sesion() {

    }

    @And("el usuario ingresa su email {string}")
    public void el_usuario_ingresa_su_email(String email) {
        loginStep.typeEmail(email);
    }

    @And("el usuario ingresa su password {string}")
    public void el_usuario_ingresa_su_password(String pass) {
        loginStep.typerPass(pass);
    }

    @And("el usuario hace clic en Login")
    public void el_usuario_hace_clic_en_login() {
        loginStep.clickdoLogin();
    }

    @Then("el usuario valida su nombre en el HomePage {string}")
    public void el_usuario_valida_su_nombre_en_el_home_page(String string) {

    }

    @Then("el usuario hcae clic en Mi Cuenta")
    public void el_usuario_hcae_clic_en_mi_cuenta() {
        homeStep.clicCuenta();
        homeStep.clicMiCuenta();
    }

    @Then("el usuario valida su nombre {string}")
    public void el_usuario_valida_su_nombre(String nombre) {
        homeStep.validarNombre(nombre);
    }

    @Then("el usuario valida su apellido {string}")
    public void el_usuario_valida_su_apellido(String apellido) {
homeStep.validarApellido(apellido);
    }

    @Then("el usuario valida su dni {string}")
    public void el_usuario_valida_su_dni(String dni) {
homeStep.validarDni(dni);
    }

    @Then("el usuario valida su email {string}")
    public void el_usuario_valida_su_email(String email) {
homeStep.validarEmail(email);
    }

    @Then("el usuario valida su celular {string}")
    public void el_usuario_valida_su_celular(String celular) {
homeStep.validarCelular(celular);
    }

    @Then("el usuario valida la la opcion de salir de la sesion {string}")
    public void el_usuario_valida_la_la_opcion_de_salir_de_la_sesion(String mensaje) {
homeStep.validarMensaje(mensaje);
    }
}

