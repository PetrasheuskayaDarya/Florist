package by.htp.florist.entity;

public class Accessory extends Component {

	private String color;

	public Accessory() {
	}

	public Accessory(String color, int price) {
		super(price);
		this.color = color;

	}

	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return "color=" + color + super.toString();
	}

}