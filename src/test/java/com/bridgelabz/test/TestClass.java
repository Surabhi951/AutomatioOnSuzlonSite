package com.bridgelabz.test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import com.bridgelabz.baseclass.BaseClass;
import com.bridgelabz.pages.AutomatePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class TestClass extends BaseClass {

    AutomatePage page;

    ATUTestRecorder recorder;

    @BeforeMethod
    public void initialization() throws ATUTestRecorderException {
        recorder = new ATUTestRecorder("C:\\Users\\chetan bhagat\\IdeaProjects\\Automate_Suzlon_Site\\src\\main\\resources\\scriptVideo","TestVideo",false);
        recorder.start();
        setUp();
        page = new AutomatePage(driver);
    }

    @Test
    public void suzlonPageAutomation() throws InterruptedException, AWTException {
        page.automationOnSuzlonPage();
    }

    @AfterMethod
    public void tearDown() throws ATUTestRecorderException {
        closeBrowser();
        recorder.stop();
    }
}
