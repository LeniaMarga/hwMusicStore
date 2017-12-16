import items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemsTest {


    GuitarStrings guitarStrings;
    Speaker speaker;
    MusicBook musicBook;

    @Before
    public void before(){
        speaker = new Speaker(ItemType.SPEAKER, "speakON ", 1500.00, 2000.00);
        musicBook = new MusicBook (ItemType.MUSICBOOK, "Yamaha", 30.00, 50.00);
        guitarStrings = new GuitarStrings (ItemType.GUITARSTRINGS, "Acoustic", 15.00, 30.00);
    }

    @Test
    public void canGetItemTypeName(){
        assertEquals("Speaker", speaker.getItemTypeName ());
        assertEquals("Music Book", musicBook.getItemTypeName ());
        assertEquals("Guitar Strings", guitarStrings.getItemTypeName ());

    }

    @Test
    public void canSetItemType(){
        speaker.setItemTypeName ("SpeakOn Speaker");
        assertEquals ("SpeakOn Speaker", speaker.getItemTypeName ());
        speaker.setItemType (ItemType.EQUIPEMENT);
        assertEquals (ItemType.EQUIPEMENT, speaker.getItemType());
    }


    @Test
    public void canCalculateMarkUp(){
        assertEquals(500.00, speaker.calculateMarkup (), 0.01);
        assertEquals (20.0, musicBook.calculateMarkup (), 0.01);
        assertEquals (15.0, guitarStrings.calculateMarkup (), 0.01);
    }

}
