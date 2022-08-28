package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		boolean runProgram = true;
		String quit = "quit";
		double sum = 0;
		double averageTotal;
		FoodTruck[] arrFoodTruck = new FoodTruck[5];

		for (int i = 0; i < 5; i++) {

			FoodTruck truck = new FoodTruck();
			System.out.println("Please enter name of food truck: ");
			String truckName = kb.nextLine();
			if (truckName.equals(quit)) {
				break;
			}
			System.out.println("Please enter the food type on this truck: ");
			String truckFood = kb.nextLine();

			System.out.println("Please enter a number rating, based on the scale 1-5, for this food truck: ");
			double truckRating = kb.nextDouble();
			kb.nextLine();

			truck = new FoodTruck(truckName, truckFood, truckRating);

			arrFoodTruck[i] = truck;

		}

		while (runProgram) {
			System.out.println(
					"1.List all existing food trucks \n2.Display average rating of food trucks \n3.Display highest rated food truck \n4.Quit");
			int userInput = kb.nextInt();
			switch (userInput) {
			case 1:
				for (int i = 0; i < arrFoodTruck.length; i++) {
					if (arrFoodTruck[i] == null) {
						break;
					}
					arrFoodTruck[i].displayFoodTruck();
				}
				break;

			case 2:
				int averageCounter = 0;
				for (int i = 0; i < arrFoodTruck.length; i++) {
					if (arrFoodTruck[i] == null) {
						break;
					}
					arrFoodTruck[i].getTruckRating();
					sum = sum + arrFoodTruck[i].getTruckRating();
					averageCounter = i;
				}
				averageTotal = sum / (averageCounter + 1);
				System.out.println("The average rating of all food trucks is: " + averageTotal);
				break;

			case 3:
				int max = (int) arrFoodTruck[0].getTruckRating();
				int bestRating = 0;
				for (int i = 0; i < arrFoodTruck.length; i++) {
					if (arrFoodTruck[i] == null) {
						break;
					}
					if (max < arrFoodTruck[i].getTruckRating()) {
						max = (int) arrFoodTruck[i].getTruckRating();
						bestRating = i;
					}

				}
				System.out.println("The best rated food truck is: " + arrFoodTruck[bestRating]);
				break;

			case 4:
				System.out.println("Goodbye");
				runProgram = false;
				break;

			default:
				System.out.println("Invalid Entry, please use numbers to make any menu selection");
				break;

			}
		}
		kb.close();
	}

}
