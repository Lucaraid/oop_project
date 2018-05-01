package ch.hslu.oop.sw10.Exercise2;

import ch.hslu.oop.sw09.Temparatur;
import javafx.beans.property.Property;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TemparaturVerlauf {

    private final Collection<Temparatur> store;

    private List<PropertyChangeListener> changeListener = new ArrayList<PropertyChangeListener>();

    public TemparaturVerlauf() {
        store = new ArrayList<Temparatur>();
    }

    public void add(Temparatur temparatur) {
        if (temparatur.getCelsius() < this.getMin()){
            PropertyChangeEvent event = new PropertyChangeEvent(this, TemparaturEnum.MIN, this.getMin(), temparatur.getCelsius());
        }
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

    @Override
    public String toString() {
        return "Min: " + this.getMin() + ", Max: " + this.getMax() + ", Avg. Temp: " + this.calcAverageTemparatur();
    }

    /**
     * Registriert einen Listener
     * @param listener PropertyChangeListener
     */
    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListener.add(listener);
    }

    /**
     * Deregistriert einen Listener
     * @param listener PropertyChangeListener
     */
    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListener.remove(listener);
    }

    /**
     * Informiert alle Listener dass ein Attribut geändert hat.
     * @param pcEvent PropertyChangeEvent
     */
    public void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListener) {
            listener.propertyChange(pcEvent);
        }
    }
}
