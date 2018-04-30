package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.*;
import com.student.asvirido.avaj.*;
import static java.lang.System.*;
import java.io.*;

class Avaj {
	public static void main(String [] args) throws IOException {
		FileManager managerFile = new FileManager();
		String fileBuffer = null;
		Validation managerValidation = new Validation();

		if (args.length != 1) {
			out.printf("Need one args, fileName\n");
			exit(-1);
		}
		try {
			fileBuffer = managerFile.readFile(args[0]);
		}
		catch(FileNotFoundException e) {
			exit(-1);
		}
		managerValidation.run(fileBuffer);
		managerFile.closeFile();

		// System.out.println("25".matches("\\d+"));
		// writerFile("test", this.filename);
		// WeatherTower tower = new WeatherTower();
		// AircraftFactory factory = new AircraftFactory();
		// Flyable a = null;
		// a = factory.newAircraft("JetPlane", "LGF122", 100, 100, 100);
		// a.registerTower(tower);
		// tower.unregister(a);
	}
}
