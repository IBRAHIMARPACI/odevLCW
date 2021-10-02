import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.util.Random;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(TestResultLogger.class)

public class LcwTest extends AnaTest  {



    @Test
    public void LcwTesti() throws InterruptedException {

     WebElement grs = driver.findElement(By.cssSelector("a[class=\"header-profile header-user-section\"]"));
    grs.click();

   driver.findElement(By.cssSelector("input[id=\"LoginEmail\"]")).sendKeys("iibrahimarpacii@gmail.com");
    driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("ibram5.");

    WebElement elementt = driver.findElement(By.cssSelector("a[class=\"button bc-blue login-button-link bold\"]"));
    elementt.click();

    Thread.sleep(2000);


    driver.findElement(By.cssSelector("input[id=\"search\"]")).sendKeys("pantolon");
    WebElement arama = driver.findElement(By.cssSelector("a[class=\"search-button active\"]"));
    arama.click();

    Thread.sleep(2000);

    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    WebElement dahafazla = driver.findElement(By.cssSelector("a[class=\"lazy-load-button\"]"));
    dahafazla.click();


    Random rn = new Random();

    int n = 96 - 1 + 1;
    int i = rn.nextInt() % n;
    int a =  1 + i;
    WebElement random =driver.findElement(By.xpath("(//*[@class=\"row c-items\"]/div)["+String.valueOf(a)+"]"));
        Thread.sleep(2000);
    random.click();

    WebElement beden;
    beden = driver.findElement(By.xpath("//*[@id=\"option-size\"]/a[1]"));
    beden.click();

    Thread.sleep(1000);

    WebElement sepetekle;
    sepetekle = driver.findElement(By.xpath("//*[@id=\"pd_add_to_cart\"]"));
    sepetekle.click();

    WebElement sepet;
    sepet = driver.findElement(By.cssSelector("i[class=\"header-bag-icon bndl-shopping-bag bndl-shopping-bag-dims\"]"));
    sepet.click();

    WebElement arttir;
    arttir = driver.findElement(By.cssSelector("a[class=\"oq-up plus\"]"));
    arttir.click();

    Thread.sleep(2000);

    String mesaj = "2";
    Assertions.assertEquals(mesaj, driver.findElement(By.xpath("//div//div//input[@class=\"item-quantity-input ignored\"]")).getAttribute("value"));
    System.out.println("urun adet sayisi=2");


    WebElement sil;
    sil = driver.findElement(By.cssSelector("i[class=\"fa fa-trash-o\"]"));
    sil.click();

    Thread.sleep(1000);
    WebElement sill;
    sill =driver.findElement(By.cssSelector("a[class=\"inverted-modal-button sc-delete ins-init-condition-tracking\"]"));
    sill.click();

    Thread.sleep(2000);

    String bosSepet = "Sepetinizde ürün bulunmamaktadır.";
    WebElement bosSepetXpath= driver.findElement(By.xpath("//div//div//div//div//p[@class=\"cart-empty-title\"]"));
    Assertions.assertEquals(bosSepet,bosSepetXpath.getText());
    System.out.println("Boş sepet");




}

}

