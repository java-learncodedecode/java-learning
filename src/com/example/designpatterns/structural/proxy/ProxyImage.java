package com.example.designpatterns.structural.proxy;

public class ProxyImage implements Image{

	RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		
		if(fileName.endsWith(".java")) {
			if (realImage == null) {
				realImage = new RealImage(fileName);
			}
			realImage.display();	
		}
		
	}
}
