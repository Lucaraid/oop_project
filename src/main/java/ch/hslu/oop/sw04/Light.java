package ch.hslu.oop.sw04;

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

    private boolean isOn;
    private int lumen;

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn(){
        if (this.isSwitchedOff()) {
            this.lumen = 1200;
            this.isOn = true;
        }
        System.out.println("Light switched on");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff(){
        if (this.isSwitchedOn()) {
            this.lumen = 0;
            this.isOn = false;
        }
        System.out.println("Light switched off");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOn(){
        return this.isOn;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOff(){
        return !this.isOn;
    }
}
