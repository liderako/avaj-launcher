package com.student.asvirido.avaj

import com.student.asvirido.avaj.Tower;

class WeatherTower extends Tower {
	public String getWeather(Coordinates cord) {
		System.out.printf("getWeather\n");
		return ("return getWeather\n");
	}

	private void changeWeather(void) {
		System.out.printf("changeWeather\n");
	}
}