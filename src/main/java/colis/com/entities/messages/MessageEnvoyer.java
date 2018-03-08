package colis.com.entities.messages;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import colis.com.entities.conversations.Conversations;
import colis.com.entities.personnes.Personnes;

@Entity
@DiscriminatorValue("SE")
public class MessageEnvoyer extends Message implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@Temporal(TemporalType.DATE)
	private Date dateEnvoie;
	public MessageEnvoyer() {
		super();
	}
	
	

	public MessageEnvoyer(String cotenueMessage, String etatMessage, Date dateMessage, Conversations conversations,
			Personnes personnes) {
		super(cotenueMessage, etatMessage, dateMessage, conversations, personnes);
		// TODO Auto-generated constructor stub
	}



	public Date getDateEnvoie() {
		return dateEnvoie;
	}
	public void setDateEnvoie(Date dateEnvoie) {
		this.dateEnvoie = dateEnvoie;
	}

	@Override
	public String toString() {
		return "MessageEnvoyer [dateEnvoie=" + dateEnvoie + "]";
	}
	
	
}
