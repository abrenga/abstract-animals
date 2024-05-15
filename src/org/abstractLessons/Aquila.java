package org.abstractLessons;

public class Aquila extends AbstractAnimals implements IVolante {

	protected Aquila(String nome, int occhi, int zampe) {
		super("volatile", nome, true, occhi, zampe);

	}

	@Override
	public void verso() {
		System.out.print("strido");

	}

	@Override
	public void vola() {
		System.out.print("volo");

	}

}