package com.testProject.pages;

import com.testProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/button")
    public WebElement addElementButton;

    @FindBy(xpath = "//*[@id=\"elements\"]/button[2]")
    public WebElement deleteElementButton;

}

