package com.neuromotion.neuromotion.model.service.Impl;

import com.neuromotion.neuromotion.model.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    public Usuario findById(Usuario usuarioId);

    public Usuario ingresarRegistro(Usuario usuario);

    public Usuario iniciarSecion(String correo, String password);
}
