package nl.Kees298;

import java.util.Objects; //needed to evaluate (Objects.equals(unit, "km")))
import java.util.Scanner; //Import scanner class
class Lightning {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Do you want a distance in km or ft? ");
		String unit = input.nextLine(); // "km" or "ft"
		System.out.println("The selected unit is " + unit);
		System.out.println();

		if (Objects.equals(unit, "km")) {
			double distanceKilometers;

			for(;;) {

				System.out.print("How many milliseconds between thunder and lightning? "); // input needs whole numbers, not sure why
				double time = input.nextDouble();
				distanceKilometers = time*0.000343;
				System.out.println("Time between thunder and lightning is " + time/1000 + " seconds");
				System.out.println("That means that the lightning strike is " + distanceKilometers + " km away.");
			}
		}
	}
}




