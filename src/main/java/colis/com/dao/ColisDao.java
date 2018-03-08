package colis.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import colis.com.entities.colis.Colis;

public interface ColisDao extends JpaRepository<Colis, Long> {

}
