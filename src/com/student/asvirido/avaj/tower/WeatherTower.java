package com.student.asvirido.avaj.tower;

import com.student.asvirido.avaj.tower.Tower;
import com.student.asvirido.avaj.aircraft.factory.Coordinates;
import com.student.asvirido.avaj.aircraft.factory.WeatherProvider;

public class WeatherTower extends Tower {
	private int life;
	
	public WeatherTower() {

	}

	public WeatherTower(int life) {
		this.life = life;
	}

	public String getWeather(Coordinates cord) {
		return (WeatherProvider.getProvider().getCurrentWeather(cord));
	}

	void changeWeather() {
		conditionsChandeg();
	}

	public void runSimulation() {
		while (this.life > 0) {
			changeWeather();
			this.life -= 1;
		}
	}
}