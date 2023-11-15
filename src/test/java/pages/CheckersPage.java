package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckersPage {
    public CheckersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "space00")
    public WebElement square00;

    @FindBy(name = "space20")
    public WebElement square20;

    @FindBy(name = "space40")
    public WebElement square40;

    @FindBy(name = "space60")
    public WebElement square60;

    @FindBy(name = "space11")
    public WebElement square11;

    @FindBy(name = "space31")
    public WebElement square31;

    @FindBy(name = "space51")
    public WebElement square51;

    @FindBy(name = "space71")
    public WebElement square71;

    @FindBy(name = "space02")
    public WebElement square02;

    @FindBy(name = "space22")
    public WebElement square22;

    @FindBy(name = "space42")
    public WebElement square42;

    @FindBy(name = "space62")
    public WebElement square62;

    @FindBy(name = "space13")
    public WebElement square13;

    @FindBy(name = "space33")
    public WebElement square33;

    @FindBy(name = "space53")
    public WebElement square53;

    @FindBy(name = "space73")
    public WebElement square73;

    @FindBy(name = "space04")
    public WebElement square04;

    @FindBy(name = "space24")
    public WebElement square24;

    @FindBy(name = "space44")
    public WebElement square44;

    @FindBy(name = "space64")
    public WebElement square64;

    @FindBy(name = "space15")
    public WebElement square15;

    @FindBy(name = "space35")
    public WebElement square35;

    @FindBy(name = "space55")
    public WebElement square55;

    @FindBy(name = "space75")
    public WebElement square75;

    @FindBy(name = "space06")
    public WebElement square06;

    @FindBy(name = "space26")
    public WebElement square26;

    @FindBy(name = "space46")
    public WebElement square46;

    @FindBy(name = "space66")
    public WebElement square66;

    @FindBy(name = "space17")
    public WebElement square17;

    @FindBy(name = "space37")
    public WebElement square37;

    @FindBy(name = "space57")
    public WebElement square57;

    @FindBy(name = "space77")
    public WebElement square77;

    @FindBy(id = "message")
    public WebElement message;

    @FindBy(xpath = "//a[@href ='./']")
    public WebElement restartBtn;
}
