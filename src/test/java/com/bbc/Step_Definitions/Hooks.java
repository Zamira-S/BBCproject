package com.bbc.Step_Definitions;

import com.bbc.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before
    public void setUp() { System.out.println("\tthis is coming from BEFORE");
    }
      //  Driver.get().manage().window().maximize();
       // Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


   // }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        Driver.closeDriver();

    }

}