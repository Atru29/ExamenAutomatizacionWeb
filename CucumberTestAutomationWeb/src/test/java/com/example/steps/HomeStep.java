package com.example.steps;

import com.example.utils.Base;
import com.example.pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeStep extends Base {



    public WebElement find(By element) {
        return driver.findElement(element);
    }
    public void click(By element) {
        find(element).click();
    }

    public void closeAnuncio01(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.btnClose));
        click(HomePage.btnClose);
    }
    public void closeAnuncio02(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.btnCerrar));
        click(HomePage.btnCerrar);
    }
    public void clicCuenta(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(HomePage.elementoOculto));
        click(HomePage.elementCuenta);
    }
    public void clicIniciarSesion(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(HomePage.elementIniciarSesion));
        click(HomePage.elementIniciarSesion);   }

    public void clicMiCuenta(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(HomePage.elementMiCuenta));
        click(HomePage.elementMiCuenta);   }

    //Validaciones
    public void validarNombre(String nombre) {
        WebElement textElementoNombre = find(HomePage.getTextUser);
        String valorEsperado = textElementoNombre.getAttribute("value");
        Assert.assertEquals(nombre,valorEsperado);
    }
    public void validarApellido(String apellido) {
        WebElement textElementoNombre = find(HomePage.getTextLastName);
        String valorEsperado = textElementoNombre.getAttribute("value");
        Assert.assertEquals(apellido,valorEsperado);
    }
    public void validarDni(String dni) {
        WebElement textElementoNombre = find(HomePage.getTextDni);
        String valorEsperado = textElementoNombre.getAttribute("value");
        Assert.assertEquals(dni,valorEsperado);
    }
    public void validarEmail(String email) {
        WebElement textElementoNombre = find(HomePage.getTextEmail);
        String valorEsperado = textElementoNombre.getAttribute("value");
        Assert.assertEquals(email,valorEsperado);
    }
    public void validarCelular(String celular) {
        WebElement textElementoNombre = find(HomePage.getTextCelular);
        String valorEsperado = textElementoNombre.getAttribute("value");
        Assert.assertEquals(celular,valorEsperado);
    }

    public void validarMensaje(String mensage) {
        WebElement textElementoMensajeCuenta = find(HomePage.getTextMensajeCuenta);
        String valorEsperado = textElementoMensajeCuenta.getText();
        Assert.assertEquals(mensage,valorEsperado);

    }
    public void clicEnvioGratis(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(HomePage.elementoOculto));
        click(HomePage.linkEnvioGratis);
    }
}
