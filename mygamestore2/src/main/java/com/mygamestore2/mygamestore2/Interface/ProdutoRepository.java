package com.mygamestore2.mygamestore2.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mygamestore2.mygamestore2.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByProdutoContainingIgnoreCase(String produto);
}
