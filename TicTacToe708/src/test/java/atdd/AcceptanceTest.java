package atdd;

import org.junit.Before;
import org.junit.Test;

/**
 * User: anhnt
 * Date: 8/7/13
 * Time: 8:40 AM
 */
public class AcceptanceTest
{
    ApplicationRunner applicationRunner;
    @Before
    public void setUp()
    {
        applicationRunner = new ApplicationRunner();
    }

    @Test
    public void testStartThenEndGame()
    {
        applicationRunner.chooseSymbol();
        applicationRunner.startGame();
        applicationRunner.endGame();
    }
}
