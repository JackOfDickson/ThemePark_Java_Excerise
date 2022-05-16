package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import people.VisitorTest;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void rejectIfUnderAge(){
        Visitor visitor = new Visitor(10, 150,20);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void rejectIfUnderHeight(){
        Visitor visitor = new Visitor(13, 130, 20);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void rejectIfUnderAgeAndUnderHeight(){
        Visitor visitor = new Visitor(7,90,20);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void AcceptIfOverAgeAndOverHeight(){
        Visitor visitor = new Visitor(20, 180,200);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void defaultPriceUnderHeight(){
        Visitor visitor = new Visitor(20, 195, 200);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.0);
    }

    @Test
    public void doublePriceOverHeight(){
        Visitor visitor = new Visitor(20, 205, 200);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);
    }
}
