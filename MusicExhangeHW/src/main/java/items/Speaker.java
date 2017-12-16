package items;

public class Speaker extends Item implements items.ISell {

    public Speaker(ItemType itemType, String brand, Double buyingPrice, Double sellingPrice) {
        super (itemType, brand, buyingPrice, sellingPrice);
    }


    public Double calculateMarkup() {
        return getMarkUp();
    }

    public String prettyPrint() {
        return getItemTypeName ()+" "+ brand + " "+ sellingPrice+ "£";
    }
}
