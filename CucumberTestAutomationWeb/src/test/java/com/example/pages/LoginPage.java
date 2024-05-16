package com.example.pages;

import org.openqa.selenium.By;

public class LoginPage{

    public static By inputEmail = By.id("UserName");
    public static By inputPassword= By.id("Password");
    public static By btnLogin= By.xpath("//input[@type='submit']");
    public static By btnNoCerrarSesion = By.xpath("//*[@id=\"Remember\"]");




}
