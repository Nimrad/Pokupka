import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

    public static WebDriver driver;

    @Test
    public void Login() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Device\\Chrome\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dom-kauf.com/ru/");

        driver.findElement(By.xpath("//*[@id=\"header\"]/div/nav/div[1]/div/div[1]/div/div/div[2]/div[2]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/div/div/div[2]/div/div[1]/form/div[3]/input")).sendKeys("nimrad82@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/div/div/div[2]/div/div[1]/form/div[4]/input")).sendKeys("47nimrad89");
        driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/div/div/div[2]/div/div[1]/form/div[6]/button/span[2]")).click();

    }
}

