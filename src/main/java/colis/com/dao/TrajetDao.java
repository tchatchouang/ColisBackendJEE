package colis.com.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import colis.com.entities.trajets.Trajet;

public interface TrajetDao extends JpaRepository<Trajet, Long> {
}
