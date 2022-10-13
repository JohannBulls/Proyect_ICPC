

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ICPCTest.
 *
 * @author  (Johann Amaya - Miguel Tellez)
 * @version (Ciclo 3)
 */
public class ICPCTest
{
    /**
     * Default constructor for test class ICPCTest
     */
    public ICPCTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }
    
    public void testICPC(){
        asserEquals(true, ICPC.ICPC(new int[] {0},new int[] {0}));
    }
    
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
