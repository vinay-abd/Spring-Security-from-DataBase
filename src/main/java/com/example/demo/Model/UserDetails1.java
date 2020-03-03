package com.example.demo.Model;

import java.util.Collection;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;

public class UserDetails1 extends User implements org.springframework.security.core.userdetails.UserDetails {

	
	public UserDetails1(final User user) {
		super(user);
		// TODO Auto-generated constructor stub
	}

	/*
	 * public UserDetails1(Optional<User> user) { // TODO Auto-generated constructor
	 * stub super.user; }
	 */

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
