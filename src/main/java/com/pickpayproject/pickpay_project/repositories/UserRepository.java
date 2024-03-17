package com.pickpayproject.pickpay_project.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pickpayproject.pickpay_project.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findUserByDocument(String document);
	
	Optional<User> findById(Long id);
	
	Optional<User> findUserByDocument(Long id);
}
