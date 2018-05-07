package com.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
