package colis.com.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import colis.com.entities.personnes.Personnes;
import colis.com.entities.proposerTrajet.ProposerTrajet;

public interface ProposerTrajetDao extends JpaRepository<ProposerTrajet, Long> {
	
	
	
	
	//@Query("select pt from ProposerTrajet pt where pt.personnes.idPersonne = :x")
	//public Page<ProposerTrajet> search(@Param("x")String pers, Pageable pageable);
	
	//@Query("select pt from ProposerTrajet pt where pt.personnes.idPersonne = ?1")
	//Page<ProposerTrajet> findCourseSessionByPersonnes(long idPersonne, Pageable pageable);
}
