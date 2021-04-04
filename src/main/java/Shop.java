import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    public ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<>();
    }

    public int getAmountOfStock() {
        return stock.size();
    }

    public void addItemToStock(ISell element) {
        stock.add(element);
    }

    public void removeItemFromStock(ISell element) {
        stock.remove(element);
    }
}
