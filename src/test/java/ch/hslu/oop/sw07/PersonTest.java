package ch.hslu.oop.sw07;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testForename() {
        assertEquals("Luca", new Person("Wandfluh", "Luca").getForename());
    }

    @Test
    public void testSurname() {
        assertEquals("Wandfluh", new Person("Wandfluh", "Luca").getSurname());
    }

    @Test
    public void testDefaultId() {
        assertEquals(1, new Person("Default", "ID").getId());
    }

    @Test
    public void testId() {
        assertEquals(2, new Person(2, "Test", "ID").getId());
    }

    @Test
    public void testEqualsTrue() {
        assertTrue(new Person("Wandfluh", "Luca").equals(new Person("Wandfluh", "Luca")));
    }

    @Test
    public void testEqualsFalse() {
        assertFalse(new Person(0,"Wandfluh", "Luca").equals(new Person(1,"Wandfluh", "Luca")));
    }

    @Test
    public void testHash() {
        assertEquals(new Person("Wandfluh", "Luca").hashCode(), new Person("Wandfluh", "Luca").hashCode());
    }

    @Test
    public void testCompareToTrue() {
        assertEquals(0, new Person(1, "Wandfluh", "Luca").compareTo(new Person(1, "Wandfluh", "Luca")));
    }

    @Test
    public void testCompareToHigher() {
        assertEquals(1, new Person(2, "Wandfluh", "Luca").compareTo(new Person(1, "Wandfluh", "Luca")));
    }

    @Test
    public void testCompareToLower() {
        assertEquals(-1, new Person(1, "Wandfluh", "Luca").compareTo(new Person(2, "Wandfluh", "Luca")));
    }
}