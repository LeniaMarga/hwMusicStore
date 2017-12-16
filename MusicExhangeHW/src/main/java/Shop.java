import Instruments.*;
import items.*;
import items.ISell;

import java.util.ArrayList;

public class Shop {

    protected String name;
    protected ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        stock = new ArrayList<> ( );
    }

    public void addToStock(ISell isell) {
        stock.add (isell);
    }

    public String returnFirstPurchase() {
        return stock.get (0).prettyPrint ( );
    }

    public String returnLastPurchase() {
        return stock.get (stockSize ( ) - 1).prettyPrint ( );
    }

    public int stockSize() {
        return stock.size ();
    }

    public Double totalProfit() {
        Double sum = 0.00;
        for (ISell isell : stock) {
            sum += isell.calculateMarkup ( );
        }
        return sum;
    }
}
