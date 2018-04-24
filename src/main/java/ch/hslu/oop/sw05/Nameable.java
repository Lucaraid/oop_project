package ch.hslu.oop.sw05;

/**
 * The {@code Nameable} Interface gives the possibility, to set a name.
 *
 * @author Luca Wandfluh
 * @version 1.0
 */
public interface Nameable {
    /**
     * Set Name
     * @param name Name
     */
    void setName(final String name);
    /**
     * Get Name
     * @return Name
     */
    String getName();
}
