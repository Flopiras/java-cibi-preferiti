package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		
		String foods[] = {"pizza", "pasta", "minestrone", "patatine", "sushi"};
		
		System.out.println("La classifica contiene " + foods.length + " elementi");
		
		System.out.println("Il tuo cibo preferito è: " + foods[0]);
		
		System.out.println("All'ultimo posto della classifica c'è: " + foods[foods.length - 1]);
		
		

	}

}
