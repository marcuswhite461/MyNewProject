
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

/**
 * The test class BankAccountTest1.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BankAccountTest1
{
    // Private member
    private BankAccount c;

    @Test
    public void testConstructor(){
        c = new BankAccount("Jon Resendiz", 550);
        Assert.assertEquals("BankAccount() did not name correctly",
            "Jon Resendiz", c.getName());
        Assert.assertEquals("BankAccount() did not set checking balance correctly",
            550.0, c.getChecking(),0.0f);
        Assert.assertEquals("BankAccount() did not set savings balance correctly",
            1000.0, c.getSavings(),0.0f);

    }

}
