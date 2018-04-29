package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.Coordinates;

public class Aircraft {
	protected 	long id;
	protected 	String name;
	protected 	Coordinates coordinates;
	private 	long idCounter;

	protected Aircraft(String name, Coordinates coordinates) {
		this.name = name;
		this.coordinates = coordinates;
	}

	private long nextId() {
		return (this.idCounter += 1);
		// this.idCounter += 1;
	}
}