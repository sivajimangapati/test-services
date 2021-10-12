package com.sample.food.factory;

public class FoodFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodFactory myFoods = new FoodFactory();
		Food food1 = myFoods.getFood("FastFood");
		Food food2 = myFoods.getFood("Fruit"); 
		System.out.println("My name is: " + food1.getClass().getName());
		System.out.println("My name is: " + food2.getClass().getName());
		System.out.println("Our superclass is: " 
		 + food1.getClass().getInterfaces());
		food1.getType();
		food2.getType();
	}

}
