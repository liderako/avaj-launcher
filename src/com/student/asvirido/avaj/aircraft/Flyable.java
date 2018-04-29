package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.WeatherTower;

public interface Flyable {
	void updateConditions();
	void registerTower(WeatherTower weatherTower);
}