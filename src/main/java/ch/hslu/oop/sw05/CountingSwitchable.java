package ch.hslu.oop.sw05;

import ch.hslu.oop.sw04.Switchable;

/**
 * The {@code CountingSwitchable} Interface counts, how many times it got switched.
 *
 * @see Switchable
 * @author Luca Wandfluh
 * @version 1.0
 */
public interface CountingSwitchable extends Switchable {
    /**
     * Counts, how many times the switch got triggered
     * @return Amount of times the switch got triggered
     */
    long getSwitchCount();
}
