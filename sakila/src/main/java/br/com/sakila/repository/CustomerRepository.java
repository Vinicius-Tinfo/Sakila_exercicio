package br.com.sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sakila.model.CustomerModel;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {

}
