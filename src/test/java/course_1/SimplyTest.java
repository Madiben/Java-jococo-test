
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;

public class SimplyTest {

    Simply simpleclass;

    @Before
    public void Setup()
    {
        simpleclass = new Simply( ); 
    }

    @Test
    public void multiplicationTest() {
        assertEquals(  "10 x 0 must be 0", 0, simpleclass.multiply(10, 0) );
        assertEquals(  "0 x 10 must be 0", 0, simpleclass.multiply(0, 10) );
        assertEquals( "0 x 0 must be 0", 0, simpleclass.multiply(0, 0) );
        assertEquals( "4 x 2 must be 8", 8, simpleclass.multiply(4, 2) );
        assertEquals( "40 x 2 must be 80", 80, simpleclass.multiply(40, 2) );

    }

}
