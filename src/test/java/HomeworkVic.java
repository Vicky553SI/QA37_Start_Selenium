import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeworkVic {
    WebDriver wd;

    @BeforeClass
    public void setup (){
        wd= new ChromeDriver();
        wd.get("https://telranedu.web.app/home/login");
    }
@Test
    public void cssLocators(){
    WebElement el= wd.findElement(By.tagName("a"));
    //WebElement = wd.findElement(By.cssSelector("navbar-component_nav__1X_4m"));
    // bt class
    WebElement divcontainer = wd.findElement(By.className("container"));
    WebElement divcontainer2 = wd.findElement(By.cssSelector(".container"));
    // by id
    WebElement root = wd.findElement(By.id("root"));
    WebElement root2 = wd.findElement(By.cssSelector("#root"));

    WebElement divEl = wd.findElement(By.cssSelector("[class ='container']"));
    //WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Email']"));

    WebElement a2 = wd.findElement(By.cssSelector("[href ='/login']"));

    //WebElement input = wd.findElement(By.cssSelector("[placeholder='Email']"));






}
}
