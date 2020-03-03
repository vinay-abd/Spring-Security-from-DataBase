package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.User;

public interface UserRepository extends JpaRepository<User,Integer>
{

	Optional<User> findByName(String username);
	
}
