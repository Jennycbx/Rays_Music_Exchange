package Instruments;

public class Cymbals extends Instrument {

    public int sellPrice;
    public int buyPrice;
    public String material;
    public String type;
    public double diameter;

    public Cymbals(int sellPrice, int buyPrice, String material, double diameter) {
        super(sellPrice, buyPrice, material);
        this.type = "Percussion";
        this.diameter = diameter;
    }
}
