import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import system.ControleurTableMarqueTest;
import businessModel.*;

@RunWith(Suite.class)
@SuiteClasses({ ScoreKeeperTest.class, ScoreTest.class, ControleurTableMarqueTest.class })
public class AllTests {

}
