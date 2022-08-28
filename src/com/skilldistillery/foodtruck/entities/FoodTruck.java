package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	public String truckName;
	public String truckFood;
	public double truckRating;
	public int id = 0;
	public static int COUNTER;

	public FoodTruck() {
	};

	public FoodTruck(String truckName, String truckFood, double truckRating) {
		this.truckName = truckName;
		this.truckFood = truckFood;
		this.truckRating = truckRating;
		COUNTER++;
		id = COUNTER;

	}

	public String toString() {
		return "\nName: " + getTruckName() + "\nFood: " + getTruckFood() + "\nRating: " + getTruckRating() + "\nID: "
				+ getId();
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getTruckFood() {
		return truckFood;
	}

	public void setTruckFood(String truckFood) {
		this.truckFood = truckFood;
	}

	public double getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(double truckRating) {
		this.truckRating = truckRating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void displayFoodTruck() {
		String truckData = toString();
		System.out.println(truckData);
	}

}
