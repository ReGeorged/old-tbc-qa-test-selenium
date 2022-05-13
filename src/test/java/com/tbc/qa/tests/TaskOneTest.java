package com.tbc.qa.tests;

import com.tbc.qa.base.TestBase;
import com.tbc.qa.pages.TaskOne;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskOneTest extends TestBase {
    TaskOne taskOne;



    public TaskOneTest(){
        super();
    }

    @BeforeMethod
    void setUp(){
        initialization();
        taskOne = new TaskOne();



    }

    @Test(priority = 1)
    void checkIfHeaderIsCorrect(){
        Assert.assertTrue(taskOne.checkBookStoreHeader());

    }

    @Test
    void BookImageTest() throws Exception {
        Thread.sleep(20000);
        int bookCount = driver.findElements(taskOne.getBooksListSelector()).size()-2;
        for(int i = 1; i<=bookCount;i++) {
            try {
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[" + i + "]" +"/div/div[1]/img"));
            }catch (Exception e){
                throw new Exception("#"+i+" book image not found");
            }
        }

    }


    @Test
    void BookTitleTest() throws Exception{
        Thread.sleep(20000);
        int bookCount = driver.findElements(taskOne.getBooksListSelector()).size()-2;
        for(int i = 1; i<=bookCount;i++) {
            try {
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[" + i + "]" +"/div/div[2]/div/span/a"));
            }catch (Exception e){
                throw new Exception("#"+i+" book title not found");
            }
        }
    }

    @Test
    void BookAuthorTest() throws Exception{
        Thread.sleep(20000);
        int bookCount = driver.findElements(taskOne.getBooksListSelector()).size()-2;
        for(int i = 1; i<=bookCount;i++) {
            try {
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[" + i + "]" +"/div/div[3][normalize-space(text())]"));
            }catch (Exception e){
                throw new Exception("#"+i+" book author not found");
            }
        }
    }

    @Test
    void BookPublisherTest()throws Exception{
        int bookCount = driver.findElements(taskOne.getBooksListSelector()).size()-2;
        for(int i = 1; i<=bookCount;i++) {
            try {
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[" + i + "]" +"/div/div[4][normalize-space(text())]"));
            }catch (Exception e){
                throw new Exception("#"+i+" book publisher not found");
            }
        }

    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }

}
