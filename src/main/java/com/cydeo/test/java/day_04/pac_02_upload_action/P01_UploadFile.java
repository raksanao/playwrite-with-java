package com.cydeo.test.java.day_04.pac_02_upload_action;

import com.cydeo.test.java.utils.BrowserUtils;
import com.cydeo.test.java.utils.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class P01_UploadFile {
    @Test
    void setUp(){

        Driver.getPage().navigate("https://practice.cydeo.com/upload");
       String pathFile= System.getProperty("user.dir") + "/src/main/java/com/cydeo/test/resources/upload.txt";
BrowserUtils.sleepWithThread(4);
        Driver.getPage().getByTestId("file-upload").setInputFiles(Paths.get(pathFile));
      Driver.getPage().getByTestId("file-submit").click();
      String fileUpload="File Uploaded!";
     String up= Driver.getPage().locator("//h3").textContent();
        Assertions.assertEquals(fileUpload,up);
        BrowserUtils.sleepWithThread(5);
        Driver.closeDriver();
    }
}
