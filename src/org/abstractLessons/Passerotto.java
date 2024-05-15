package org.abstractLessons;

public class Passerotto extends AbstractAnimals implements IVolante{

	protected Passerotto(String nome, int occhi, int zampe) {
		super("volatile", nome,false, occhi, zampe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verso() {
		System.out.print("cinguetto");
		
	}



	@Override
	public void vola() {
		System.out.append("volo a piccole altezze");
		
	}

}
