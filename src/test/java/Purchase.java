import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Purchase {

    public static WebDriver driver;

    @Test
    public void Purchase() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Device\\Chrome\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dom-kauf.com/ru/");

        driver.findElement(By.xpath("/html/body/main/header/div/nav/div[2]/div/div/div/div/div[1]/div/form/div/input[2]")).click();
        driver.findElement(By.xpath("/html/body/main/header/div/nav/div[2]/div/div/div/div/div[1]/div/form/div/input[2]")).sendKeys("Молоток для отбивания мяса");
        driver.findElement(By.xpath("//*[@id=\"search_form\"]/div/button/i")).click();

        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/div/div/article/div/div[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).sendKeys("1");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkout-personal-information-step\"]/div/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[1]/div[1]/input")).sendKeys("nimrad82@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input")).sendKeys("47nimrad89");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/footer/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"payment-option-1\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button")).click();


    }
}