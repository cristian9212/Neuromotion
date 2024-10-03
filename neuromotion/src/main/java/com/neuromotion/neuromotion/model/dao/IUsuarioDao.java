package com.neuromotion.neuromotion.model.dao;

import com.neuromotion.neuromotion.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsuarioDao extends CrudRepository<Usuario,Integer> {
    public Optional<Usuario> findByCorreoAndPassword(String correo, String password);
}
