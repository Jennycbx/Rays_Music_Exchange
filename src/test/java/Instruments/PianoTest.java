package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(15, 10, "Wood");
    }


    @Test
    public void canGetSellPrice() {
        assertEquals(15, piano.getSellPrice());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(10, piano.getBuyPrice());
    }

    @Test
    public void canGetType() {
        assertEquals("String", piano.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Tinkle", piano.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5, piano.calculateMarkup());
    }
}