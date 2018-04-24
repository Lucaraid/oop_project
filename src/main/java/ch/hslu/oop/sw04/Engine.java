package ch.hslu.oop.sw04;

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

    private boolean running;
    private int rpm;

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn(){
        if (this.isSwitchedOff()) {
            this.rpm = 600;
            this.running = true;
        }
        System.out.println("Engine switched on");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff(){
        if (this.isSwitchedOn()) {
            this.rpm = 0;
            this.running = false;
        }

        System.out.println("Engine switched off");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOn(){
        return this.running;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOff(){
        return !this.running;
    }
}
