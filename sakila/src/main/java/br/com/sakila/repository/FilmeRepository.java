package br.com.sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sakila.model.FilmeModel;
@Repository
public interface FilmeRepository  extends JpaRepository<FilmeModel,Integer>{


	
}
