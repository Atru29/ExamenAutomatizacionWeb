package com.example.steps;

import com.example.pages.CarritoPage;
import com.example.pages.HomePage;
import com.example.utils.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CarritoStep extends Base {
    public WebElement find(By element) {
        return driver.findElement(element);
    }
    public void click(By element) {
        find(element).click();
    }
    public void clicElegirProducto(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@class='img-fluid']")));
        wait.until(ExpectedConditions.elementToBeClickable(CarritoPage.btnElegitOpcionCard));
        click(CarritoPage.btnElegitOpcionCard);   }

    public void clicAnadirCarrito(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(CarritoPage.btnAnadirCarrito));
        click(CarritoPage.btnAnadirCarrito);   }

    public void clicIrAlCarrito() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(CarritoPage.btnIrAlCarrito));
        click(CarritoPage.btnIrAlCarrito);
    }
    public void validarProductoCarrito(String mensaje){
        WebElement cantidadProductosElement = find(CarritoPage.textCantidadProducto);
        String cantidadProductos = cantidadProductosElement.getText();
        Assert.assertEquals(mensaje,cantidadProductos);
    }
    public void validarProductoNombre(String nombreProducto){
        WebElement productoElement = driver.findElement(By.xpath("//a[contains(text(), 'Sofa seccional Derecho Lujo Vitoriano - Color: Gris')]"));
        String textoProducto = productoElement.getText();
        Assert.assertEquals(nombreProducto,textoProducto);
    }


    }

