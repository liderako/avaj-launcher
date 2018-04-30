package com.student.asvirido.avaj;
import java.io.*;

public class Validation {

	public void run(String buffer) {
		String resSplit[] = buffer.split("\n", 0);

		checkSmallFile(resSplit.length);
		checkFristLine(resSplit[0]);
	}
	private void checkSmallFile(int length) {
		if (length < 2) {
			error("Error: Too small file");
		}
	}
	private void checkFristLine(String line) {
		if ((line.matches("\\d+")) == false) {
			error("Error: Wrong first line");
		}
		else if (line.length() == 1) {
			if ((line.matches("[0]")) == true) {
				error("Error: small life count");
			}
		}
	}
	private void error(String messager) {
		System.out.println(messager);
		System.exit(-1);
	}
}