package com.neuromotion.neuromotion.model.service.Impl;

import com.neuromotion.neuromotion.model.dao.IUsuarioDao;
import com.neuromotion.neuromotion.model.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl  implements IUsuarioService {

    @Autowired
    public IUsuarioDao usuarioDao;


    @Override
    public Usuario findById(Usuario usuarioId) {
        return usuarioDao.save(usuarioId);
    }

    @Override
    public Usuario ingresarRegistro(Usuario usuario) {
        return usuarioDao.save(usuario) ;
    }

    @Override
    @Transactional
    public Usuario iniciarSecion(String correo, String password) {
        return usuarioDao.findByCorreoAndPassword(correo, password)
                .orElseThrow(() -> new RuntimeException("Usuario o contraseña incorrectos"));
    }
}
