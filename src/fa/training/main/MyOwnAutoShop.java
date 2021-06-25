package fa.training.main;

import fa.training.entities.Car;
import fa.training.entities.Ford;
import fa.training.entities.Sedan;
import fa.training.entities.Truck;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		
		Sedan sedan = new Sedan(500, 500, "Red", 30);
		Ford fordOne = new Ford(300, 300, "Black", 2021, 35);
		Ford fordTwo = new Ford(250, 250, "Yellow", 2020, 40);
		Truck truckOne = new Truck(350, 750, "Green", 3000);
		Truck truckTwo = new Truck(400, 800, "Blue", 3500);

		Car[] cars = new Car[5];
		cars[0] = sedan;
		cars[1] = fordOne;
		cars[2] = fordTwo;
		cars[3] = truckOne;
		cars[4] = truckTwo;
		
		for (int i = 0; i< cars.length; i++) {
			System.out.println("-----------Car " + (i+1) + "----------------");
			if (cars[i] instanceof Sedan) {
				System.out.println("Sedan price: " + cars[i].getRegularPrice());
			} else if (cars[i] instanceof Ford) {
				System.out.println("Ford price: " + cars[i].getRegularPrice());
			} else if (cars[i] instanceof Truck) {
				System.out.println("Truck price: " + cars[i].getRegularPrice());
			}
		}
	}
}
