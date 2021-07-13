package com.marciopsh.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marciopsh.cursomc.domain.Categoria;
import com.marciopsh.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer Id) {
		Optional<Categoria> obj = repo.findById(Id);
		return obj.orElse(null);
		
	}
}
