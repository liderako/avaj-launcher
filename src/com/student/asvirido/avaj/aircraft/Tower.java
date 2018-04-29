package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.Flyable;
import java.util.ArrayList;
public class Tower {
	private ArrayList<Flyable> observers = new ArrayList<Flyable>();
	
	public void register(Flyable flyable) {
		observers.add(flyable);
		System.out.printf("register tower\n");
	}

	public void unregister(Flyable flyable) {
		observers.remove(flyable);
		System.out.printf("unregister tower\n");
	}

	protected void conditionsChandeg() {
		System.out.printf("conditionsChandeg\n");
	}	
}