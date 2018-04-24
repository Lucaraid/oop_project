package ch.hslu.oop.sw08;

import java.util.*;

public class TemparaturVerlauf {

    private final Collection<Temparatur> store;

    public TemparaturVerlauf() {
        store = new ArrayList<Temparatur>();
    }

    public void add(Temparatur temparatur) {
        store.add(temparatur);
    }

    public void clear() {
        store.clear();
    }

    public int getCount() {
        return store.size();
    }

    public float getMax() {
        if (this.getCount() > 0) {
            return Collections.max(store).getCelsius();
        }
        return -Float.MAX_VALUE;
    }

    public float getMin() {
        if (this.getCount() > 0) {
            return Collections.min(store).getCelsius();
        }
        return Float.MAX_VALUE;
    }

    public float calcAverageTemparatur() {
        if (this.getCount() > 0) {
            float alltemp = 0f;
            for (final Temparatur temparatur : store) {
                alltemp += temparatur.getCelsius();
            }
            return alltemp / this.getCount();
        }
        return 0f;
    }
}
