package edu.jbegin.oop.printer;

public class Main {

	public static void main(String[] args) {

		InkPrinter epson = new InkPrinter();

		epson.setCurentPaintVolume(10);
		epson.setAddVolume(5);
		epson.print("Hello World");

	}

}
