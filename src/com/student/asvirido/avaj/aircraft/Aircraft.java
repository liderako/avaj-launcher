package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.Coordinates;

class Aircraft {
	protected 	long id;
	protected 	String name;
	protected 	Coordinates coordinates;
	private 	long idCounter;

	protected Aircraft(String name, Coordinates coordinates) {
		this.name = name;
		this.coordinates = coordinates;
	}

	private long nextId() {
		this.idCounter += 1;
	}
}