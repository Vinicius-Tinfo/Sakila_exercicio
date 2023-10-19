package br.com.sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sakila.model.PaisModel;

@Repository
public interface PaisRepository extends JpaRepository<PaisModel, Integer> {

}
