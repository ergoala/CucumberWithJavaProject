package utility;

import org.junit.After;
import org.junit.Before;

public class Hooks {

    public static BrowserDriver driver;

    /** Opens a new browser session before each scenario. */
    @Before
    public void setUp(){
        driver = new BrowserDriver();
    }

    /** Closes the browser session after each scenario. */
    @After
    public void tearDown(){
        driver.close();
    }
}