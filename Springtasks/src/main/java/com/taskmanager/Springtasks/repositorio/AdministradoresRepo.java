package com.taskmanager.Springtasks.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.Springtasks.Models.Administrador;

public interface AdministradoresRepo extends CrudRepository<Administrador, Integer> {
    
}
