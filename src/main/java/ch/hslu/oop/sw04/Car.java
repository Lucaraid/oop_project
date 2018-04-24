package ch.hslu.oop.sw04;

import ch.hslu.oop.sw05.Nameable;

/**
 * The {@code Car} class represents a car.
 * It contains an engine and light object.
 * This class implements the Interface Switchable.
 *
 * @see Engine
 * @see Light
 * @see Switchable
 * @author Luca Wandfluh
 * @version 1.0
 */
public class Car implements Switchable, Nameable {
    private boolean isOn;
    private Engine engine;
    private Light light;

    private String name;

    public static void main(String[] args) {
        Car car = new Car();
        car.switchOn();
        car.engine.switchOn();
        car.light.switchOn();
    }

    public Car(){
        this.engine = new Engine();
        this.light = new Light();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn(){
        if (this.isSwitchedOff()) {
            this.isOn = true;
        }
        System.out.println("Car switched on");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff(){
        if (this.isSwitchedOn()) {
            this.isOn = false;
        }
        System.out.println("Car switched off");
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

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return this.name;
    }
}
