package br.madeinastec.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.madeinastec.domain.Produto;

public interface BookRepository extends CrudRepository<Produto, Long>{
	List<Produto> findByCategory(String category);
	
	List<Produto> findByTitleContaining(String title);
}
