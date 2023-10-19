package br.com.sakila.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country", schema = "sakila")
public class PaisModel implements Serializable{
  private static final long serialversionUID = 1L;
  @Id
  @Column(name = "country_id")
  private Integer paisId;
  @Column(name = "country")
  private String nomePais;
  
public Integer getPaisId() {
	return paisId;
}
public void setPaisId(Integer paisId) {
	this.paisId = paisId;
}
public String getNomePais() {
	return nomePais;
}
public void setNomePais(String nomePais) {
	this.nomePais = nomePais;
}
  
  

}
