package com.project.AnimalKingdom.repositorys.DTORepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalDTO extends JpaRepository<AnimalDTO, Long>{

}
