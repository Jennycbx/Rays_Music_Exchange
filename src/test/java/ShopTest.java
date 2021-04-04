import Behaviours.ISell;
import Items.DrumSticks;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    private ISell DrumSticks;
    private ISell SheetMusic;

    @Before
    public void before() {
        shop = new Shop();
    }

//    @Test
//    public void canGetStock() {
//        assertEquals(null, shop.getStock());
//    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(DrumSticks);
        assertEquals(DrumSticks, shop.getStock());
    }

//    @Test
//    public void canRemoveItemFromStock() {
//    }
}