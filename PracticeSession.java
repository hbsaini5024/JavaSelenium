package week1.day4;



import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;
public class PracticeSession {




public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
ChromeDriver driver=new ChromeDriver(options);



driver.get("https://login.salesforce.com/");



driver.manage().window().maximize();



driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");



driver.findElement(By.id("password")).sendKeys("Tuna@123");



driver.findElement(By.id("Login")).click();



Thread.sleep(20000);



WebElement element = driver.findElement(By.xpath("//div//lightning-primitive-icon/*[@class='slds-icon slds-icon_x-small']"));
element.click();



Thread.sleep(10000);

driver.findElement(By.xpath("//span[contains(text(),'New Lead')]")).click();




Thread.sleep(10000);



driver.findElement(By.id("3511:0")).sendKeys("vivek");
driver.findElement(By.id("2990:0")).sendKeys("kumar");
driver.findElement(By.xpath("(//input[@class=\" input\"])[1]")).sendKeys("vivek.kumar18@gds.ey.com");



driver.findElement(By.xpath("(//input[@class=\" input\"])[2]")).clear();
driver.findElement(By.xpath("(//input[@class=\" input\"])[2]")).sendKeys("9876543210");
driver.findElement(By.xpath("(//input[@class=\" input\"])[3]")).clear();
driver.findElement(By.xpath("(//input[@class=\" input\"])[3]")).sendKeys("testcompany");





Thread.sleep(7000);



driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
}





}