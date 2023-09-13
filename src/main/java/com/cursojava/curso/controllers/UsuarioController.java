package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value= "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Ken");
        usuario.setApellido("Cordero");
        usuario.setEmail("bryan00mao@gmail.com");
        usuario.setTelefono("936199495");
        return usuario;
    }

    @RequestMapping(value= "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value= "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registrar(usuario);
    }
    @RequestMapping(value= "api/usuario324")
    public Usuario editarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Ken");
        usuario.setApellido("Cordero");
        usuario.setEmail("bryan00mao@gmail.com");
        usuario.setTelefono("936199495");
        return usuario;
    }

    @RequestMapping(value= "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value= "api/usuario454")
    public Usuario buscarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Ken");
        usuario.setApellido("Cordero");
        usuario.setEmail("bryan00mao@gmail.com");
        usuario.setTelefono("936199495");
        return usuario;
    }
}
