package Items;

public class DrumSticks extends Items {

    public int sellPrice;
    public int buyPrice;
    public String type;


    public DrumSticks(int sellPrice, int buyPrice) {
        super(sellPrice, buyPrice);
        this.type = "Drumsticks";
    }

    public String getType() {
        return type;
    }
}
