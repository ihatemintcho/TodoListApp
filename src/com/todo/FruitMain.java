package com.todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitMain{
	public static void main(String args[]) {
		List<Fruit> fl=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		
		fl.add(new Fruit(1, "Kiwi", 2000));
		fl.add(new Fruit(2, "Banana", 3000));
		fl.add(new Fruit(3, "Grape", 5000));
		fl.add(new Fruit(4, "Pomegranate", 4000));
		fl.add(new Fruit(5, "Cherry", 3000));
		fl.add(new Fruit(6, "Honeydew", 4000));
		fl.add(new Fruit(7, "Watermelon", 2500));
		fl.add(new Fruit(8, "Korean_melon", 3500));
		
		Collections.sort(fl, new FruitComparator());
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for (int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
		
	}
}
