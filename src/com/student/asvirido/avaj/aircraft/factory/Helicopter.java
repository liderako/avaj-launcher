package com.student.asvirido.avaj.aircraft.factory;

import com.student.asvirido.avaj.aircraft.Aircraft;
import com.student.asvirido.avaj.aircraft.Flyable;
import com.student.asvirido.avaj.aircraft.factory.Coordinates;
import com.student.asvirido.avaj.tower.WeatherTower;

import static java.lang.System.*;

public class Helicopter extends Aircraft implements Flyable {
	private WeatherTower tower;
	Helicopter(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		String weather = this.tower.getWeather(this.coordinates);
		int longitude = this.coordinates.getLongitude();
		int latitude = this.coordinates.getLatitude();
		int height = this.coordinates.getHeight();

		if ((weather.equals("snow")) == true ) {
			say();
			System.out.println("My rotor is going to freeze!");
			height -= 12;
		}
		else if ((weather.equals("rain")) == true ) {
			say();
			System.out.println("Damn you rain! You messed up my baloon.");
			longitude += 5;
		}
		else if ((weather.equals("sun")) == true ) {
			say();
			System.out.println("This is hot.");
			longitude += 10;
			height += 2;
		}
		else if ((weather.equals("fog")) == true ) {
			say();
			System.out.println("OMG, again fog");
			longitude += 1;
		}
		if (height <= 0) {
			say();
			System.out.printf("%s%d%s%d%s","landing. Longitude: ", this.coordinates.getLongitude(), " Latitude: ", this.coordinates.getLatitude(), "\n");
			this.tower .unregister(this);
			height = 0;
			System.out.printf("%s%s%s%s%d%s", "Tower Says: ", "Helicopter#", this.name, "(", this.id, ") unregistered from weather tower.\n");
		}
		this.coordinates = new Coordinates(longitude, latitude, height);
	}

	public void registerTower(WeatherTower weatherTower) {
		this.tower = weatherTower;
		this.tower.register(this);
		System.out.printf("%s%s%s%s%d%s", "Tower Says: ", "Helicopter#", this.name, "(", this.id, ") registered to weather tower.\n");
	}

	private void say() {
		System.out.printf("%s%s%s%d%s", "Helicopter#", this.name, "(", this.id, ") " );
	}
}