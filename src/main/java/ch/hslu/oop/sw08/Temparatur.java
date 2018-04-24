package ch.hslu.oop.sw08;

import java.util.Objects;

public final class Temparatur implements Comparable<Temparatur> {
    private float kelvin;
    private final static float KELVIN_OFFSET = 273.15f;

    public Temparatur(float celsius) {
        setCelsius(celsius);
    }

    public Temparatur(Temparatur temparatur) {
        this(temparatur.kelvin);
    }

    public float getCelsius() {
        return convertKelvinToCelsius(this.getKelvin());
    }

    public void setCelsius(float celsius) {
        setKelvin(convertCelsiusToKelvin(celsius));
    }

    public float getKelvin() {
        return this.kelvin;
    }

    public void setKelvin(float kelvin) {
        this.kelvin = kelvin;
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

    public final static float convertKelvinToCelsius(float kelvin) {
        return kelvin - Temparatur.KELVIN_OFFSET;
    }

    public final static float convertCelsiusToKelvin(float celsius) {
        return celsius + Temparatur.KELVIN_OFFSET;
    }
}
