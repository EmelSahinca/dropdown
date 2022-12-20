package tests;

import org.junit.Test;
import utilities.TestBase;

public class Day07_TestBaseDemo extends TestBase {

    @Test
    public void test1() {
        driver.get("https://testcenter.techproeducation.com/");
        System.out.println(driver.getTitle());
    }

    @Test
    public void test2() {
        driver.get("https://testcenter.techproeducation.com/");
        System.out.println(driver.getTitle());
    }
   /* Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts
    Create a class: AlertTest
    Create setUp method
    Create 3 test methods:
    acceptAlert() => click on the first alert,
    verify the text “I am a JS Alert” ,
    click OK ,
    and Verify “You successfully clicked an alert”
    dismissAlert()=> click on the second alert,
    verify text "I am a JS Confirm”,
    click cancel,
    and Verify “You clicked: Cancel”
    sendKeysAlert()=> click on the third alert,
    verify text “I am a JS prompt”,
    type “Hello World”,
    click OK,
    and Verify “You entered: Hello World”*/
}