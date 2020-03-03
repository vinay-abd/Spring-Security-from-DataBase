package com.example.demo.Model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.Repository.UserRepository;

public class SimpleUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user=userRepository.findByName(username);
		user.orElseThrow(()->new UsernameNotFoundException("user name not found"));
		user.ifPresent((usr)->{new UserDetails1(usr);});
		return user.map(UserDetails1::new).get();
	}

}
