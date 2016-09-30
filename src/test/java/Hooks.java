import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.BaseMain;

import java.io.IOException;

/**
 * Created by girija on 29/09/2016.
 */
public class Hooks {

        BaseMain main=new BaseMain();
        @Before
        public void beforeOpenBrowser() throws IOException {
            main.openBrowser();
        }
        @After
        public void afterCloseBrowser()
        {
            main.closeBrowser();
        }
    }


