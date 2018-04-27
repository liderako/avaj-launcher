package com.student.asvirido.avaj.tower;

class Tower {
	private observers Flyable; // на UML диаграме показано Flyable* что это?????

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