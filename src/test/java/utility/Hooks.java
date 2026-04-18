package utility;

import org.junit.After;
import org.junit.Before;

public class Hooks {

    public static BrowserDriver driver;

    @Before
    public void setUp(){
        driver = new BrowserDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }
}