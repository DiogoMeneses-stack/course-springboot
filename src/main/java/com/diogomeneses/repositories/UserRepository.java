package com.diogomeneses.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogomeneses.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}