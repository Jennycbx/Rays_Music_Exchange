package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(30, 27, "Wood");
    }


    @Test
    public void canGetSellPrice() {
        assertEquals(30, guitar.getSellPrice());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(27, guitar.getBuyPrice());
    }

    @Test
    public void canGetType() {
        assertEquals("String", guitar.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Strum", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3, guitar.calculateMarkup());
    }
}