
package com.ghyll.dp.proxy;

public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		System.out.println("proxy display");
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}
