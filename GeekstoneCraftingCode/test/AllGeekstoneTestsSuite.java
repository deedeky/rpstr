import mockitotest.HelloGeekstoneTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({ GeekstoneTest.class, GeekstoneSecondTest.class, HelloGeekstoneTest.class})
public class AllGeekstoneTestsSuite {

}
