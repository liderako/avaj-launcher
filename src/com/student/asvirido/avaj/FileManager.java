package com.student.asvirido.avaj;
import java.io.*;

public class FileManager {
	private String fileName;
	private static FileWriter writer;

	public FileManager() {
		this.fileName = "simulation.txt";
		try {
			createWriter();
		} catch(IOException e) {
			return ;
		}
	}

	public String readFile(String fileName) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
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
		} catch(FileNotFoundException e) {
			throw new FileNotFoundException();
		}
	}

	public static void writeFile(String line) throws IOException {
		try {
			writer.write(line);
		} catch(IOException ex){
			System.out.println("Error writeFile\n");
			throw new IOException();
		}
	}

	public void closeFile() throws IOException {
		try {
			writer.close();
		} catch(IOException ex){
			System.out.println("Error closeFile\n");
			throw new IOException();
		}
	}

	private void createWriter() throws IOException {
		try {
			writer = new FileWriter(this.fileName, false);
		} catch(IOException e) {
			System.out.println("Error createWriter\n");
			throw new IOException();
		}
	}
}
