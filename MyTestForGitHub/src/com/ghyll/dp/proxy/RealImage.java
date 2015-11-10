
package com.ghyll.dp.proxy;

public class RealImage implements Image {

	private String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("real display");
		System.out.println("Displaying RealImage " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading RealImage " + fileName);
	}

}
