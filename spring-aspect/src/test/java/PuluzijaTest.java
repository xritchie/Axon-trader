import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by shawnritchie on 15/04/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MontiConfig.class)
public class PuluzijaTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private Shout talMonti;

    @Test
    public void monti()
    {
        String ghajjat = talMonti.shouting();
        Assert.notNull(ghajjat);

        assertEquals(
                "Mejjet biex jghajjat da liba!!!!\n" +
                "AHHHHHHHHH TAL MONTI!!!!!!\n" +
                "Smajtu X'Qal AHHHHHHHHH TAL MONTI!!!!!!\n" +
                "Ghalih boys ttuhh!!!!!\n",
                log.getLog());
    }

}
