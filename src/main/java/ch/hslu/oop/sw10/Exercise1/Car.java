package ch.hslu.oop.sw10.Exercise1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


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
public class Car implements Switchable {
    private Status status;
    private Engine engine;
    private Light lightFrontLeft, lightFrontRight;

    private static final Logger LOG = LogManager.getLogger(Car.class);

    public Car(){
        this.engine = new Engine();
        this.lightFrontLeft = new Light();
        this.lightFrontRight = new Light();

        /* Add all Listeners */
        this.engine.addPropertyChangeListener(e -> LOG.info("Car: Motor geändert"));
        this.lightFrontLeft.addPropertyChangeListener(e -> LOG.info("Car: Linkes Vorderes Licht geändert"));
        this.lightFrontRight.addPropertyChangeListener(e -> LOG.info("Car: Rechtes vorderes Licht geändert"));
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.engine.switchOn();
        car.lightFrontRight.switchOn();
        car.lightFrontLeft.switchOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn(){
        if (this.isSwitchedOff()) {
            this.status = Status.ON;
        }
        LOG.info("Car switched on");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOff(){
        if (this.isSwitchedOn()) {
            this.status = Status.OFF;
        }
        LOG.info("Car switched off");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOn(){
        return (this.status == Status.ON);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSwitchedOff(){
        return !(this.status == Status.ON);
    }
}
