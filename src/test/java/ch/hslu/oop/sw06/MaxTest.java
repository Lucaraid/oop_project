package ch.hslu.oop.sw06;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void testMax() {
        assertEquals(1, new Max().max(1,0));
    }

    @Test
    public void testFirst() {
        assertEquals(2, new Max().max(2,0));
    }

    @Test
    public void testSecond() {
        assertEquals(3, new Max().max(0,3));
    }

    @Test
    public void testSame() {
        assertEquals(4, new Max().max(4,4));
    }

    @Test
    public void testMaxInteger(){
        assertEquals(Integer.MAX_VALUE, new Max().max(Integer.MAX_VALUE,0));
    }
}