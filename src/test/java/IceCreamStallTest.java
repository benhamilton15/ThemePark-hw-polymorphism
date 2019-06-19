import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Cold Snap", "Mr Freeze");
    }

    @Test
    public void hasName(){
        assertEquals("Cold Snap",iceCreamStall.getName()) ;
    }


    @Test
    public void hasOwnerName(){
        assertEquals("Mr Freeze" ,iceCreamStall.getOwnerName()) ;
    }

}
