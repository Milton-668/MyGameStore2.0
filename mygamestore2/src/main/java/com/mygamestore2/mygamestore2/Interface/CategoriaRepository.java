package com.mygamestore2.mygamestore2.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mygamestore2.mygamestore2.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}
