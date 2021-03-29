package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carInfo = {car.getMake(), car.getModel(), Integer.toString(car.getYear())};
		return carInfo;
	}
	
	@Test
	void verifyCarEqualityWithMakeModelYear() {
		String[] expected = {"Audi", "A6", "2019"};
		Car actual = new Car("Audi", "A6", 2019, 50, 40000);
		assertArrayEquals(expected, carToStringArray(actual) );
	}
	
}