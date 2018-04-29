package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.Flyable;
import com.student.asvirido.avaj.aircraft.JetPlane;
import com.student.asvirido.avaj.aircraft.Helicopter;
import com.student.asvirido.avaj.aircraft.Baloon;
import com.student.asvirido.avaj.aircraft.Coordinates;

public class AircraftFactory {

	public Flyable newAircraft(String type, String name, int longitude, int latitude, int height) {
		JetPlane 	jetPlane;
		Baloon 		baloon;
		Helicopter 	helicopter;

		if ((type.equals("JetPlane")) == true) {
			jetPlane = new JetPlane(name, new Coordinates(longitude, latitude, height));
			return (jetPlane);
		}
		else if ((type.equals("Baloon")) == true) {
			baloon = new Baloon(name, new Coordinates(longitude, latitude, height));	
			return (baloon);
		}
		helicopter = new Helicopter(name, new Coordinates(longitude, latitude, height));
		return (helicopter);
	}
}