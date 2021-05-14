package com.tiagogomes.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiagogomes.cursomc.domain.Categoria;
import com.tiagogomes.cursomc.repositories.CategoriaRepository;
import java.util.Optional;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
