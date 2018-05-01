package com.student.asvirido.avaj;

import com.student.asvirido.avaj.aircraft.*;
import com.student.asvirido.avaj.aircraft.factory.*;
import com.student.asvirido.avaj.*;
import com.student.asvirido.avaj.tower.*;
import static java.lang.System.*;
import java.io.*;

class Avaj {
	
	public static void main(String [] args) throws IOException {
		FileManager managerFile = new FileManager();
		String fileBuffer = null;
		ValidationManager managerValidation = new ValidationManager();
		ConvertManager managerConvert;

		if (args.length != 1) {
			out.printf("Need one args, fileName\n");
			exit(-1);
		}
		try {
			fileBuffer = managerFile.readFile(args[0]);
		}
		catch(FileNotFoundException e) {
			out.println("FileNotFoundException");
			exit(-1);
		}
		managerValidation.run(fileBuffer);
		managerConvert = new ConvertManager(fileBuffer);
		WeatherTower tower = new WeatherTower(managerConvert.getLife());
		AircraftFactory factory = new AircraftFactory();
		Flyable a = null;
		
		for (int i = 1; i < managerConvert.length(); i++) {
			managerConvert.nextLine();
			a = factory.newAircraft(managerConvert.getTypeLine(), managerConvert.getNameLine(), managerConvert.getLongitudeLine(), managerConvert.getLatitudeLine(), managerConvert.getHeightLine());
			a.registerTower(tower);
		}
		tower.runSimulation();
		managerFile.closeFile();
	}
}
