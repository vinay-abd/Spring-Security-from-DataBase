package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Roles")
public class User_Role {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int rId;
	@Column
	private String rollName;

	@JoinColumn(name = "user_id")
	private String user;

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getRollName() {
		return rollName;
	}

	public void setRollName(String rollName) {
		this.rollName = rollName;
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public User_Role(int rId, String rollName, String user) {
		super();
		this.rId = rId;
		this.rollName = rollName;
		this.user = user;
	}

	public User_Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User_Role [rId=" + rId + ", rollName=" + rollName + ", user=" + user + "]";
	}

}
