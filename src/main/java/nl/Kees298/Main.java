package nl.Kees298;

import java.util.Scanner; //Import scanner class
import java.util.HashMap; //to compute the speed, store the distances.

class Lightning {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//textblock printed at the start
		System.out.println("""
				This program will calculate the distance of a lightning strike.");
				It will also calculate the speed at which the storm approaches you, and estimated time of arrival");
				A negative speed / time of arrival means the storm moves away from you.;
				System.out.print("Do you want a distance in km or ft?
				""");

		// unit selection
		String unit = input.nextLine(); // "km" or "ft"
		System.out.println("The selected unit is " + unit);
		System.out.println();

		//when user selects km
		if (unit.equals("km")) {
			double distanceKilometers;
			HashMap<Integer, Double> dictkm = new HashMap<>(); // stores distances in km

			//ask 5 times for input
			for (int i = 0; i <= 4; i++) {
				double speed; // speed in km/h
				double estimatedArrival; // time in hours

				//text when asking for input
				System.out.println("What's the situation at t = " + i + " minutes?");
				System.out.print("How many seconds between thunder and lightning? ");
				double time = input.nextDouble();
				distanceKilometers = time * 0.343;
				dictkm.put(i, distanceKilometers);
				System.out.println("Time between thunder and lightning is " + time + " seconds");
				System.out.println(
						"That means that the lightning strike is " + distanceKilometers + " km away.");

				// extra text when i >=1
				if (dictkm.containsKey(i - 1)) { // cannot calculate speed at t = 0
					speed = (((dictkm.get(i - 1)) - (dictkm.get(i))) / 0.0166667); // 1 minute = 0.0166667 h
					estimatedArrival = (dictkm.get(i)) / speed;
					System.out.println("It's speed is " + speed + " km/h.");
					System.out.println("At this speed, it will arrive here in " + estimatedArrival
							+ " hours or " + (int) (estimatedArrival * 60) + " minutes");
				}
				System.out.println();
			}

			// when user selects ft
		} else if (unit.equals("ft")) {
			double distanceFeet;
			HashMap<Integer, Double> dictft = new HashMap<>();

			// ask 5 times for input
			for (int i = 0; i <= 4; i++) {
				double speed; //speed in ft/h
				double estimatedArrival; //time in hours

				//text when asking for input
				System.out.println("What's the situation at t = " + i + " minutes?");
				System.out.print("How many seconds between thunder and lightning? ");
				double time = input.nextDouble();
				distanceFeet = time * 1125;
				dictft.put(i, distanceFeet);
				System.out.println("Time between thunder and lightning is " + time + " seconds");
				System.out.println("That means that the lightning strike is " + distanceFeet + " ft away.");

				// extra text when i >=1
				if (dictft.containsKey(i - 1)) { // cannot calculate speed at t = 0
					speed = (dictft.get(i - 1) - (dictft.get(i)) / 0.0166667); // 1 minute = 0.0166667 h
					estimatedArrival = (dictft.get(i)) / speed;
					System.out.println("It's speed is " + speed + " ft/h.");
					System.out.println("At this speed, it will arrive here in " + estimatedArrival
							+ " hours or " + (int) (estimatedArrival * 60) + " minutes");
				}
				System.out.println();
			}

			//exception
		} else {
			System.out.println("No valid unit selected");
		}
	}
}






