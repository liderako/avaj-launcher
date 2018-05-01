package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.Coordinates;

public class Aircraft {
	protected 	long id;
	protected 	String name;
	protected 	Coordinates coordinates;
	private static	long idCounter;

	protected Aircraft(String name, Coordinates coordinates) {
		this.name = name;
		this.coordinates = coordinates;
		this.id = nextId();
	}

	private long nextId() {
		return (this.idCounter += 1);
	}
}