package com.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected int TIME_OUT = 10;
}
