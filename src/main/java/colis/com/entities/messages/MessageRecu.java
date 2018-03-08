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
@DiscriminatorValue("RE")
public class MessageRecu extends Message implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.DATE)
	private Date dateReception;
	public MessageRecu() {
		super();
	}
	

	public MessageRecu(String cotenueMessage, String etatMessage, Date dateMessage, Conversations conversations,
			Personnes personnes) {
		super(cotenueMessage, etatMessage, dateMessage, conversations, personnes);
		// TODO Auto-generated constructor stub
	}


	public Date getDateReception() {
		return dateReception;
	}
	public void setDateReception(Date dateReception) {
		this.dateReception = dateReception;
	}
	
}
