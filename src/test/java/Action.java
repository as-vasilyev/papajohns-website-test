import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
    private final ChromeDriver driver = new ChromeDriver();
    org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(driver);

    public void open(String address) {
        driver.get(address);
    }

    public void maximizeBrowserWindow(){
        driver.manage().window().maximize();
    }

    public void close() {
        driver.quit();
    }

    public void click(WebElement element)
    {
        action.moveToElement(element).click().perform();
    }
    public void typeIn(WebElement element, String text)
    {
        action.moveToElement(element).sendKeys(text).perform();
    }
}
