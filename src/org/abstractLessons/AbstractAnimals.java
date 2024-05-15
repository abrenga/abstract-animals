package org.abstractLessons;

public abstract class AbstractAnimals implements IAnimals {
	
	private String categoria;
	private String zampe;
	private String occhi;
	private Boolean coda;
	private Boolean ali;
	private Boolean carnivoro;
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getZampe() {
		return zampe;
	}
	public void setZampe(String zampe) {
		this.zampe = zampe;
	}
	public String getOcchi() {
		return occhi;
	}
	public void setOcchi(String occhi) {
		this.occhi = occhi;
	}
	public Boolean getCoda() {
		return coda;
	}
	public void setCoda(Boolean coda) {
		this.coda = coda;
	}
	public Boolean getAli() {
		return ali;
	}
	public Boolean getCarnivoro() {
		return carnivoro;
	}
	public void setCarnivoro(Boolean carnivoro) {
		this.carnivoro = carnivoro;
	}
	public void setAli(Boolean ali) {
		this.ali = ali;
	}
	
	
	
	
	
	

}
