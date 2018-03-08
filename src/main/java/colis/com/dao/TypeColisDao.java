package colis.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import colis.com.entities.typeColis.TypeColis;

public interface TypeColisDao extends JpaRepository<TypeColis, Long> {

}
