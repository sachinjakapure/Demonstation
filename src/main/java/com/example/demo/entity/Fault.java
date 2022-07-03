package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fault {
    @Id
	Long ID;
   
	String faultnumber;
	String description;
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getFaultnumber() {
		return faultnumber;
	}
	public void setFaultnumber(String faultnumber) {
		this.faultnumber = faultnumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
