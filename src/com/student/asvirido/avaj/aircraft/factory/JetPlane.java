package com.student.asvirido.avaj.aircraft.factory;

import com.student.asvirido.avaj.aircraft.Aircraft;
import com.student.asvirido.avaj.aircraft.Flyable;
import com.student.asvirido.avaj.aircraft.factory.Coordinates;
import com.student.asvirido.avaj.tower.WeatherTower;

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
		System.out.printf("%s%s%s%s%d%s","Tower Says: ", "JetPlane#", this.name, "(", this.id, ") registered to weather tower.\n");
	}
}