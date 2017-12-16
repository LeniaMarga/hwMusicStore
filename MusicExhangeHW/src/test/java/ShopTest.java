import Instruments.*;
import items.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Guitar guitar;
    Piano piano;
    Saxophone saxophone;
    Violin violin;
    GuitarStrings guitarStrings;
    Speaker speaker;
    MusicBook musicBook;
    Shop shop;

    @Before
    public void before(){
        guitar = new Guitar("wood", "black", InstrumentType.GUITAR, "Fender", 2500.00, 3500.00, 6);
        piano = new Piano ("wood", "white", InstrumentType.PIANO, "Yamaha", 4000.00, 5000.00);
        saxophone = new Saxophone ("metal", "yellow", InstrumentType.SAXOPHONE, "Roland", 2200.00, 3300.00, 8);
        violin = new Violin("wood", "brown", InstrumentType.VIOLIN, "Stentor", 1300.00, 2300.00, 6);
        speaker = new Speaker(ItemType.SPEAKER, "speakON ", 1500.00, 2000.00);
        musicBook = new MusicBook (ItemType.MUSICBOOK, "Yamaha", 30.00, 50.00);
        guitarStrings = new GuitarStrings (ItemType.GUITARSTRINGS, "Acoustic", 15.00, 30.00);
        shop = new Shop("Ray's Music Shop");
        shop.addToStock (guitar);
        shop.addToStock (saxophone);
        shop.addToStock (violin);
        shop.addToStock (speaker);
        shop.addToStock (musicBook);
        shop.addToStock (guitarStrings);
    }

    @Test
    public void hasStockSize(){
        assertEquals(6, shop.stockSize ());
    }

    @Test
    public void hasTotalProfit(){
        assertEquals (3635.00, shop.totalProfit () ,0.01);
    }

    @Test
    public void canReturnLastEntry(){
        assertEquals ( "Guitar Strings Acoustic 30.0£",shop.returnLastPurchase ());
    }

    @Test
    public void canReturnFirstEntry(){
        assertEquals ("Guitar Fender - wood black - 3500.0£", shop.returnFirstPurchase ());
    }




}
