import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Bob", 23, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", visitor.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(23, visitor.getAge());
    }

    @Test
    public void hasMoney(){
        assertEquals(100, visitor.getMoney());

    }



}
