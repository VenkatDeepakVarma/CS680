package edu.umb.cs680.hw11;

public class Car {
	private String make, model;
	private int mileage, year;
	private float price;
	private int dominationCount;

	public Car(String make, String model, int year, int mileage, float price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.mileage = mileage;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getMileage() {
		return mileage;
	}

	public int getYear() {
		return year;
	}

	public float getPrice() {
		return price;
	}


	public void setDominationCount(int dominationCount) {
		this.dominationCount = dominationCount;
	}
	
	@Override
	public boolean equals(Object obj) {
		Car car = (Car) obj;
		if(make.equals(car.getMake()) && model.equals(car.getModel()) && year==car.getYear() && mileage==car.getMileage() && price==car.getPrice() && dominationCount==car.getDominationCount())
			return true;
		return false;
	}

	public int getDominationCount() {
		return dominationCount;
	}
	public static void main(String[] args) {
		
			Car car = new Car("K", "S", 22, 2020, 80000);
			System.out.println("Make: " + car.getMake());
			System.out.println("Model: " + car.getModel());
			System.out.println("Mileage: " + car.getMileage());
			System.out.println("Year: " + car.getYear());
			System.out.println("Price: " + car.getPrice());

		}
	}
