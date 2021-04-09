package com.project.AnimalKingdom.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.AnimalKingdom.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
