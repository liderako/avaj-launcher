package com.student.asvirido.avaj.aircraft.factory;

import com.student.asvirido.avaj.aircraft.Aircraft;
import com.student.asvirido.avaj.aircraft.Flyable;
import com.student.asvirido.avaj.aircraft.factory.Coordinates;
import com.student.asvirido.avaj.tower.WeatherTower;
import com.student.asvirido.avaj.FileManager;
import java.io.*;
import static java.lang.System.*;

public class JetPlane extends Aircraft implements Flyable {
	private WeatherTower tower;

	JetPlane(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {
		String weather = this.tower.getWeather(this.coordinates);
		int longitude = this.coordinates.getLongitude();
		int latitude = this.coordinates.getLatitude();
		int height = this.coordinates.getHeight();

		if ((weather.equals("snow")) == true ) {
			height -= 7;
			if (height <= 0)
				height = 0;
			String s = "JetPlane#" + this.name + "(" + this.id + ") OMG! Winter is coming!";
			s = s + " Longitude: " + longitude + " Latitude: " + latitude + " Height: " + height + "\n";
			try {
				FileManager.writeFile(s);
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		else if ((weather.equals("rain")) == true ) {
			latitude += 5;
			String s = "JetPlane#" + this.name + "(" + this.id + ") Damn you rain!";
			s = s + " Longitude: " + longitude + " Latitude: " + latitude + " Height: " + height + "\n";
			try {
				FileManager.writeFile(s);
			} catch(IOException e) {
			}
		}
		else if ((weather.equals("sun")) == true ) {
			latitude += 10;
			height += 2;
			if (height >= 100)
				height = 100;
			String s = "JetPlane#" + this.name + "(" + this.id + ") Let's enjoy the good weather and take some pics.";
			s = s + " Longitude: " + longitude + " Latitude: " + latitude + " Height: " + height + "\n";
			try {
				FileManager.writeFile(s);
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		else if ((weather.equals("fog")) == true ) {
			latitude += 1;
			String s = "JetPlane#" + this.name + "(" + this.id + ") Shut fog.";
			s = s + " Longitude: " + longitude + " Latitude: " + latitude + " Height: " + height + "\n";
			try {
				FileManager.writeFile(s);
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		if (height <= 0) {
			height = 0;
			String s = "JetPlane#" + this.name + "(" + this.id + ") " + "landing. Longitude: " + longitude + " Latitude: " + latitude
			+ " Height: " + height + "\n" + "Tower Says: " + "JetPlane#" + this.name + "(" + this.id + ") unregistered from weather tower.\n";
			this.tower.unregister(this);
			try {
				FileManager.writeFile(s);
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
		this.coordinates = new Coordinates(longitude, latitude, height);
	}

	public void registerTower(WeatherTower weatherTower) {
		this.tower = weatherTower;
		this.tower.register(this);
		String s = "Tower Says: " + "JetPlane#" + this.name + "(" +  this.id + ") registered to weather tower.\n";
		try {
			FileManager.writeFile(s);
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}