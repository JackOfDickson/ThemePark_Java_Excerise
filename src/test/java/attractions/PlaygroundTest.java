package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void rejectCustomerOver15(){
        Visitor visitor = new Visitor(20,170.00, 1000);
        assertEquals(false, playground.isAllowedTo(visitor));
    }

    @Test
    public void acceptCustomerUnder15(){
        Visitor visitor = new Visitor(10,100.00, 100);
        assertEquals(true, playground.isAllowedTo(visitor));
    }

}
