package colis.com.entities.colisTransporter;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import colis.com.entities.colis.Colis;
import colis.com.entities.personnes.Personnes;

@Embeddable
public class ColisTransporterId implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Personnes personnes;
	
	@ManyToOne
	private Colis colis;

	public ColisTransporterId() {
		super();
	}

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
