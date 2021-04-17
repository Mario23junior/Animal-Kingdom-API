package com.project.AnimalKingdom.repositorys.DTORepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.AnimalKingdom.ModelDTO.AnimalDTO;

@Repository
public interface AnimalRepositoryDTO extends JpaRepository<AnimalDTO, Long>{

}
