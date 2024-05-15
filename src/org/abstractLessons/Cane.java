package org.abstractLessons;

public class Cane extends AbstractAnimals {

	protected Cane(String nome, int occhi, int zampe) {
		super("mammifero", nome, true, occhi, zampe);

	}


	@Override
	public void verso() {
		System.out.println("Abbaio");

	}


}
