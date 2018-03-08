package colis.com.entities.pieceIdentite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import colis.com.entities.personnes.Personnes;

@Entity
public class PieceIdentite implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long   idPiece;
	private String libbellePiece;
	private String photoPiece;
	@ManyToOne
    @JoinColumn(name = "idPersonne", referencedColumnName="idPersonne")
	private Personnes personnes;

	
	public PieceIdentite() {
		super();
	}


	public long getIdPiece() {
		return idPiece;
	}


	public void setIdPiece(long idPiece) {
		this.idPiece = idPiece;
	}


	public String getLibbellePiece() {
		return libbellePiece;
	}


	public void setLibbellePiece(String libbellePiece) {
		this.libbellePiece = libbellePiece;
	}


	public String getPhotoPiece() {
		return photoPiece;
	}


	public void setPhotoPiece(String photoPiece) {
		this.photoPiece = photoPiece;
	}


	public Personnes getPersonnes() {
		return personnes;
	}


	public void setPersonnes(Personnes personnes) {
		this.personnes = personnes;
	}


}
