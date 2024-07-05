package nl.Kees298;

import java.util.Objects; //needed to evaluate (Objects.equals(unit, "km")))
import java.util.Scanner; //Import scanner class
import java.util.HashMap; //to compute the speed, store the distances.
class Lightning {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will calculate the distance of a lightning strike.");
		System.out.println("It will also calculate the speed at which the storm approaches you,"
				+ " and estimated time of arrival");
		System.out.println("aNegative speed / time of arrival means the storm moves away from you.");
		System.out.print("Do you want a distance in km or ft? ");
		String unit = input.nextLine(); // "km" or "ft"
		System.out.println("The selected unit is " + unit);
		System.out.println();

		if (Objects.equals(unit, "km")) {
			double distanceKilometers;
			HashMap<Integer, Double> dictkm= new HashMap<Integer, Double>(); // stores distances in km

			for(int i = 0;i <= 4; i++) {

				double speed; // speed in km/h
				double estimatedArrival; // time in hours
				System.out.println("What's the situation at t = " + i + " minutes?");
				System.out.print("How many seconds between thunder and lightning? ");
				double time = input.nextDouble();
				distanceKilometers = time*0.343;
				dictkm.put(i,distanceKilometers);
				System.out.println("Time between thunder and lightning is " + time + " seconds");
				System.out.println("That means that the lightning strike is " + distanceKilometers + " km away.");
				while (dictkm.containsKey(i-1)) { // cannot calculate speed at t = 0
					speed = (((dictkm.get(i-1))-(dictkm.get(i)))/0.0166667); // 1 minute = 0.0166667 h
					estimatedArrival = (dictkm.get(i))/speed;
					System.out.println("It's speed is " + speed + " km/h.");
					System.out.println("At this speed, it will arrive here in " + estimatedArrival
							+ " hours or " + (int) (estimatedArrival*60) + " minutes");
					break;
						}
						System.out.println();
						}


				}
			}
		}





