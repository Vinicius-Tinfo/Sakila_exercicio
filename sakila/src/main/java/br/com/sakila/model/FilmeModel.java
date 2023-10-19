package br.com.sakila.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	@Entity
	@Table(name = "film",schema = "sakila")
	public class FilmeModel implements Serializable{

		 private static final long serialversionUID = 1L;
		 @Id
		 @Column(name = "film_id")
		 private Integer filmeId;
		 @Column(name = "title")
		 private String titulo;
		
		 public Integer getFilmeId() 
		{
			return filmeId;
		}
		public void setFilmeId(Integer filmeId) {
			this.filmeId = filmeId;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}		 
	}

