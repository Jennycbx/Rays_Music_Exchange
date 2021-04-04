package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CymbalsTest {

    Cymbals cymbals;

    @Before
    public void before() {
        cymbals = new Cymbals(13, 8, "Metal");
    }


    @Test
    public void canGetSellPrice() {
        assertEquals(13, cymbals.getSellPrice());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(8, cymbals.getBuyPrice());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Metal", cymbals.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Percussion", cymbals.getType());
    }

    @Test
    public void canGetDiameter() {
        assertEquals(15, cymbals.getDiameter(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("Clash", cymbals.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5, cymbals.calculateMarkup());
    }
}