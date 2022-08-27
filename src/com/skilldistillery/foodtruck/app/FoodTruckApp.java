package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		boolean runProgram = true;
		
		FoodTruck[] arrFoodTruck = new FoodTruck[5];
		
		
			for(int i = 0; i < 5; i++) {
				
		FoodTruck truck = new FoodTruck();
		System.out.println("Please enter name of food truck: ");
		String truckName = kb.nextLine();
		
		System.out.println("Please enter the food type on this truck: ");
		String truckFood = kb.nextLine();
	
		System.out.println("Please enter a number rating, 1-5, for this food truck: ");
		double truckRating = kb.nextDouble();
		kb.nextLine();
		
		truck = new FoodTruck(truckName, truckFood, truckRating);
		
		arrFoodTruck[i] = truck;
		arrFoodTruck[i].displayFoodTruck();
		
			}
		
		while(runProgram) {
		System.out.println("1.List all existing food trucks \n2.Display average rating of food trucks \n3.Display highest rated food truck \n4.Quit");
		int userInput = kb.nextInt();
		switch(userInput) {
			case 1:
				for(int i = 0; i < 5; i++) {
				arrFoodTruck[i].displayFoodTruck();
				}
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("Goodbye");
				runProgram = false;
				break;
			default: System.out.println("Invalid Entry, please use numbers to make any menu selection");
			break;
		}
		}
	}

}
