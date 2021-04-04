import Behaviours.ISell;
import Items.DrumSticks;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    ISell DrumSticks;
    ISell SheetMusic;

    @Before
    public void before() {
        shop = new Shop();
    }

    @Test
    public void canGetAmountOfStock() {
        assertEquals(0, shop.getAmountOfStock());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(DrumSticks);
        assertEquals(1, shop.getAmountOfStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(DrumSticks);
        shop.removeItemFromStock(DrumSticks);
        assertEquals(0, shop.getAmountOfStock());
    }
}