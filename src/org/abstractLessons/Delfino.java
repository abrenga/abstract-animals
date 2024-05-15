package org.abstractLessons;

public class Delfino extends AbstractAnimals implements INuotatore {

	protected Delfino(String nome, int occhi, int zampe) {
		super("mammifero", nome, true, occhi, zampe);

	}

	@Override
	public void verso() {
		System.out.println("fischio");

	}

	@Override
	public void nuota() {
		System.out.println("sono un nuotatore");

	}

}
