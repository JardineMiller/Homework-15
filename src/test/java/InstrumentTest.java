import Instruments.Guitar;
import Instruments.InstrumentType;
import Instruments.Piano;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    
    @Before
    public void before() {
        guitar = new Guitar("Guitar","Brown", "Oak", InstrumentType.GUITAR, 90.00, 199.99, 6);
        piano = new Piano("Piano", "Black", "Ivory", InstrumentType.KEYBOARD, 350.00, 1499.99, "Upright");
        trumpet = new Trumpet("Trumpet","Gold", "Brass", InstrumentType.BRASS, 50.00, 149.99, 3);
    }
    
    @Test
    public void instrumentHasColour() {
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Ivory", piano.getMaterial());
    }

    @Test
    public void hasType() {
        assertEquals("Brass", trumpet.getType().getPrettyType());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(50.00, trumpet.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(149.99, trumpet.getSellPrice(), 0.01);
    }

    @Test
    public void guitarHasNumberOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void pianoHasPianoType() {
        assertEquals("Upright", piano.getPianoType());
    }

    @Test
    public void trumpetHasNumOfValves() {
        assertEquals(3, trumpet.getNumOfValves());
    }

    @Test
    public void pianoCanPlay() {
        assertEquals("playing 'Two Shoes' on the piano", piano.play("Two Shoes"));
    }

    @Test
    public void guitarCanPlay() {
        assertEquals("strumming away to 'Two Shoes' on the guitar!", guitar.play("Two Shoes"));
    }

    @Test
    public void trumpetCanPlay() {
        assertEquals("jazzing along to 'Two Shoes' to the trumpet", trumpet.play("Two Shoes"));
    }

    @Test
    public void instrumentHasDescription() {
        assertEquals("Brown Oak Guitar", guitar.getDescription());
    }





}
