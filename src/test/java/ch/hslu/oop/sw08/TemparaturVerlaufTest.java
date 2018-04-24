package ch.hslu.oop.sw08;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemparaturVerlaufTest {

    private TemparaturVerlauf gradientStore;

    @Before
    public void setup() {
        gradientStore = new TemparaturVerlauf();
        gradientStore.add(new Temparatur(0f));
    }

    @Test
    public void testAdd() {
        gradientStore.add(new Temparatur(1f));
        assertEquals(2, gradientStore.getCount());
    }

    @Test
    public void testClear() {
        gradientStore.clear();
        assertEquals(0, gradientStore.getCount());
    }

    @Test
    public void testGetCount() {
        gradientStore.add(new Temparatur(40f));
        assertEquals(2, gradientStore.getCount(), 0);
    }

    @Test
    public void testGetMax() {
        gradientStore.add(new Temparatur(2f));
        assertEquals(2f, gradientStore.getMax(), 0);
    }


    @Test
    public void testGetFloatMax() {
        gradientStore.add(new Temparatur(Float.MAX_VALUE));
        assertEquals(Float.MAX_VALUE, gradientStore.getMax(), 0);
    }

    @Test
    public void testGetMaxNoValues() {
        gradientStore.clear();
        assertEquals(-Float.MAX_VALUE, gradientStore.getMax(), 0);
    }

    @Test
    public void testGetMin() {
        gradientStore.add(new Temparatur(-1f));
        assertEquals(-1f, gradientStore.getMin(), 0);
    }

/*    @Test
    public void getFloatMin() {
        gradientStore.add(new Temparatur(Float.MIN_VALUE));
        assertEquals(Float.MIN_VALUE, gradientStore.getMin(), 0);
    }
*/

    @Test
    public void testCalcAverageTemparatur() {
        gradientStore.add(new Temparatur(100f));
        assertEquals(50f, gradientStore.calcAverageTemparatur(), 0);
    }
}