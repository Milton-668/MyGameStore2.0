package com.mygamestore2.mygamestore2.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mygamestore2.mygamestore2.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

}
