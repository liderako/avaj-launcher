package com.student.asvirido.avaj;

import com.student.asvirido.avaj.WeatherTower;

public interface Flyable {
	void updateConditions();
	void registerTower(WeatherTower weatherTower);
}