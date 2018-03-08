package colis.com.entities.colisTransporter;

import colis.com.entities.colis.Colis;
import colis.com.entities.personnes.Personnes;

public class ColisTransporterContext {

	private Personnes personnes;
	
	private Colis colis;
	
	public Personnes getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Personnes personnes) {
		this.personnes = personnes;
	}

	public Colis getColis() {
		return colis;
	}

	public void setColis(Colis colis) {
		this.colis = colis;
	}
}
