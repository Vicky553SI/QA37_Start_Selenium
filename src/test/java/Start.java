import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;
    @Test
    public void strat(){
        wd=new ChromeDriver();
      //  wd.get("https://www.google.com/");
        wd.navigate().to("https://www.google.com/");

        wd.close();// close only one tab and if its single it will close browser also
       // wd.quit();// all tabs and all browers

    }
}
