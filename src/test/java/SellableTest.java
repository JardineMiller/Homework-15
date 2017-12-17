import Instruments.Guitar;
import Instruments.InstrumentType;
import Instruments.Piano;
import Instruments.Trumpet;
import ShopStuff.GuitarStrings;
import ShopStuff.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellableTest {

    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    SheetMusic sheetMusic;
    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitar = new Guitar("Guitar","Brown", "Oak", InstrumentType.GUITAR, 90.00, 199.99, 6);
        piano = new Piano("Piano", "Black", "Ivory", InstrumentType.KEYBOARD, 350.00, 1499.99, "Upright");
        trumpet = new Trumpet("Trumpet","Gold", "Brass", InstrumentType.BRASS, 50.00, 149.99, 3);
        sheetMusic = new SheetMusic(2.99, 9.99, "Sheet Music");
        guitarStrings = new GuitarStrings(0.99, 3.99, "Guitar Strings");
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(109.99, guitar.calculateMarkup(), 0.01);
    }
}
