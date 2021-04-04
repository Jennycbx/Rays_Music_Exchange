package Instruments;

public class Cymbals extends Instrument {

    public int sellPrice;
    public int buyPrice;
    public String material;
    public String type;
    public double diameter;

    public Cymbals(int sellPrice, int buyPrice, String material) {
        super(sellPrice, buyPrice, material);
        this.type = "Percussion";
        this.diameter = 15.00;
    }

    public String getType() {
        return type;
    }

    public double getDiameter() {
        return diameter;
    }

    public String play() {
        return "Clash";
    }
}
