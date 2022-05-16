package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void defaultPriceOverAge(){
        Visitor visitor = new Visitor(20, 195, 200);
        assertEquals(4.50, dodgems.priceFor(visitor), 0.0);
    }

    @Test
    public void halfPriceUnderAge(){
        Visitor visitor = new Visitor(11, 95, 20);
        assertEquals(2.25, dodgems.priceFor(visitor), 0.0);
    }
}
