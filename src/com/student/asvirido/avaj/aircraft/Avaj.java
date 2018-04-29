package com.student.asvirido.avaj.aircraft;

import com.student.asvirido.avaj.aircraft.*;
import static java.lang.System.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
class Avaj {
	public static void main(String [] args) throws IOException {

		WeatherTower tower = new WeatherTower();

		if (args.length != 1) {
			out.printf("Need one args, filename\n");
			exit(0);
		}
		AircraftFactory factory = new AircraftFactory();
		try {
			System.out.printf(readFile(args[0]));
		}
		catch(IOException e) {
			System.out.printf("Error file\n");
		}
		// Flyable a = null;
		// a = factory.newAircraft("JetPlane", "LGF122", 100, 100, 100);
		// a.registerTower(tower);
		// tower.unregister(a);
	}

	private static String readFile(String filename) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			StringBuilder sb = new StringBuilder();
    		String line = br.readLine();
   		 	
   		 	while (line != null) {
        		sb.append(line);
        		sb.append(System.lineSeparator());
        		line = br.readLine();
    		}
    		String everyThing = sb.toString();
    		br.close();
    		return (everyThing);
		}
		catch(FileNotFoundException e) {
			return ("null");
		}
	}
}
