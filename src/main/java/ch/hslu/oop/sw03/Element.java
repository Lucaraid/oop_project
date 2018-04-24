package ch.hslu.oop.sw03;

public class Element
{
    // instance variables - replace the example below with your own
    private String elementName;
    private float meltingPoint, boilingPoint;
    

    /**
     * Constructor for objects of class Element
     *
     * @param elementName The Element Name
     * @param boilingPoint This represents the Boilingpoint
     * @param meltingPoint This represents the Meltingpoint
     */
    public Element(String elementName, float meltingPoint, float boilingPoint)
    {
        // initialise instance variables
    	this.elementName = elementName;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;
    }
    
    public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getAggregateState(float celsius)
    {
        if (celsius < this.meltingPoint) {
        	return "fest";
        } else if (celsius < this.boilingPoint) {
        	return "fl�ssig";
        } else {
        	return "gas";
        }
    }
}