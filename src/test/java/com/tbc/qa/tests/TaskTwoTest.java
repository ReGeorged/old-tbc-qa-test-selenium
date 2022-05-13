package com.tbc.qa.tests;

import com.tbc.qa.base.TestBase;
import com.tbc.qa.pages.TaskTwo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskTwoTest extends TestBase {
    TaskTwo taskTwo;
    public TaskTwoTest(){
        super();
    }
    @BeforeMethod
    void setUp(){
        initialization();
        taskTwo = new TaskTwo();
    }

    @Test
    void firstTest(){

    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
