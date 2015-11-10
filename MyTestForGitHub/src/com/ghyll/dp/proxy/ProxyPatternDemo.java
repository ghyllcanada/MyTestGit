
package com.ghyll.dp.proxy;

public class ProxyPatternDemo {
	
	public static void main(String[] args) {
		Image image = new ProxyImage("proxy.jpg");

		// image will be loaded from disk
		image.display();
		
		System.out.println("");

		// image will not be loaded from disk
		image.display();
	}
	
	
}
