package page_object_model;

import org.openqa.selenium.*;

import java.util.List;

public class ContactUsPage {
    WebDriver driver = null;

    public ContactUsPage(WebDriver driver){
        this.driver = driver;
    }

    By contactus  = By.xpath("//*[ text() = 'Contact Us']");
    By scroll_down = By.tagName("body");
    By iFrame = By.id("inline-xQyVCIFgqlFo7HJjeLPA");
    By firstname = By.xpath("//input[@name='first_name']");
    By lastname = By.id("last_name");
    By e_mail = By.xpath("(//input)[3]");
    By country_select = By.xpath("//*[@id=\"iti-0__item-ch\"]");
    By phoneNumber = By.id("phone");
    By message = By.xpath("//*[@id=\"_builder-form\"]/div/div[5]/div/div/textarea");
    By checkbox = By.xpath("(//input)[5]");
    //By reCAPTCHA = By.xpath("//iframe[@title='reCAPTCHA']");
    By reCAPTCHA = By.xpath("//*[@id=\"_builder-form\"]/div/div[7]/div/div/div/div/div/iframe");
    By select_checkbox = By.cssSelector(".recaptcha-checkbox-border");
    By verifyBtn = By.xpath("//*[@id=\"recaptcha-verify-button\"]");
    By submitBtn = By.xpath("//div[contains(text(),'Submit')]");



    public void click_on_contactus(){
        driver.findElement(contactus).click();
    }

    public void setScroll_down(){
        driver.findElement(scroll_down).sendKeys(Keys.PAGE_DOWN);
    }

    public void click_on_iframe(){
        driver.switchTo().frame(driver.findElement(iFrame));
    }

    public void enter_your_firstname(String f_name){
        driver.findElement(firstname).sendKeys(f_name);
    }

    public void enter_your_lastname(String l_name){
        driver.findElement(lastname).sendKeys(l_name);
    }

    public void enter_your_email(String email){
        driver.findElement(e_mail).sendKeys(email);
    }

    public void selectCountry_checkbox(){
        List<WebElement> listOfElements = driver.findElements(country_select);
        for (WebElement li : listOfElements) {
            if (li.getText().trim().equals("Canada")) {
                li.click();
                break;
            }
        }

        driver.findElement(country_select).click();
    }

    public void enter_your_phoneNumber(String phone){
        driver.findElement(phoneNumber).sendKeys(phone);
    }

    public void enter_your_message(String text){
        driver.findElement(message).sendKeys(text);
    }

    public void click_on_checkbox(){
        driver.findElement(checkbox).click();
    }

    public void click_on_reCAPTCHA(){
        driver.switchTo().frame(driver.findElement(reCAPTCHA));
    }

    public void click_on_reCAPTCHA_checkbox(){
        driver.findElement(select_checkbox).click();
    }

    public void click_on_verifyBtn(){
        driver.findElement(verifyBtn).click();
    }

    public void click_on_submitBtn(){
        driver.findElement(submitBtn).click();
    }

}
