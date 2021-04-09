package com.project.AnimalKingdom.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.AnimalKingdom.model.ComplementInforma;

@Repository
public interface ComplementInformaRepository extends JpaRepository<ComplementInforma, Long> {
    
}
