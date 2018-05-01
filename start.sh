#!/bin/bash
mkdir bin
javac -sourcepath ./src -d bin src/com/student/asvirido/avaj/Avaj.java
java -classpath ./bin com.student.asvirido.avaj.Avaj $1
rm -rf bin