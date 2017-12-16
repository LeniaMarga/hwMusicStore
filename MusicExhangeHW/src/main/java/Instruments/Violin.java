package Instruments;

import items.ISell;

public class Violin extends Instrument implements ISell, IPlay{

    protected int numberOfStrings;

    public Violin(String material, String colour, InstrumentType instrumentType, String brand, Double buyingPrice, Double sellingPrice, int numberOfStrings) {
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
