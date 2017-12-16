package Instruments;

import items.ISell;

public class Saxophone extends Instrument implements IPlay, ISell {

    protected int numberOfValvues;

    public Saxophone(String material, String colour, InstrumentType instrumentType, String brand, Double buyingPrice, Double sellingPrice, int numberOfValvues) {
        super (material, colour, instrumentType, brand, buyingPrice, sellingPrice);
        this.numberOfValvues = numberOfValvues;
    }


    public String play(String sound) {
        return sound;
    }


    public Double calculateMarkup() {
        return getMarkUp ();
    }

    public String prettyPrint() {
        return getInstrumentTypeName () +" "+ brand +" - "+ material +" "+ colour+ " - "+ sellingPrice+ "£";

    }

}
