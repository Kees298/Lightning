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

						double speed;
						System.out.println("What's the situation at t = " + i + " minutes?");
						System.out.print("How many seconds between thunder and lightning? ");
						double time = input.nextDouble();
						distanceKilometers = time*0.343;
						dictionary.put(i,distanceKilometers);
						System.out.println("Time between thunder and lightning is " + time + " seconds");
						System.out.println("That means that the lightning strike is " + distanceKilometers + " km away.");
						while (dictionary.containsKey(i-1)) {
							speed = (((dictionary.get(i-1))-(dictionary.get(i)))/0.0166667); // 1 minute = 0.0166667 h
							System.out.println("speed is " + speed + " km/h.");
							break;
						}
						System.out.println();
						}


				}
			}
		}





