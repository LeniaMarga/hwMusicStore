package Instruments;

import items.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    protected int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType instrumentType, String brand, Double buyingPrice, Double sellingPrice, int numberOfStrings) {
        super (material, colour, instrumentType, brand, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
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
