package com.tbc.qa.pages;

import com.tbc.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class TaskOne extends TestBase {
    public TaskOne(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div")
    WebElement BookStoreHeader;

    public boolean checkBookStoreHeader(){
        return BookStoreHeader.isDisplayed();

    }

    public List ImagesList() {
     return driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]//img"));

    }


    public List AuthorsAndPublishersList(){
        return  driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[*]//div[normalize-space(text())]"));
    }
    public List TitlesList(){
        return  driver.findElements(By.cssSelector("span > a"));
    }
    /*
    public void waitForBookStore(){
        wait.until(ExpectedConditions.visibilityOf(BookStoreHeader));
    }
    */

    public List SpanList() {
        return driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[*]"));




    }

    By BooksListSelector = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[*]");
    public By getBooksListSelector(){
        return BooksListSelector;
    }





}
