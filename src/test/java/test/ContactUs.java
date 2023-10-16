package test;

import base.BaseClass;
import org.testng.annotations.Test;
import page_object_model.ContactUsPage;

public class ContactUs extends BaseClass {

    @Test
    public void contactUs_test() throws InterruptedException {
        ContactUsPage contact = new ContactUsPage(driver);
        contact.click_on_contactus();
        Thread.sleep(3000);
        contact.setScroll_down();
        Thread.sleep(2000);
        contact.click_on_iframe();
        Thread.sleep(2000);
        contact.enter_your_firstname("Zahangir");
        Thread.sleep(2000);
        contact.enter_your_lastname("Alam");
        Thread.sleep(2000);
        contact.enter_your_email("zahangir@gmail.com");
        Thread.sleep(2000);
        contact.enter_your_phoneNumber("01401155149");
        Thread.sleep(2000);
        contact.enter_your_message("Good Evening!");
        Thread.sleep(2000);
        contact.setScroll_down();
        Thread.sleep(2000);
        contact.click_on_checkbox();
        Thread.sleep(3000);
        contact.click_on_reCAPTCHA();
        Thread.sleep(3000);
        contact.click_on_reCAPTCHA_checkbox();
        Thread.sleep(5000);
        contact.click_on_submitBtn();
        Thread.sleep(5000);
        System.out.println("Successfully visited contact form");


    }


}
