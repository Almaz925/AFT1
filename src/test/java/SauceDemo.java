import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.id("user-name"));
        browser.findElement(By.name("password"));
        browser.findElement(By.className("login_password"));
        browser.findElement(By.tagName("h4"));
        browser.findElement(By.linkText("text")); //!!!Работает только с тегами <a>. "text" - написал для примера
        browser.findElement(By.partialLinkText("text"));//!!!Работает только с тегами <a>. "text" - написал для примера
        browser.findElement(By.xpath("//div[@class='login-box']"));
        browser.findElement(By.xpath("//h3[text()='Epic sadface: Username is required']"));
        browser.findElement(By.xpath("//input[@class='input_error form_input error' and @name='password']"));
        browser.findElement(By.cssSelector("[class=login-box]"));
        browser.findElement(By.cssSelector("#login-button"));
        browser.findElement(By.cssSelector(":root"));
        browser.quit();
    }
}
