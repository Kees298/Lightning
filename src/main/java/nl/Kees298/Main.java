package nl.Kees298;

import java.util.Objects; //needed to evaluate (Objects.equals(unit, "km")))
import java.util.Scanner; //Import scanner class
import java.util.HashMap; //to compute the speed, store the distances.
class Lightning {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want a distance in km or ft? ");
		String unit = input.nextLine(); // "km" or "ft"
		System.out.println("The selected unit is " + unit);
		System.out.println();

		if (Objects.equals(unit, "km")) {
			double distanceKilometers;
			HashMap<Integer, Double> dictionary= new HashMap<Integer, Double>(); // stores distances

			for(int i = 0;i <= 4; i++) {

						System.out.println("What's the situation at t = " + i + " minutes?");
						System.out.print("How many milliseconds between thunder and lightning? "); // input needs whole numbers, not sure why
						double time = input.nextDouble();
						distanceKilometers = time*0.000343;

						dictionary.put(i,time);
						System.out.println("Time between thunder and lightning is " + time/1000 + " seconds");
						System.out.println("That means that the lightning strike is " + distanceKilometers + " km away.");
						System.out.println();
						}

			System.out.println(dictionary.get(0) + dictionary.get(1)*400); // test to see if dictionary is filled, nonsense.
				}
			}
		}





