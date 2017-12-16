package items;


public abstract class Item {

    protected ItemType itemType;
    protected String brand;
    protected Double buyingPrice;
    protected Double sellingPrice;


    public Item (ItemType itemType, String brand, Double buyingPrice, Double sellingPrice){
        this.itemType = itemType;
        this.brand = brand;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public String getItemTypeName() {
        return itemType.getName ();
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemType.setName (itemTypeName);
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

    public double getMarkUp(){
        return sellingPrice -= buyingPrice;
    }

}
