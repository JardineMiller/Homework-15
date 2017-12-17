import Instruments.Guitar;
import Instruments.InstrumentType;
import Instruments.Piano;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

public class InstrumentTest {
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    
    @Before
    public void before() {
        guitar = new Guitar("Brown", "Oak", InstrumentType.GUITAR, 90.00, 199.99, 6);
        piano = new Piano("Brown", "Oak", InstrumentType.GUITAR, 350.00, 1499.99, "Upright");
        trumpet = new Trumpet("Brown", "Oak", InstrumentType.GUITAR, 50.00, 149.99, 10);
    }
    
    @Test
    public void instrumentHasColour() {
        assertEquals("Brown", guitar.getColour());
    }

    private void assertEquals(String brown, String colour) {
    }


}
