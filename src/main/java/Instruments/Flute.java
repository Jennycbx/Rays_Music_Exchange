package Instruments;

public class Flute extends Instrument {

    public int sellPrice;
    public int buyPrice;
    public String material;
    public String type;
    public int numberOfKeys;

    public Flute(int sellPrice, int buyPrice, String material, int numberOfKeys) {
        super(sellPrice, buyPrice, material);
        this.type = "Woodwind";
        this.numberOfKeys = numberOfKeys;

    }
}
