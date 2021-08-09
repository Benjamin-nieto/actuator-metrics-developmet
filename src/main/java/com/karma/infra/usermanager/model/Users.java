package com.karma.infra.usermanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Cargo")
	private String cargo;

	@Column(name = "Password")
	private String password;

	public Users() {

	}

	public Users(String name, String cargo, String password) {
		this.name = name;
		this.cargo = cargo;
		this.password = password;
	}

	public long getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
    public String getCargo(){
    	return this.cargo;
    }
	public String getPassword(){
		return this.password;
	}
	public void setId(long id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	public void setPassword(String password){
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + this.id + ", name=" + this.name + ", cargo=" + this.cargo + ", passw=" + this.password + "]";
	}
}
