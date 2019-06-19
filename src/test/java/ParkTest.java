import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Friend Park");

    }

    @Test
    public void hasName(){
        assertEquals("Friend Park", park.getName());
    }
}
