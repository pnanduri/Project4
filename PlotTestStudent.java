import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlotTestStudent {
    private Plot plot, plot1, plot2, plot3, plot4;

    @Before
    public void setUp() throws Exception {
        
    	plot = new Plot(10, 10, 2, 2);
        plot1 = new Plot(2,2 , 2,2 );
        
        plot2 = new Plot(8, 10, 2, 2);
        plot3 = new Plot(2, 2, 14, 14);
    
        plot4 = new Plot(6, 6, 2, 2);

    }

    @After
    public void tearDown() throws Exception {
        plot = plot1 = plot2 = null;
    }

    @Test
    public void testOverlaps1() {
        assertTrue(plot2.overlaps(plot));
    }

    @Test
    public void testOverlaps() {
        assertTrue(!plot.overlaps(plot1));
    }

    @Test
    public void testEncompasses() {
        assertTrue(plot3.encompasses(plot4));
    }

    @Test
    public void testToString() {
        assertEquals("1,1,1,1", plot1.toString());
    }

}