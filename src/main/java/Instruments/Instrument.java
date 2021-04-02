package Instruments;

public class Instrument {

    public int sellPrice;
    public int buyPrice;
    public String material;



    public Instrument(int sellPrice, int buyPrice, String material) {
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.material = material;
    }
}
