/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wsintegrabolao.repository;

import br.com.wsintegrabolao.entity.ClassificacaoDAO;
import java.util.List;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;

/**
 *
 * @author bruno.szczuk
 */
@Cacheable("codetable")
@Async
public interface ClassificacaoRepository extends JpaRepository<ClassificacaoDAO, String>{
    @Query("select c from ClassificacaoDAO c order by cast(pos as int) asc, c.pontosGanhos.qtTotal desc,c.vitoria.qtTotal desc, c.saldoGols desc")
    List findByOrderByCastPosAsc();
}
