package Items;

import Behaviours.ISell;

public abstract class Items implements ISell {

    public int sellPrice;
    public int buyPrice;

    public Items(int sellPrice, int buyPrice) {
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
