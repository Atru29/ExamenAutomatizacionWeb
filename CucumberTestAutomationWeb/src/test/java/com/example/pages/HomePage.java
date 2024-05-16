package com.example.pages;

import org.openqa.selenium.By;

public class HomePage {

    //public static By txtDashboard = By.xpath("//header/div[1]/div[1]/span/h6");
    public static By elementCuenta = By.xpath("/html/body/header/nav/div/div[4]/div[2]/div[2]/a");
    public static By elementIniciarSesion = By.xpath("/html/body/header/nav/div/div[4]/div[2]/div[2]/ul/li/div[1]/a");
    public static  By btnClose = By.xpath("//*[@id=\"onesignal-slidedown-cancel-button\"]");
    public static By btnCerrar = By.xpath("/html/body/w-div[1]/w-div/w-div/span");
    public static By elementoOculto = By.xpath("//w-div[@id='wsato26']");
    public static By elementMiCuenta = By.xpath("/html/body/header/nav/div/div[4]/div[2]/div[2]/ul/li[1]/a");
    public static By getTextUser= By.xpath("//input[@name='FirstName']");
    public static By getTextLastName= By.xpath("//input[@name='LastName']");
    public static By getTextDni= By.xpath("//input[@name='IdentificationNumber']");
    public static By getTextEmail= By.xpath("//input[@type='email']");
    public static By getTextCelular= By.xpath("//input[@name='CellPhone']");
    public static By getTextMensajeCuenta = By.xpath("//div[@class='my-account']/div/blockquote/p");

    public static By linkEnvioGratis = By.xpath("//div[@class='cart-headband']//span[text()='Envío Gratis']");

}
