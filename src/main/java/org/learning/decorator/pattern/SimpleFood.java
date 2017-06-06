package org.learning.decorator.pattern;

public class SimpleFood implements Food{

	@Override
	public String getFoodDescription() {
		return "Rice and Dal";
	}

	@Override
	public int getFoodPrice() {
		return 50;
	}

}
