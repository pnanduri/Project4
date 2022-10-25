import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestStudent {
    Property sampleName, samplename;
    ManagementCompany mangement;

    @Before
    public void setUp() throws Exception {
        mangement = new ManagementCompany("Llama", "88", 6);
    }

    @After
    public void tearDown() throws Exception {
        mangement = null;
    }

    @Test
    public void testAddProperty() {
        sampleName = new Property("blablabla", "Ronaldo", 2500, "Messi", 2, 2, 1, 1);
        samplename = new Property("College", "Kuijt", 1500, "Praharsh", 2, 2, 1, 1);
       
        assertEquals(mangement.addProperty(sampleName), 0);
        assertEquals(mangement.addProperty(samplename), 1);
    }

    @Test
    public void testGetPropertiesCount() {
    	 sampleName = new Property("blablabla", "Ronaldo", 2500, "Messi", 2, 2, 1, 1);
         samplename = new Property("College", "Kuijt", 1500, "Praharsh", 2, 2, 1, 1);
        
         assertEquals(mangement.addProperty(sampleName), 0);
        assertEquals(mangement.addProperty(samplename), 1);
        assertEquals(mangement.getPropertiesCount(), 2);
    }

} 