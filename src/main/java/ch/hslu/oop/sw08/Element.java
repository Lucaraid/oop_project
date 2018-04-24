package ch.hslu.oop.sw08;

public class Element {

    private String elementName;
    private float meltingPoint, boilingPoint;

    /**
     * Constructor for objects of class Element
     *
     * @param elementName  The Element Name
     * @param boilingPoint This represents the Boilingpoint
     * @param meltingPoint This represents the Meltingpoint
     */
    public Element(String elementName, float meltingPoint, float boilingPoint) {
        // initialise instance variables
        this.elementName = elementName;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
    }

    @Override
    public String toString() {
        return "Element Name: " + this.elementName +
                ", Boiling Point: " + this.boilingPoint +
                ", Melting Point: " + this.meltingPoint;
    }

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public Zustand getAggregateState(float celsius) {
        if (celsius < this.meltingPoint) {
            return Zustand.SOLID;
        } else if (celsius < this.boilingPoint) {
            return Zustand.LIQUID;
        } else {
            return Zustand.GAS;
        }
    }
}
