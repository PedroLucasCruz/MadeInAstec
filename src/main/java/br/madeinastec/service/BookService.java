package br.madeinastec.service;

import java.util.List;

import br.madeinastec.domain.Book;

public interface BookService {
    
	List<Book> findAll ();
	
        Book salvar(Book book);
        
	Book findOne(Long id);
	
	List<Book> findByCategory(String category);
	
	List<Book> blurrySearch(String title);
        
        void removeOne(Long id);
}
