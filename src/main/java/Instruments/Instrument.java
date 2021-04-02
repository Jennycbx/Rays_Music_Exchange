package Instruments;

public class Instrument {

    public int sellPrice;
    public int buyPrice;
    public String material;
    public String colour;
    public String type;

    public Instrument(int sellPrice, int buyPrice, String material, String colour, String type) {
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.material = material;
        this.colour = colour;
        this.type = type;
    }
}
