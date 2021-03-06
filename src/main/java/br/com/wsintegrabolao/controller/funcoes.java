/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.controller;

import br.com.wsintegrabolao.entity.Equipe;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.wsintegrabolao.repository.EquipeRepository;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.com.wsintegrabolao.repository.ClassificacaoRepository;
import br.com.wsintegrabolao.repository.UsuarioRepository;

/**
 *
 * @author bruno.szczuk
 */
@RestController
@RequestMapping(value = "/funcoes")
@CrossOrigin(origins = "http://localhost:3000")
public class funcoes {

    @Autowired
    private EquipeRepository equipeRepository;
    @Autowired
    private ClassificacaoRepository classificacaoRepositorty;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/equipeList")
    @Produces({"application/json"})
    public ResponseEntity<List<Equipe>> listar() {
        ArrayList lista = new ArrayList();
        equipeRepository.findAll(Sort.by(Sort.Direction.ASC, "sgEquipe")).forEach((i) -> {
            lista.add(i);
        });
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping(value = "/equipe/{id}")
    @Produces({"application/json"})
    public ResponseEntity<Object> get(@PathVariable("id") String codigo) {
        return genericResponse(equipeRepository.findByCdEquipe(codigo));
    }

    @GetMapping(value = "/classificacao")
    @Produces({"application/json"})
    public ResponseEntity<List<ClassificacaoRepository>> listarClassificacao() {
        ArrayList lista = new ArrayList();
        classificacaoRepositorty.findByOrderByCastPosAsc().forEach((i) -> {
            lista.add(i);
        });
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping(value = "/usuario/{id}")
    @Produces({"application/json"})
    public ResponseEntity<Object> getUsuario(@PathVariable("id") String codigo) {
        return genericResponse(usuarioRepository.findByCdUsuario(codigo));
    }

    private static ResponseEntity<Object> genericResponse(Object ob) {
        if (ob == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ob, HttpStatus.OK);
    }
}
