package org.abstractLessons;

public abstract class AbstractAnimals implements IAnimals {

	private String categoria;
	private String nome;
	private int zampe;
	private int occhi;
	private Boolean carnivoro;

	protected AbstractAnimals(String categoria, String nome, Boolean carnivoro, int occhi, int zampe) {
		this.categoria = categoria;
		this.nome = nome;
		this.carnivoro = carnivoro;
		this.occhi = occhi;
		this.zampe = zampe;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getZampe() {
		return zampe;
	}

	public void setZampe(int zampe) {
		this.zampe = zampe;
	}

	public int getOcchi() {
		return occhi;
	}

	public void setOcchi(int occhi) {
		this.occhi = occhi;
	}

	public Boolean getCarnivoro() {
		return carnivoro;
	}

	public void setCarnivoro(Boolean carnivoro) {
		this.carnivoro = carnivoro;
	}

	@Override
	public void mangia() {
		if (carnivoro) {
			System.out.println("mangio prevalemntemente carne");
		} else {
			System.out.println("mangio prevalemntemente verdura");
		}
	}

	@Override
	public void dormi() {
		System.out.println("Zzzzz");

	}

}
