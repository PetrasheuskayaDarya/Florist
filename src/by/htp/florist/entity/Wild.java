package by.htp.florist.entity;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Wild extends Flower {

	private String color;
	private Date dateCut;

	public Wild() {
		super();
	}

	public Wild(String freshness, int lengthOfStem, int price, String color, Date dateCut) {

		super(freshness, lengthOfStem, price);
		this.color = color;
		this.dateCut = dateCut;

	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getDateCut() {
		return dateCut;
	}

	public void setDateCut(Date dateCut) {
		this.dateCut = dateCut;
	}

	@Override
	public String toString() {
		return "Wild " + super.toString()+ ", color=" + color + ", dateCut = " +new SimpleDateFormat("dd.MM.yy").format(dateCut) + "]";
	}



}