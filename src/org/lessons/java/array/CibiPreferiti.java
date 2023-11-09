package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		//array di cibi preferiti
		String foods[] = {"pizza", "pasta", "minestrone", "patatine", "sushi", "bistecche"};
		
		//stampo la lunghezza della classifica
		System.out.println("La classifica contiene " + foods.length + " elementi");
		
		//stampo il cibo al primo posto nella lista (cibo preferito)
		System.out.println("Il tuo cibo preferito è: " + foods[0]);
		
		//stampo il cibo all'ultimo posto nella lista (cibo preferito ma non troppo)
		System.out.println("All'ultimo posto della classifica c'è: " + foods[foods.length - 1]);
		
		//stampo il cibo/i cibi in mezzo alla classifica
		int avg = foods.length / 2;
		
		System.out.println("Al centro c'è: " + foods[avg]);
		
		

	}

}
