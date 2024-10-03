package com.neuromotion.neuromotion.controller;

import com.neuromotion.neuromotion.model.entity.Usuario;
import com.neuromotion.neuromotion.model.service.Impl.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class ControllerWS {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("/registro")
    private  String iniciarSecion(@RequestBody String correo, String password){

        String mensaje;
        Usuario usuario = usuarioService.iniciarSecion(correo,password);
            if(usuario.CORREO()== correo && usuario.PASSWORD()== password){
                mensaje="Su registro fue exitoso";
            }else {
                mensaje = "Su usuario o contraseñna no coinciden";
            }
            return mensaje;

    }


}
