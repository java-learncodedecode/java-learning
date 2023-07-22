package com.dev.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Product {
	private int productId;
	private String category;
	private double price;

	public Product(int productId, String category, double price) {
		this.productId = productId;
		this.category = category;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}
}
