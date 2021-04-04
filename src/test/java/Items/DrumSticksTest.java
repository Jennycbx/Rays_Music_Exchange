package Items;

import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks(8, 6);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(8, drumSticks.getSellPrice());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(6, drumSticks.getBuyPrice());
    }

    @Test
    public void canGetType() {
        assertEquals("Drumsticks", drumSticks.getType());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2, drumSticks.calculateMarkup());
    }

}