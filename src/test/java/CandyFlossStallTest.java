import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Yum Yum", "Billy");
    }

    @Test
    public void hasName(){
        assertEquals("Yum Yum" ,candyFlossStall.getName()) ;
    }


    @Test
    public void hasOwnerName(){
        assertEquals("Billy" ,candyFlossStall.getOwnerName()) ;
    }
}
