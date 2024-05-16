package com.example.pages;

import org.openqa.selenium.By;

public class CarritoPage {

    public static By btnElegitOpcionCard = By.xpath("/html/body/section/div/div[7]/div/div/div/div[2]/div/div[3]/div[1]/div[1]/div/div[15]/a");
    public static By btnAnadirCarrito = By.xpath("(//button[@class='btn btn-primary purpple-jz'])[1]");
    public static By elementoOculto = By.xpath("//img[@class='img-fluid']");
    public static By btnIrAlCarrito = By.xpath("/html/body/section/div[1]/div/div[2]/div[3]/div/div/div[5]/a[1]");
    public static By textCantidadProducto = By.xpath("//span[contains(text(), '(1 productos)')]");
    public static By textProductoNombre= By.xpath("//a[contains(@href, '/p/seccional-lujo-vitoriano-27214946secc-lujog0111202305120171566')]");

}
