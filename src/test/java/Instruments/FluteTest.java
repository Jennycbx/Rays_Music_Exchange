package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute(18, 14, "Metal");
    }


    @Test
    public void canGetSellPrice() {
        assertEquals(18, flute.getSellPrice());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(14, flute.getBuyPrice());
    }

    @Test
    public void canGetType() {
        assertEquals("Woodwind", flute.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Metal", flute.getMaterial());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(16, flute.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Whistle", flute.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(4, flute.calculateMarkup());
    }
}