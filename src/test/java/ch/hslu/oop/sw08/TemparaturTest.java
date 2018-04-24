package ch.hslu.oop.sw08;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemparaturTest {

    @Test
    public void testEqualsIdentity() {
        Temparatur temparatur = new Temparatur(20f);
        assertTrue(temparatur.equals(temparatur));
    }

    @Test
    public void testEqualsSameValue() {
        assertTrue(new Temparatur(1f).equals(new Temparatur(1f)));
    }

    @Test
    public void testNotEquals() {
        assertFalse(new Temparatur(1f).equals(new Temparatur(2f)));
    }

    @Test
    public void testHashCode() {
        assertEquals(new Temparatur(1f).hashCode(), new Temparatur(1f).hashCode());
    }

    @Test
    public void testHashCodeFalse() {
        assertNotEquals(new Temparatur(1f).hashCode(), new Temparatur(2f).hashCode());
    }
    
    @Test
    public void testCompareToSame() {
        assertEquals(0, new Temparatur(20f).compareTo(new Temparatur(20f)));
    }

    @Test
    public void testCompareToHigher() {
        assertEquals(1, new Temparatur(40f).compareTo(new Temparatur(20f)));
    }

    @Test
    public void testCompareToLower() {
        assertEquals(-1, new Temparatur(20f).compareTo(new Temparatur(40f)));
    }

    @Test
    public void testGetKelvin() {
        assertEquals(293.15f, new Temparatur(20f).getKelvin(), 0.001f);
    }

    @Test
    public void testSetKelvin() {
        Temparatur temparatur =  new Temparatur(0f);
        temparatur.setKelvin(200f);
        assertEquals(200f, temparatur.getKelvin(), 0.001f);
    }

    @Test
    public void testGetCelsius() {
        assertEquals(20f, new Temparatur(20f).getCelsius(), 0.001f);
    }

    @Test
    public void testSetCelsius() {
        Temparatur temparatur =  new Temparatur(0f);
        temparatur.setCelsius(20f);
        assertEquals(20f, temparatur.getCelsius(), 0.001f);
    }

    @Test
    public void testMinTemparature() {
        assertEquals(-Float.MAX_VALUE, new Temparatur(-Float.MAX_VALUE).getCelsius(), 0.001f);
    }

    @Test
    public void testConvertKelvinToCelsius() {
        assertEquals(180f - 273.15f, Temparatur.convertKelvinToCelsius(180f), 0);
    }

    @Test
    public void testConvertCelsiusToKelvin() {
        assertEquals(10f + 273.15f, Temparatur.convertCelsiusToKelvin(10f), 0);
    }
}