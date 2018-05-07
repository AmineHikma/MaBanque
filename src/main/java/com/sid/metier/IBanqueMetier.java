package com.sid.metier;

import org.springframework.data.domain.Page;

import com.sid.entities.Compte;
import com.sid.entities.Operation;

public interface IBanqueMetier {
public Compte consulterCompte(String codeCpte);
public void verser(String codeCpte,double montant);
public void retirer(String codeCpte,double montant);
public void virement(String codeCpte1,String codeCpte,double montant);
public Page<Operation> listOperation(String codeCpte,int page,int size);

}
