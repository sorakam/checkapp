package com.convinichoosa.business.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "names")
public class Name {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
	
	private String name;
	
	@Column(nullable = false)
	private String store;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
    public String getName() {
	     return name;
	    }
	    
    public void setName(String name) {
	     this.name = name;
	}
	
	public String getStore() {	
		return store;
	}
	
	public void setStore(String store) {
		this.store = store;
	}
}
