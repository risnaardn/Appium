package com.juaracoding.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Calculator {

    private AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    //Locator
    By btnSatu = By.id("com.android.calculator2:id/digit_1");
    By btnDua = By.id("com.android.calculator2:id/digit_2");
    By btnTambah = By.id("com.android.calculator2:id/op_add");
    By btnSamaDengan = By.id("com.android.calculator2:id/eq");
    By hasil = By.id("com.android.calculator2:id/result");
    /* web: xpath = //taghtml[contains(@attr, value)] */

    //Method
    public void calcAdd() {
        driver.findElement(btnSatu).click();
        driver.findElement(btnTambah).click();
        driver.findElement(btnDua).click();
        driver.findElement(btnSamaDengan).click();
    }

    //
    public String getTxtResult() {
        return driver.findElement(hasil).getText();
    }

}
