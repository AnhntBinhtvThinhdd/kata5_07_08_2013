package atdd;

import com.objogate.wl.Prober;
import com.objogate.wl.swing.ComponentSelector;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;

import javax.swing.*;

/**
 * User: anhnt
 * Date: 8/7/13
 * Time: 8:45 AM
 */
public class ApplicationRunner extends JFrameDriver
{


    public ApplicationRunner(GesturePerformer gesturePerformer, ComponentSelector<JFrame> componentSelector, Prober prober)
    {
        super(gesturePerformer, componentSelector, prober);
    }

    public void chooseSymbol()
    {

    }

    public void startGame()
    {

    }

    public void endGame()
    {

    }
}
