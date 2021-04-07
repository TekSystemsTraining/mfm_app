package com.mfm_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfm_app.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	User getUserByUsername(String username);
}
