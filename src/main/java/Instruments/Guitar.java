package Instruments;

public class Guitar extends Instrument {

    public int sellPrice;
    public int buyPrice;
    public String material;
    public String type;
    public int numberOfStrings;

    public Guitar(int sellPrice, int buyPrice, String material) {
        super(sellPrice, buyPrice, material);
        this.type = "String";
        this.numberOfStrings = 6;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Strum";
    }
}
