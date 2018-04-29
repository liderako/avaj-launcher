package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.Flyable;
import java.util.ArrayList;
public class Tower {
	private ArrayList<Flyable> observers = new ArrayList<Flyable>();
	
	public void register(Flyable flyable) {
		System.out.printf("register\n");
	}

	public void unregister(Flyable flyable) {
		System.out.printf("unregister\n");
	}

	protected void conditionsChandeg() {
		System.out.printf("conditionsChandeg\n");
	}	
}