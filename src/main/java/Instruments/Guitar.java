package Instruments;

public class Guitar extends Instrument {

    public int sellPrice;
    public int buyPrice;
    public String material;
    public String type;
    public int numberOfStrings;

    public Guitar(int sellPrice, int buyPrice, String material, int numberOfStrings) {
        super(sellPrice, buyPrice, material);
        this.type = "String";
        this.numberOfStrings = numberOfStrings;
    }
}
