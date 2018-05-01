package com.student.asvirido.avaj;
import java.io.*;

public class ConvertManager {
	
	private String[] 	maps;
	private int 		life;
	private String[] 	line;
	private int 		countLine;

	public ConvertManager(String maps) {
		this.countLine = 1;
		this.maps = maps.split("\n", 0);
		this.life = Integer.parseInt(this.maps[0]);
	//	this.line = this.maps[1].split(" ", 0);
	}

	public int getLife() {
		return (this.life);
	}

	public int length() {
		return this.maps.length;
	}

	public void nextLine() {
		this.line = this.maps[this.countLine].split(" ", 0);
		this.countLine += 1;
	}

	public String getTypeLine() {
		return (this.line[0]);
	}

	public String getNameLine() {
		return (this.line[1]);
	}

	public int getLongitudeLine() {
		return (Integer.parseInt(this.line[2]));
	}
	public int getLatitudeLine() {
		return (Integer.parseInt(this.line[3]));
	}
	public int getHeightLine() {
		int res = Integer.parseInt(this.line[4]);
		if (res > 100)
			res = 100;
		return (res);
	}
}