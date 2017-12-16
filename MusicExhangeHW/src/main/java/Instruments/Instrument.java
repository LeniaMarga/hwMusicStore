package Instruments;

public abstract class Instrument{

    protected String material;
    protected String colour;
    protected InstrumentType instrumentType;
    protected String brand;
    protected Double buyingPrice;
    protected Double sellingPrice;


    public Instrument (String material, String colour, InstrumentType instrumentType, String brand, Double buyingPrice, Double sellingPrice){
        this.material= material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.brand = brand;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getInstrumentTypeName(){
        return instrumentType.getName ();
    }

    public void setInstrumentTypeName(String name){
        instrumentType.setName(name);
    }

    public double getMarkUp(){
        return sellingPrice -= buyingPrice;
    }


}
