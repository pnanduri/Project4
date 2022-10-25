import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PropertyTestStudent {
    Property p1;

    @BeforeEach
    void setUp() throws Exception {
        p1 = new Property("Manor", "Gaithersburg", 500.00, "blablabla", 2, 2, 10, 10);
    }

    @AfterEach
    void tearDown() throws Exception {
        p1 = null;
    }

    @Test
    void testGetPropertyName() {
        assertEquals("Manor", p1.getPropertyName());
    }

    @Test
    void testGetRentAmount() {
        assertEquals(500.00, p1.getRentAmount());
    }

    @Test
    void testGetPlot() {
    	assertEquals(10, p1.getPlot().getDepth());
    	assertEquals(2, p1.getPlot().getX());
        assertEquals(2, p1.getPlot().getY());
        assertEquals(10, p1.getPlot().getWidth());
    }

    @Test
    void testToString() {
        assertEquals("Manor,Gaithersburg,blablabla,500.0", p1.toString());
    }

}