/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.repository;

import br.com.wsintegrabolao.entity.UsuarioDAO;
import java.util.List;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bruno.szczuk
 */
@Cacheable("codetable")
public interface UsuarioRepository extends JpaRepository<UsuarioDAO, String> {

   UsuarioDAO findByCdUsuario(String cdUsuario);
}
