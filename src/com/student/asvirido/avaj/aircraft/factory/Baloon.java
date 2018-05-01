package com.student.asvirido.avaj.aircraft.factory;

import com.student.asvirido.avaj.aircraft.Aircraft;
import com.student.asvirido.avaj.aircraft.Flyable;
import com.student.asvirido.avaj.aircraft.factory.Coordinates;
import com.student.asvirido.avaj.tower.WeatherTower;
import com.student.asvirido.avaj.*;
import java.io.*;
import static java.lang.System.*;

public class Baloon extends Aircraft implements Flyable {
	private WeatherTower tower;

	Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		String weather = this.tower.getWeather(this.coordinates);
		int longitude = this.coordinates.getLongitude();
		int latitude = this.coordinates.getLatitude();
		int height = this.coordinates.getHeight();

		if ((weather.equals("snow")) == true ) {
			say();
			System.out.println("It's snowing. We're gonna crash.");
			height -= 15;
		}
		else if ((weather.equals("rain")) == true ) {
			say();
			System.out.println("Damn you rain! You messed up my baloon.");
			height -= 5;
		}
		else if ((weather.equals("sun")) == true ) {
			say();
			System.out.println("Let's enjoy the good weather and take some pics.");
			longitude += 2;
			height += 4;
		}
		else if ((weather.equals("fog")) == true ) {
			say();
			System.out.println("OMG, again fog");
			height -= 3;
		}
		if (height <= 0) {
			String s = "landing. Longitude: " + this.coordinates.getLongitude() + " Latitude: " + this.coordinates.getLatitude() + "\n";
			System.out.printf("%s%d%s%d%s","landing. Longitude: ", this.coordinates.getLongitude(), " Latitude: ", this.coordinates.getLatitude(),"\n");
			this.tower.unregister(this);
			height = 0;
			System.out.printf("%s%s%s%s%d%s", "Tower Says: ", "Baloon#", this.name, "(", this.id, ") unregistered from weather tower.\n");
		}
		this.coordinates = new Coordinates(longitude, latitude, height);
	}

	public void registerTower(WeatherTower weatherTower) {
		this.tower = weatherTower;
		this.tower.register(this);
		String s = "Tower Says: " + "Baloon#" + this.name + "(" +  this.id + ") registered to weather tower.\n";
		try {
			FileManager.writeFile(s);
		}
		catch(IOException e) {

		}
	}

	// private void say(String s) {
		// try {
			// FileManager.writeFile(s);
		// }
		// catch(IOException e) {
// 
		// }
		// System.out.printf("%s%s%s%d%s", "Baloon#", this.name, "(", this.id, ") " );
	}
}