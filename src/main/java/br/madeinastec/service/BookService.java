package br.madeinastec.service;

import java.util.List;

import br.madeinastec.domain.Produto;

public interface BookService {
    
	List<Produto> findAll ();
	
        Produto salvar(Produto book);
        
	Produto findOne(Long id);
	
	List<Produto> findByCategory(String category);
	
	List<Produto> blurrySearch(String title);
        
        void removeOne(Long id);
}
