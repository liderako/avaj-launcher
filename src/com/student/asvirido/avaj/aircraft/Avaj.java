package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.*;
import static java.lang.System.*;

class Avaj {
	public static void main(String [] args) {
		if (args.length != 1) {
			out.printf("Need one args, filename\n");
			exit(0);
		}
		AircraftFactory factory = new AircraftFactory();

		Flyable a = null;
		a = factory.newAircraft("JetPlane", "LGF122", 100, 100, 100);
	}
}
