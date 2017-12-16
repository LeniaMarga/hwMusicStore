import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {

    Guitar guitar;
    Piano piano;
    Saxophone saxophone;
    Violin violin;

    @Before
    public void before(){
        guitar = new Guitar("wood", "black", InstrumentType.GUITAR, "Fender", 2500.00, 3500.00, 6);
        piano = new Piano ("wood", "white", InstrumentType.PIANO, "Yamaha", 4000.00, 5000.00);
        saxophone = new Saxophone ("metal", "yellow", InstrumentType.SAXOPHONE, "Roland", 2200.00, 3300.00, 8);
        violin = new Violin("wood", "brown", InstrumentType.VIOLIN, "Stentor", 1300.00, 2300.00, 6);
    }


    @Test
    public void canGetInstrumentTypeName(){
        assertEquals("Violin", violin.getInstrumentTypeName ());
        assertEquals("Piano", piano.getInstrumentTypeName ());
        assertEquals("Saxophone", saxophone.getInstrumentTypeName ());
        assertEquals("Guitar", guitar.getInstrumentTypeName ());
    }



    @Test
    public void canPlay(){
        assertEquals("mozart", violin.play ("mozart"));
        assertEquals("bach", piano.play ("bach"));
        assertEquals("jazz", saxophone.play ("jazz"));
        assertEquals("rock n' roll", guitar.play ("rock n' roll"));
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(1000.00, violin.calculateMarkup (), 0.01);
        assertEquals(1100.00, saxophone.calculateMarkup (), 0.01);
        assertEquals(1000.00, guitar.calculateMarkup (), 0.01);
    }


    @Test
    public void canSetInstrumentType(){
        violin.setInstrumentTypeName("Yamaha");
        assertEquals ("Yamaha", violin.getInstrumentTypeName ());
        piano.setInstrumentType (InstrumentType.KEYBOARD);
        assertEquals (InstrumentType.KEYBOARD, piano.getInstrumentType ());
    }

}
