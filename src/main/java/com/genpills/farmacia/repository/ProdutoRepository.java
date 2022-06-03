package com.genpills.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.genpills.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{

	// Encontrar pelo nome
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
	// Encontrar pelo maior preço
	public List <Produto> findByPrecoGreaterThan(@Param("precoMaior") BigDecimal preco);
	
	// Encontrar pelo menor preço
	public List <Produto> findByPrecoLessThan(@Param("precoMenor") BigDecimal preco);
	
	// Encontrar um registro entre um valor e outro
	public List <Produto> findByPrecoBetween(BigDecimal valor1, BigDecimal valor2);
	
	// Encontrar um registro se todas as condições (AND) forem verdadeiras
	public List <Produto> findByNomeAndFabricante(@Param("nome") String nome, @Param("fabricante") String fabricante);
	
	// Encontrar um registro se alguma condição for verdadeira
	public List <Produto> findByNomeOrFabricante(@Param("nome") String nome, @Param("fabricante") String fabricante);
	
	// Busca todos os objetos, procurando uma string que contenha o texto do critério de busca, independente da posição (inicio, meio ou fim)
	public List <Produto> findAllByNomeContaining(String nome);
	
	
}
