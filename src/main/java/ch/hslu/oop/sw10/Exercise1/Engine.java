package ch.hslu.oop.sw10.Exercise1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Engine} Class represents an Engine.
 * It implements the Interface Switchable.
 * This Engine can be turned off and on.
 *
 * @see Switchable
 * @author Luca Wandfluh
 * @version 1.0
 */
public class Engine implements Switchable {

    private Status state;
    private int rpm;

    private static final Logger LOG = LogManager.getLogger(Engine.class);
    private final List<PropertyChangeListener> changeListener = new ArrayList<PropertyChangeListener>();

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn(){
        if (this.isSwitchedOff()) {
            this.rpm = 600;
            this.state = Status.ON;
            LOG.info("Engine switched on");
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", Status.OFF, this.state);
            this.firePropertyChangeListener(pcEvent);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff(){
        if (this.isSwitchedOn()) {
            this.rpm = 0;
            this.state = Status.OFF;
            LOG.info("Engine switched off");
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", Status.ON, this.state);
            this.firePropertyChangeListener(pcEvent);
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
     * Registriert einen PropertyChangeListener.
     * @param listener PropertyChangeListener
     */
    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        if(listener != null) {
            this.changeListener.add(listener);
        } else {
            LOG.info("Listener was null");
        }
    }

    /**
     * Deregistriert einen PropertyChangeListener
     * @param listener PropertyChangeListener
     */
    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        if (listener != null) {
            this.changeListener.remove(listener);
        } else {
            LOG.info("Listener was null");
        }
    }

    /**
     * Informiert alle listener dass ein Atribut geändert hat.
     * @param pcEvent PropertyChangeEvent
     */
    private void firePropertyChangeListener(PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListener) {
            listener.propertyChange(pcEvent);
        }
    }

}
