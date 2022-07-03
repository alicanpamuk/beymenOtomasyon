import org.openqa.selenium.*;

import java.util.List;

public class AnasayfaClass extends BasePage{

    By sepetimButton = By.xpath("//a/span[contains(text(),'Sepetim')]");
    By hesabimButton = By.xpath("//a/span[contains(text(),'Hesabım')]");
    By favoriButton =  By.xpath("//a/span[contains(text(),'Favorilerim')]");
    By aramaBari = new By.ByCssSelector("input[class='default-input o-header__search--input'");
    By dahaFazlaButon = By.id("moreContentButton");
    By cerezKabul = new By.ByCssSelector("button[id='onetrust-accept-btn-handler']");


    public AnasayfaClass(WebDriver driver) {
        super(driver);
    }

    public boolean anasayfaButonKontrolu() throws InterruptedException {
        Thread.sleep(4000);

        if(elementKontrol(sepetimButton) && elementKontrol(hesabimButton) && elementKontrol(favoriButton)){
            return true;
        }else{
            return false;
        }

    }

    public void urunAra(){
        elementTikla(cerezKabul);
        elementTikla(aramaBari);
        textYaz(aramaBari,"pantolan");
        elementSec(aramaBari).sendKeys(Keys.RETURN);
    }


    public void scrollEtme() throws InterruptedException {
        Thread.sleep(2000);


        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,6700)", "");

        Thread.sleep(5000);

        elementTikla(dahaFazlaButon);
    }

}












