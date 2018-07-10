package by.htp.florist.entity;

public class Ribbon extends Accessory {

	private int length;

	public Ribbon() {
	}

	public Ribbon(String color, int price, int length) {

		super(color, price);
		this.length = length;

	}
	

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return this.length;
	}

	@Override
	public String toString() {
		return "Ribbon - Accessory length=" + length + super.toString();
	}

}