package com.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.entities.Users;

public interface UsersRepository extends JpaRepository<Users, String>{

}
