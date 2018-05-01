package ch.hslu.oop.sw10.Exercise1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Light} Class represents a switchable Light.
 * It implements the Interface Switchable.
 * The Light can be turned off and on.
 *
 * @see Switchable
 * @author Luca Wandfluh
 * @version 1.0
 */
public class Light implements Switchable {

    private Status state;
    private int lumen;

    private static final Logger LOG = LogManager.getLogger(Light.class);

    private List<PropertyChangeListener> changeListener = new ArrayList<PropertyChangeListener>();

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn(){
        if (this.isSwitchedOff()) {
            this.lumen = 1200;
            this.state = Status.ON;
            LOG.info("Light switched on");
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", Status.OFF, this.state);
            this.firePropertyChangeEvent(pcEvent);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff(){
        if (this.isSwitchedOn()) {
            this.lumen = 0;
            this.state = Status.OFF;
            LOG.info("Light switched off");
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", Status.ON, this.state);
            this.firePropertyChangeEvent(pcEvent);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOn(){
        return (this.state == Status.ON);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOff(){
        return !(this.state == Status.ON);
    }

    /**
     * Registriert einen Listener
     * @param listener PropertyChangeListener
     */
    public void addPropertyChangeListener(final PropertyChangeListener listener){
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
     * Sendet ein PropertyChangeEvent an alle Listener.
     * @param pcEvent PropertyChangeEvent
     */
    public void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListener) {
            listener.propertyChange(pcEvent);
        }
    }
}
