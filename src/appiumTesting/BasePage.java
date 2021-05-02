package appiumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    @FindBy(id = "com.google.android.dialer:id/contacts_tab")
    public WebElement ContactTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Create new contact']")
    public WebElement AddContact;

    @FindBy(xpath = "//android.widget.EditText[@text='First name']")
    public WebElement FirstName;

    @FindBy(id = "com.android.contacts:id/editor_menu_save_button")
    public WebElement SaveBtn;

    By by_createNewContact = By.xpath("//android.widget.TextView[@text='Create new contact']");
    By by_FirstName = By.xpath("//android.widget.EditText[@text='First name']");

    public void save_Contact() throws InterruptedException {
        Thread.sleep(500);
        ContactTab.click();
        new WebDriverWait(AppDriver.getDriver(), 20).until(ExpectedConditions.presenceOfElementLocated(by_createNewContact));
        AddContact.click();
        new WebDriverWait(AppDriver.getDriver(), 20).until(ExpectedConditions.presenceOfElementLocated(by_FirstName));
        FirstName.sendKeys("Welcome111");
        SaveBtn.click();
    }

}
