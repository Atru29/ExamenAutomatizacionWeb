package com.example.steps;

import com.example.pages.LoginPage;
import com.example.pages.HomePage;
import com.example.utils.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.time.Duration;

public class LoginStep extends Base {

    private static final Logger logger = LogManager.getLogger(LoginStep.class);
    public WebElement findElement(By element){
        return driver.findElement(element);
    }
    public void click(By element) {
        findElement(element).click();
    }
    public void typeEmail(String user){
        findElement(LoginPage.inputEmail).sendKeys(user);
    }

    public void typerPass(String pass) {
        findElement(LoginPage.inputPassword).sendKeys(pass);
    }
    /* Metodo obsoleto por la presencia de un captcha en el login
    public void clickdoLogin() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(LoginPage.btnLogin));
        click(LoginPage.btnLogin);
    }
    */

    // Método para evadir captcha del Login con movimiento de mouse lento
    private void clicConVelocidadLenta(WebElement element) {
        //Crea un objeto Actions
        Actions actions = new Actions(driver);
        //Mueve el mouse al elemento
        actions.moveToElement(element);
        //Espera un momento
        actions.pause(Duration.ofMillis(500)); // Milisegundos de espera entre acciones
        //clic en el elemento
        actions.click(element);
        //Ejecuta las acciones
        actions.perform();
    }
    // Método modificado para hacer clic en el botón de inicio de sesión con velocidad lenta
    public void clickdoLogin() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement btnLogin = wait.until(ExpectedConditions.elementToBeClickable(LoginPage.btnLogin));
        clicConVelocidadLenta(btnLogin);
    }


}
