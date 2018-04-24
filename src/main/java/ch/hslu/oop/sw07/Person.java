package ch.hslu.oop.sw07;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private final long id;
    private String surname, forename;

    public Person(final long id, String surname, String forename) {
        this.id = id;
        this.surname = surname;
        this.forename = forename;
    }

    public Person(String surname, String forename) {
        this(1, surname, forename);
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", Surname: " + this.surname + ", Forename: " + this.forename;
    }

    @Override
    public final boolean equals(final Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Person)) {
            return false;
        }
        final Person person = (Person) other;
        return (person.id == this.id);
    }

    @Override
    public final int hashCode() {
        return Long.hashCode(this.id);
    }

    @Override
    public int compareTo(Person other) {
        return Long.compare(this.id, other.id);
    }

    public long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }
}
