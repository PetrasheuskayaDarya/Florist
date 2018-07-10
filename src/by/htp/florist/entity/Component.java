package by.htp.florist.entity;

import java.util.Arrays;

public class Component extends Bouquet {

	private int price;

	public Component() {
	}

	public Component(int price) {
		this.price = price;

	}

	public int getPrice() {
		return this.price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Component price=" + price + super.toString();
	}

	

	
	
}
