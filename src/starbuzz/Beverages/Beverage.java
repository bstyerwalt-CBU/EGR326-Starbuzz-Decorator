package starbuzz.Beverages;

//make this class abstract
public abstract class Beverage {
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	//public double cost();
	public abstract double cost();
}
