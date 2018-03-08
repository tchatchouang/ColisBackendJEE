package colis.com.entities.typeColis;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import colis.com.entities.colis.Colis;

@Entity
public class TypeColis implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idTypeColis;
	private String libelleTypeColis;
	
	@ManyToOne
    @JoinColumn(name = "idColis", referencedColumnName="idColis")
	private Colis colis;
	
	public TypeColis(long idTypeColis, String libelleTypeColis) {
		super();
		this.idTypeColis = idTypeColis;
		this.libelleTypeColis = libelleTypeColis;
	}
	@Override
	public String toString() {
		return "TypeColis []";
	}
	public long getIdTypeColis() {
		return idTypeColis;
	}
	public void setIdTypeColis(long idTypeColis) {
		this.idTypeColis = idTypeColis;
	}
	public String getLibelleTypeColis() {
		return libelleTypeColis;
	}
	public void setLibelleTypeColis(String libelleTypeColis) {
		this.libelleTypeColis = libelleTypeColis;
	}
	
}
