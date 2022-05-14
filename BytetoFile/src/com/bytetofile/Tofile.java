package com.bytetofile;

import java.io.*;
import java.nio.file.Files;

public class Tofile {
	public static void toFile(byte[] data, File destination) {
	try(FileOutputStream fos = new FileOutputStream(destination)){
		fos.write(data);
		fos.close();
	}
	catch(Exception e) {
		System.out.println("There is an error");
		}
	}
	public static void main(String[] args) throws IOException {
		String someText = "Sample text for byte array";
		byte[] data = someText.getBytes();
		File destination = new File("test.txt");
		Files.write(destination.toPath(), data);
	}
	
}
