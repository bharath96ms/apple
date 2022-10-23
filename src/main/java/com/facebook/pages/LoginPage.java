package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}

@FindBy(how=How.CSS, using="input[id='email']") 
WebElement unTxtFld;

@FindBy(how=How.CSS, using="input[id='pass']") 
WebElement pwdTxtFld;

@FindBy(how=How.CSS, using="button[name='login']") 
WebElement loginBtn;

public void userDetails(String usrName, String usrPwd) {
	unTxtFld.sendKeys(usrName);
	pwdTxtFld.sendKeys(usrPwd);
	loginBtn.click();
}

}

