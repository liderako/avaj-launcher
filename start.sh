#!/bin/bash
javac -sourcepath ./src -d bin src/com/student/asvirido/avaj/aircraft/Avaj.java
java -classpath ./bin com.student.asvirido.avaj.aircraft.Avaj $1