package ch.hslu.oop.sw06;

public class Quicksilver extends Element {

    public static void main(String[] args) {
        Quicksilver quicksilver = new Quicksilver();
        System.out.print(quicksilver);
    }
    public Quicksilver() {
        super("Hg", -39f, 357f);
    }

    @Override
    public String toString() {
        return super.toString() + " Warning: Toxic";
    }
}
