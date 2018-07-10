package by.htp.florist.entity;

public class Synthetic extends Flower {

	private int size;

	public Synthetic() {
	}

	public Synthetic(String freshness, int lengthOfStem, int price, int size) {

		super(freshness, lengthOfStem, price);
		this.size = size;

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Synthetic [size=" + size + super.toString() + "]";
	}

}