package Instruments;

public class Piano extends Instrument implements IPlay{

    public Piano(String material, String colour, InstrumentType instrumentType, String brand, Double buyingPrice, Double sellingPrice) {
        super (material, colour, instrumentType, brand, buyingPrice, sellingPrice);
    }


    public String play(String sound) {
        return sound;
    }
}
