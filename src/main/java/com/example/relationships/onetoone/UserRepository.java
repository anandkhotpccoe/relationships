package com.example.relationships.onetoone;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
	

	@Query("SELECT id from User")
	List<Integer>  listids();

}
