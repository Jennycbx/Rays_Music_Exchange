package Items;

public class SheetMusic extends Items {

    public int sellPrice;
    public int buyPrice;
    public String type;


    public SheetMusic(int sellPrice, int buyPrice, String type) {
        super(sellPrice, buyPrice);
        this.type = "Sheet Music";
    }

    public String getType() {
        return type;
    }
}
