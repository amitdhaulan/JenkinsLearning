package org.example;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {

    @Test
    public void launchBrowser() {
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize()
        driver.get("http://www.google.com");
        System.out.println("Amit testing for Jenkins");

    }
}
