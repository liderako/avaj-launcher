package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.Aircraft;
import com.student.asvirido.avaj.aircraft.Flyable;
import com.student.asvirido.avaj.aircraft.Coordinates;
import com.student.asvirido.avaj.aircraft.WeatherTower;

import static java.lang.System.*;

public class JetPlane extends Aircraft implements Flyable {

	JetPlane(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		out.printf("updateConditions JetPlane\n");
	}

	public void registerTower(WeatherTower weatherTower) {
		weatherTower.register(this);
		out.printf("registerTower in JetPlane\n");
	}
}