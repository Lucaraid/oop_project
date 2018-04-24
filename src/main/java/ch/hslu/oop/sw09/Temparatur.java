package ch.hslu.oop.sw09;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.Objects;

public final class Temparatur implements Comparable<Temparatur> {
    private float kelvin;
    private final static float KELVIN_OFFSET = 273.15f;

    private Temparatur(float kelvin) {
        this.kelvin = kelvin;
    }

    private Temparatur(Temparatur temparatur) {
        this(temparatur.getKelvin());
    }

    public float getCelsius() {
        return convertKelvinToCelsius(this.getKelvin());
    }

    public float getKelvin() {
        return this.kelvin;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Temparatur)) {
            return false;
        }

        Temparatur temparatur = (Temparatur) obj;
        return Float.compare(temparatur.getKelvin(), this.getKelvin()) == 0;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.getKelvin());
    }

    @Override
    public String toString() {
        return "Kelvin: " + this.getKelvin() + ", Celsius:" + this.getCelsius();
    }

    @Override
    public int compareTo(Temparatur other) {
        return Float.compare(this.getKelvin(), other.getKelvin());
    }

    public static Temparatur createFromCelsius(final float celsius) {
        if (celsius < -273.15f) {
            throw new IllegalArgumentException("Celsius darf nicht kleiner als -273.15 sein.");
        }
        return new Temparatur(convertCelsiusToKelvin(celsius));
    }

    public static Temparatur createFromKelvin(final float kelvin) {
        if (kelvin < 0f) {
            throw new IllegalArgumentException("Kelvin darf nicht kleiner als 0 sein.");
        }
        return new Temparatur(kelvin);
    }

    public final static float convertKelvinToCelsius(float kelvin) {
        return kelvin - Temparatur.KELVIN_OFFSET;
    }

    public final static float convertCelsiusToKelvin(float celsius) {
        return celsius + Temparatur.KELVIN_OFFSET;
    }
}
