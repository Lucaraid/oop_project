package ch.hslu.oop.sw09;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TemparaturTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testIllegalCelsiusInputFormat() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Celsius darf nicht kleiner als -273.15 sein.");
        Temparatur.createFromCelsius(-274f);
    }

    @Test
    public void testIllegalKelvinInputFormat() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Kelvin darf nicht kleiner als 0 sein.");
        Temparatur.createFromKelvin(-1f);
    }

    @Test
    public void testEqualsIdentity() {
        Temparatur temparatur = Temparatur.createFromCelsius(1f);
        assertTrue(temparatur.equals(temparatur));
    }

    @Test
    public void testEqualsSameValue() {
        assertTrue(Temparatur.createFromCelsius(1f).equals(Temparatur.createFromCelsius(1f)));
    }

    @Test
    public void testNotEquals() {
        assertFalse(Temparatur.createFromCelsius(1f).equals(Temparatur.createFromCelsius(2f)));
    }

    @Test
    public void testHashCode() {
        assertEquals(Temparatur.createFromCelsius(1f).hashCode(), Temparatur.createFromCelsius(1f).hashCode());
    }

    @Test
    public void testHashCodeFalse() {
        assertNotEquals(Temparatur.createFromCelsius(1f).hashCode(), Temparatur.createFromCelsius(2f).hashCode());
    }

    @Test
    public void testCompareToSame() {
        assertEquals(0, Temparatur.createFromCelsius(20f).compareTo(Temparatur.createFromCelsius(20f)));
    }

    @Test
    public void testCompareToHigher() {
        assertEquals(1, Temparatur.createFromCelsius(40f).compareTo(Temparatur.createFromCelsius(20f)));
    }

    @Test
    public void testCompareToLower() {
        assertEquals(-1, Temparatur.createFromCelsius(20f).compareTo(Temparatur.createFromCelsius(40f)));
    }

    @Test
    public void testGetKelvin() {
        assertEquals(293.15f, Temparatur.createFromCelsius(20f).getKelvin(), 0.001f);
    }

    @Test
    public void testGetCelsius() {
        assertEquals(20f, Temparatur.createFromCelsius(20f).getCelsius(), 0.001f);
    }

    @Test
    public void testMinTemparature() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Celsius darf nicht kleiner als -273.15 sein.");
        Temparatur.createFromCelsius(-Float.MAX_VALUE);
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