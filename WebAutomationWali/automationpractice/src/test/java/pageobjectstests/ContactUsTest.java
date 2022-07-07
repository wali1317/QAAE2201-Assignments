package pageobjectstests;

import com.wali.browserdriver.BrowserDriver;
import com.wali.excelreader.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.ContactUsPage;
import pageobjects.HomePage;


public class ContactUsTest extends BrowserDriver {
    HomePage homePage = null;
    ContactUsPage contactUsPage = null;

    @BeforeMethod
    public void initializeElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
    }

    @DataProvider
    public Object[][] dataProvider() throws Exception {
        MyDataReader myDataReader = new MyDataReader();
        //Where is the excel file
        myDataReader.setExcelFile("/Users/jahidul/IdeaProjects/WebAutomationB2003/automationpractice/testData/testdata1.xlsx");
        Object[][] data = myDataReader.getExcelSheetData("Sheet1");
        return data;
    }

    @Test(dataProvider = "dataProvider")
    public void sendAMessageTest(String e, String m)  {
        homePage.clickContactUs();
        contactUsPage.writeEmailValue(e);
        contactUsPage.sendText(m);
        contactUsPage.clickSubmitButton();
        String actualErrorMessage = contactUsPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, "There is 1 error");
        System.out.println("Test Passed......");

    }
}
