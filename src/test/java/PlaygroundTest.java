import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
         playground = new Playground("The Playground");
    }

    @Test
    public void hasName(){
        assertEquals("The Playground", playground.getName());
    }
}
