package com.example.demo.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.userdetails.UserDetailsService;

@Entity
@Table(name = "User_Table")
public class User {
	public static final String user = null;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int uId;
	@Column(name = "uname")
	private String name;
	@Column
	private int age;
	@Column
	private String password;
	@OneToMany(mappedBy = "user")
	private List<User_Role> userList = new ArrayList<User_Role>();

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<User_Role> getUserList() {
		return userList;
	}

	public void setUserList(List<User_Role> userList) {
		this.userList = userList;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(User user) {
		this.age = user.getAge();
		this.name = user.getName();
		this.password = user.getPassword();
		this.uId = user.getuId();
		this.userList = user.getUserList();

	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int uId, String name, int age, String password, List<User_Role> userList) {
		super();
		this.uId = uId;
		this.name = name;
		this.age = age;
		this.password = password;
		this.userList = userList;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", name=" + name + ", age=" + age + ", password=" + password + ", userList="
				+ userList + "]";
	}


}
