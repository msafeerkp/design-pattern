package org.learning.decorator.pattern;

public class VegFoodDecorator extends FoodDecorator{
	
	public VegFoodDecorator(Food food) {
		super(food);
	}
	
	@Override
	public String getFoodDescription() {
		return "Mashroom Manchurian "+super.getFoodDescription();
	}
	
	@Override
	public int getFoodPrice() {
		return 50+super.getFoodPrice();
	}

}
