package com.student.asvirido.avaj.aircraft.factory;

/* Import planes */

import com.student.asvirido.avaj.aircraft.factory.JetPlane;
import com.student.asvirido.avaj.aircraft.factory.Helicopter;
import com.student.asvirido.avaj.aircraft.factory.Baloon;

/* Another imports  */
import com.student.asvirido.avaj.aircraft.factory.Coordinates;
import com.student.asvirido.avaj.aircraft.Flyable;

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