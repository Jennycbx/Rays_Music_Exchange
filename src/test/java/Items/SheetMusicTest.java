package Items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(5, 4);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(5, sheetMusic.getSellPrice());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(4, sheetMusic.getBuyPrice());
    }

    @Test
    public void canGetType() {
        assertEquals("Sheet Music", sheetMusic.getType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1, sheetMusic.calculateMarkup());
    }


}