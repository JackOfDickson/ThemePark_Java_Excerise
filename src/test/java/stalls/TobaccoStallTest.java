package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 45);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void acceptCustomerOver18() {
        Visitor visitor = new Visitor(20, 170.00, 1000);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void rejectCustomerUnder18() {
        Visitor visitor = new Visitor(10, 100.00, 100);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }

}
