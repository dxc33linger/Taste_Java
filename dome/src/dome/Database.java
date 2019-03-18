package dome;

import java.util.ArrayList;

public class Database {

	private ArrayList<Item> items = new ArrayList<Item>();

	public void add(Item i) {
		items.add(i);
	}

	public void list() {
		for (Item i : items) {
			i.print();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Database db = new Database();
		db.add(new CD("OWL CITY", 7));
		db.add(new DVD("Avatar", "James Cameron"));
		db.add(new DVD("The wandering Earth", "Guo"));
		db.list();

		// Polymor		
		CD cd = new CD("OWL CITY", 7);
		db.add(cd);
		Item i = cd; //upcast
//		cd = i; //incorrect		
//		cd = (CD)i; //forcing downcast
		
		i.print(); // call the print() in CD.java, not in Item.java
		System.out.println(cd.getNoT()); //correct
//		System.out.println(i.getNoT()); //incorrect
		
		

		
		
		
	}

}
