package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.Aircraft;
import com.student.asvirido.avaj.aircraft.Flyable;
import com.student.asvirido.Coordinates;

import static java.lang.System.*;

class Helicopter extends Aircraft implements Flyable {

	Helicopter(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		out.printf("updateConditions\n");
	}

	public void registerTower(WetherTower weatherTower) {
		out.printf("registerTower\n");
	}
}