package Instruments;

public class Piano extends Instrument {

    public int sellPrice;
    public int buyPrice;
    public String material;
    public String type;
    public int numberOfKeys;

    public Piano(int sellPrice, int buyPrice, String material, int numberOfKeys) {
        super(sellPrice, buyPrice, material);
        this.type = "String";
        this.numberOfKeys = numberOfKeys;
    }
}
