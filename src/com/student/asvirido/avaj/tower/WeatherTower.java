package com.student.asvirido.avaj.tower;

import com.student.asvirido.avaj.tower.Tower;
import com.student.asvirido.avaj.aircraft.factory.Coordinates;

public class WeatherTower extends Tower {

	public String getWeather(Coordinates cord) {
		System.out.printf("getWeather\n");
		return ("return getWeather\n");
	}

	void changeWeather() {
		System.out.printf("changeWeather\n");
	}
}