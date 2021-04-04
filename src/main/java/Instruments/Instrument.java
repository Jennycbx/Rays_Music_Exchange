package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    public int sellPrice;
    public int buyPrice;
    public String material;



    public Instrument(int sellPrice, int buyPrice, String material) {
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.material = material;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public String getMaterial() {
        return material;
    }


    public String play() {
        return null;
    }

    public int calculateMarkup() {
        return sellPrice - buyPrice;
    }
}
