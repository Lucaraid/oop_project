package ch.hslu.oop.sw03;

public class Temparatur
{
    private float celsius;

    /**
     * Constructor for objects of class Temparatur
     */
    public Temparatur(){
        // initialise instance variables
        setCelsius(20);
    }
    
    public Temparatur(float celsius){
        setCelsius(celsius);
    }
    
	public static void main(String [] args)
	{
		Element Pb = new Element("Pb", 328f, 1750f);
		Element N = new Element("N", -210f, -196f);
		Element Hg = new Element("Hg", -39f, 357f);
		Temparatur celsius = new Temparatur(30f);
		
		System.out.println(Pb.getElementName() + " ist " + Pb.getAggregateState(celsius.getCelsius()));
		System.out.println(N.getElementName() + " ist " + N.getAggregateState(celsius.getCelsius()));
		System.out.println(Hg.getElementName() + " ist " + Hg.getAggregateState(celsius.getCelsius()));
	}
    
    public float getCelsius(){
        return this.celsius;        
    }
        
    public void setCelsius(float temparatur){
        this.celsius = temparatur;
    }
    
    public float getKelvin(){
        return calcKelvin(getCelsius());
    }
    
    public float getFahrenheit(){
        return calcFahrenheit(getCelsius());
    }
    
    public float kelvinToCelsius(float kelvin){
        return kelvin - (float)273.15;
    }
    
    public float calcKelvin(float celsius){
        return celsius + (float)273.15;
    }
    
    public float calcFahrenheit(float celsius){
        return (float)(celsius * 1.8f) + 32;
    }
    
    public void addCelsius(float celsius){
        setCelsius(getCelsius() + celsius);
    }
    
    public void addKelvin(float kelv){
        setCelsius(getCelsius() + kelvinToCelsius(kelv));
    }
}