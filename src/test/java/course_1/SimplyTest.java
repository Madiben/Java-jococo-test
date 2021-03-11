
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
    public void maxTest() {
        assertEquals( "10 is bigger 0", 10, simpleclass.MaxTwoNumber(10, 0) );
        assertEquals( "15 is bigger 2", 15, simpleclass.MaxTwoNumber(15, 2) );
        assertEquals( "952 is bigger 18", 952, simpleclass.MaxTwoNumber(18, 952) );
        assertEquals( "4 is bigger 1", 4, simpleclass.MaxTwoNumber(1, 4) );

    }

}
