package ch.hslu.oop.sw10.Exercise1;

/**
 * The {@code Switchable} Interface represents a Switch.
 *
 * @author Luca Wandfluh
 * @version 1.0
 */
public interface Switchable {
    /**
     * Turn Switch on
    */
    void switchOn();

    /**
     * Turn Switch off
     */
    void switchOff();

    /**
     * Checks if Switch is on
     * @return Returns true if Switch is switched on
     */
    boolean isSwitchedOn();

    /**
     * Checks if Switch is off
     * @return Returns true if Switch is switched off
     */
    boolean isSwitchedOff();
}