package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.Aircraft;
import com.student.asvirido.avaj.aircraft.Flyable;
import com.student.asvirido.avaj.aircraft.Coordinates;
import com.student.asvirido.avaj.aircraft.WeatherTower;

import static java.lang.System.*;

public class Baloon extends Aircraft implements Flyable {

	Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		out.printf("updateConditions\n");
	}

	public void registerTower(WeatherTower weatherTower) {
		out.printf("registerTower\n");
	}
	public String getName() {
		return (this.name);
	}
}