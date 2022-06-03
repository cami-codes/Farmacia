package com.genpills.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.genpills.farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

	public List <Categoria> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);
}
