package by.htp.florist.run;





import java.util.Date;

import by.htp.florist.entity.Accessory;
import by.htp.florist.entity.Bouquet;
import by.htp.florist.entity.Component;
import by.htp.florist.entity.Flower;
import by.htp.florist.entity.Ribbon;
import by.htp.florist.entity.Synthetic;
import by.htp.florist.entity.Wild;

public class MainApp {
	public static void main(String[] args) {
		
		// Цветочница. Определить иерархию цветов. Создать несколько объек-
		// тов-цветов. Собрать букет (используя аксессуары) с определением его
		// стоимости. Провести сортировку цветов в букете на основе уровня све-
		// жести. Найти цветок в букете, соответствующий заданному диапазону
		// длин стеблей.
		Accessory ribbon = new Ribbon("red", 30, 20);
		@SuppressWarnings("deprecation")
		Flower wild = new Wild("fresh", 40, 20, "red", new Date(18, 2, 20));
		Flower synthetic = new Synthetic("fresh", 11, 20, 5);
		@SuppressWarnings("deprecation")
		Flower wild2 = new Wild("fresh", 12, 21, "green", new Date(20, 4, 18));

		
		
		Bouquet flower = new Bouquet(4);
		flower.addComponent(ribbon);
		flower.addComponent(wild);
		flower.addComponent(synthetic);
		flower.addComponent(wild2);
		
		flower.showBouquet();
		
		flower.priceOfBouquet();
		System.out.println("");
		
		
		
		//Component[] mySortBoquet = flower.sortByLengthOfStem(2, 44);
		//Component mySort = new Component();
		
		
		//mySort.setComponents(mySortBoquet);
		//mySort.showBouquet();
		
		System.out.println("");
		
		//flower.sortBouquet();
		//mySort.showBouquet();
		
	
}
}