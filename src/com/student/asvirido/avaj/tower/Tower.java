package com.student.asvirido.avaj.tower;

import com.student.asvirido.avaj.aircraft.Flyable;
import java.util.ArrayList;

public class Tower {
	private static ArrayList<Flyable> observers = new ArrayList<Flyable>();
	
	public void register(Flyable flyable) {
		observers.add(flyable);
	}

	public void unregister(Flyable flyable) {
		observers.remove(flyable);
	}

	protected void conditionsChandeg() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).updateConditions();
		}
 	}	
}