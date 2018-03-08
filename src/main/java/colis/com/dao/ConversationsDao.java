package colis.com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import colis.com.entities.conversations.Conversations;

public interface ConversationsDao extends JpaRepository<Conversations, Long> {

	@Query("select c  from Conversations c where c.personnes1.idPersonne = :id or c.personnes2.idPersonne = :id")
	public List<Conversations>  listConversations(@Param("id")long id);
}
