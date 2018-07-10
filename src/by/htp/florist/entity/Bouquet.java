package by.htp.florist.entity;

import java.util.Arrays;


public class Bouquet {
	
    private Component[] components;
    
    private int q = 0;
    private int size;
    
    public Bouquet() {
    	
    }
    
    public Bouquet(int size) {
    	components = new Component[size];
    	this.size = size;
    }
    
    public Component[] getBoquet() {
    	return components;
    }
	
	public Component[] getComponents() {
		return components;
	}

	public void setComponents(Component[] components) {
		this.components = components;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
//	public Component getItem(int i) {
//		return components[i];
//	}


	@Override
	public String toString() {
		return "";
	}

	public void priceOfBouquet() {
		
		int j = 0;
		for (int i = 0; i < components.length; i++) {
			j += components[i].getPrice();
		}
		System.out.println(j +"$");//return j вместо sysout 
	}

	public void showBouquet() {
		for (int i = 0; i < components.length; i++) {
			System.out.print(components[i] + "\n");
		}
		System.out.println();
	}
	
	public Component[] sortByLengthOfStem( int from, int to) {
		
		Component[] findFlower = new Component[components.length];
		int j =0;
		for (int i =0; i <components.length; i++) {
			if(components[i] instanceof Flower) {
				if(((Flower) components[i]).getLengthOfStem() > from && ((Flower) components[i]).getLengthOfStem()< to ){
					findFlower[j] = components[i];
					j++;	
				}
			}
		}
		return findFlower;
	}
	
public void addComponent(Component name) {
	if (q < components.length)
		components[q] = (Component) name;
	q++;

}

public void sortBouquet() {
	for (int i = 0; i < components.length; i++) {
		for (int j = i + 1; j < components.length; j++) {
			if (components[j].getClass().equals(Wild.class) && components[i].getClass().equals(Wild.class)) {

				if (((Wild) components[j]).getDateCut().compareTo(((Wild) components[i]).getDateCut()) < 0) {

					Component[] tmp = new Component[1];
					tmp[0] = components[i];
					components[i] = components[j];
					components[j] = tmp[0];
				}
			}
		}
	}
}
}



