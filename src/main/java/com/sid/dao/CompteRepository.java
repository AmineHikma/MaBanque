package com.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String>{

}
