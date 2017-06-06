package org.learning.decorator.pattern;

public abstract class FoodDecorator implements Food{
	
	Food food;
	public FoodDecorator(Food food) {
		this.food = food;
	}
	
	@Override
	public String getFoodDescription(){
		return food.getFoodDescription();
	}
	
	@Override
	public int getFoodPrice(){
		return food.getFoodPrice();
	}

}
