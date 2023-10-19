package br.com.sakila.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actor",schema = "sakila")
public class ActorModel implements Serializable{

	 private static final long serialversionUID = 1L;
	 @Id
	 @Column(name = "Actor_id")
	 private Integer actorId;
	 @Column(name = "first_name")
	 private String firstName;
	 @Column(name = "last_name")
	 private String lastName;
	 @Column(name = "last_update")
	 private Date LastUpdate;
	 
	public Integer getActorId() {
		return actorId;
	}
	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getLastUpdate() {
		return LastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		LastUpdate = lastUpdate;
	}
	
}
