package org.learning.decorator.pattern;

public class ConsoleMain {
	
	public static void main(String[] args) {
		SimpleFood food = new SimpleFood();
		System.out.println("Normal Food Details : ");
		System.out.println("Desc : "+food.getFoodDescription() + ", Price : "+food.getFoodPrice());
		
		NonVegFoodDecorator decorator = new NonVegFoodDecorator(food);
		System.out.println("Normal Food after nonveg Details : ");
		System.out.println("Desc : "+decorator.getFoodDescription() + ", Price : "+decorator.getFoodPrice());
		
	}

}
