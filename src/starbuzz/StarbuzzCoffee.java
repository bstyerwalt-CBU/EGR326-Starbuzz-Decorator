package starbuzz;

import starbuzz.Beverages.*;
import starbuzz.Condiments.*;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		//Make tall Plain Espresso
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		//Make grande Dark Roast + Double Mocha + Whip
		Beverage beverage2 = new Milk(new Mocha(new Mocha(new DarkRoast())));
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		//Make venti House Blend + Soy + Mocha + Whip
		Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
