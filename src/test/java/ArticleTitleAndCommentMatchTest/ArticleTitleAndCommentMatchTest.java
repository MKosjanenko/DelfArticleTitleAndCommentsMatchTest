package ArticleTitleAndCommentMatchTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArticleTitleAndCommentMatchTest {
    private String MAIN_PAGE ="http://rus.delfi.lv/";
    private String MAIN_PAGE_MOBILE="http://m.delfi.lv/";
    @Test
    public void articleMatchTest() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(MAIN_PAGE);

        WebElement firstTitle = driver.findElement(By.xpath("*//div[@class='top2012-big'][1]//a[@class='top2012-title']"));
        String firstTitleString = firstTitle.getText();
        WebElement firstArticleCommentCount = driver.findElement(By.xpath("*//div[@class='top2012-big'][1]//a[@class='comment-count']"));
        String firstArticleCommentCountStr = firstArticleCommentCount.getText();
        firstArticleCommentCountStr = firstArticleCommentCountStr.substring(1, firstArticleCommentCountStr.length()-1 );
        Integer firstArticleCommentCountInt = Integer.parseInt(firstArticleCommentCountStr);

        System.out.println("First article title: " + firstTitleString);
        System.out.println("First article comment count: " + firstArticleCommentCountInt);


        WebElement secondTitle = driver.findElement(By.xpath("*//div[@class='top2012-big'][2]//a[@class='top2012-title']"));
        String secondTitleString = secondTitle.getText();
        WebElement secondArticleCommentCount = driver.findElement(By.xpath("*//div[@class='top2012-big'][2]//a[@class='comment-count']"));
        String secondArticleCommentCountStr =  secondArticleCommentCount.getText();
        secondArticleCommentCountStr = secondArticleCommentCountStr.substring(1, secondArticleCommentCountStr.length()-1);
        Integer secondArticleCommentCountInt = Integer.parseInt(secondArticleCommentCountStr);

        System.out.println("Second article title: " + secondTitleString);
        System.out.println("Second article comment count: " + secondArticleCommentCountInt);


        WebElement thirdTitle = driver.findElement(By.xpath("*//div[@class='top2012-small'][1]//a[@class='top2012-title']"));
        String thirdTitleString = thirdTitle.getText();
        WebElement thirdArticleCommentCount = driver.findElement(By.xpath("*//div[@class='top2012-small'][1]//a[@class='comment-count']"));
        String thirdArticleCommentCountStr = thirdArticleCommentCount.getText();
        thirdArticleCommentCountStr = thirdArticleCommentCountStr.substring(1, thirdArticleCommentCountStr.length()-1);
        Integer thirdArticleCommentCountInt = Integer.parseInt(thirdArticleCommentCountStr);

        System.out.println("Third article title: " + thirdTitleString);
        System.out.println("Third article comment count: " + thirdArticleCommentCountInt);


        WebElement forthTitle = driver.findElement(By.xpath("*//div[@class='top2012-small'][2]//a[@class='top2012-title']"));
        String forthTitleString = forthTitle.getText();
        WebElement forthArticleCommentCount = driver.findElement(By.xpath("*//div[@class='top2012-small'][2]//a[@class='comment-count']"));
        String forthArticleCommentCountStr = forthArticleCommentCount.getText();
        forthArticleCommentCountStr = forthArticleCommentCountStr.substring(1,forthArticleCommentCountStr.length()-1);
        Integer forthArticleCommentCountInt = Integer.parseInt(forthArticleCommentCountStr);

        System.out.println("Forth article title: " + forthTitleString);
        System.out.println("Forth article comment count: " + forthArticleCommentCountInt);


        WebElement fifthTitle = driver.findElement(By.xpath("*//div[@class='top2012-small'][3]//a[@class='top2012-title']"));
        String fifthTitleString = fifthTitle.getText();
        WebElement fifthArticleCommentCount = driver.findElement(By.xpath("*//div[@class='top2012-small'][3]//a[@class='comment-count']"));
        String fifthArticleCommentCountStr = fifthArticleCommentCount.getText();
        fifthArticleCommentCountStr = fifthArticleCommentCountStr.substring(1,fifthArticleCommentCountStr.length()-1);
        Integer fifthArticleCommentCountInt = Integer.parseInt(fifthArticleCommentCountStr);

        System.out.println("Fifth article title: " + fifthTitleString);
        System.out.println("Fifth article comment count: " + fifthArticleCommentCountInt);


//        driver.get(MAIN_PAGE_MOBILE);
//
//        WebElement firstTitleMobile = driver.findElement(By.xpath("*//div[@class='md-mosaic-big']//a[@class='md-scrollpos']"));
//        String firstTitleMobileString = firstTitleMobile.getText();
//
//
//        System.out.println(firstTitleMobileString);
//        System.out.println(firstArticleCommentCountInt);
//
//        WebElement secondTitleMobile = driver.findElement(By.xpath("*//div[@class='md-mosaic-small']//a[@class='md-scrollpos']"));
//        String secondTitleMobileString = secondTitleMobile.getText();
//        System.out.println(secondTitleMobileString);

        driver.quit();

    }
}
