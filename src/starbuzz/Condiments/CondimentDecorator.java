package starbuzz.Condiments;

import starbuzz.Beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    @Override
    public abstract String getDescription();
}
