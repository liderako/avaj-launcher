package com.student.asvirido.avaj;
import java.io.*;

public class Validation {
	// String[3] typeValid;

	public Validation() {
		// this.typeValid = {"JetPlane", "Helicopter", "Baloon"};
	}

	public void run(String buffer) {
		String resSplit[] = buffer.split("\n", 0);

		checkSmallFile(resSplit.length);
		checkFirstLine(resSplit[0]);
		checkContainer(resSplit);
	}
	private void checkSmallFile(int length) {
		if (length < 2) {
			error("Error: Too small file");
		}
	}
	private void checkFirstLine(String line) {
		if ((line.matches("\\d+")) == false) {
			error("Error: Wrong first line");
		}
		else if (line.length() == 1) {
			if ((line.matches("[0]")) == true) {
				error("Error: small life count");
			}
		}
	}
	private void checkContainer(String buffer[]) {
		String typeValid[] = {"JetPlane", "Helicopter", "Baloon"};

		for (int i = 1; i < buffer.length; i++) {
			String res[] = buffer[i].split(" ");
			if (res.length != 5) {
				error("Error size line");
			}
			for (int k = 0; k < 3; k++) {
				if ((res[0].equals(typeValid[k])) == true) {
					break ;
				}
				if (k == 2) {
					error("Error: wrong type");
				}
			}
			if ((res[1].matches("[A-Z_a-z_0-9]+")) == false) {
				error("Error: wrong name");
			}
			for (int j = 2; j < 5; j++) {
				if ((res[j].matches("[0-9]+")) == false) {
					error("Error: invalid digital in LONGITUDE or LATITUDE or HEIGHT");
				}
			}
		}
	}
	private void error(String messager) {
		System.out.println(messager);
		System.exit(-1);
	}
}