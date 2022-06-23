package com.taskmanager.Springtasks.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.Springtasks.Models.Administrador;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradoresRepo extends CrudRepository<Administrador, Integer> {
    
    
    @Override
    List<Administrador> findAll();

}
