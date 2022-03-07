package runTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Test.LoginWeb;
import Test.RegisterWeb;
import core.DriverFactory;

import org.junit.AfterClass;


@RunWith(Suite.class)
@SuiteClasses({
    LoginWeb.class,
    RegisterWeb.class
})

public class RunTest {
	 
	
	@AfterClass
	    public static void testEnd(){
	        DriverFactory.killDriver();
	    }
}
