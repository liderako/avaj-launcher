package com.student.asvirido.avaj.aircraft.factory;

import com.student.asvirido.avaj.aircraft.factory.Coordinates;
import java.lang.Math;

public class WeatherProvider {
	private static WeatherProvider weatherProvider = new WeatherProvider();
	private String[] weather = {"rain", "fog", "sun", "snow"};
	private static int oldWeather = 0;
	
	private WeatherProvider() {
	}

	public static WeatherProvider getProvider() {
		return (weatherProvider);
	}

	public String getCurrentWeather(Coordinates coordinater) {
		int x = coordinater.getLongitude();
		int n = coordinater.getLatitude();
		int f = coordinater.getHeight();

		int a1 = (int)(Math.random() * x + 15);
		int a2 = (int)(Math.random() * n + 20);
		int a3 = (int)(Math.random() * f + 35);
		return (weather[(a1 + a2 + a3)% 4]);
	}
}