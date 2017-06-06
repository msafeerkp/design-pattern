package org.learning.decorator.pattern;

public class NonVegFoodDecorator extends FoodDecorator{
	
	public NonVegFoodDecorator(Food food) {
		super(food);
	}
	
	@Override
	public String getFoodDescription() {
		return "Chicken Fry and "+super.getFoodDescription();
	}
	
	@Override
	public int getFoodPrice() {
		return 70+super.getFoodPrice();
	}

}
