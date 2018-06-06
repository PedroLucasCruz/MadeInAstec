package br.madeinastec.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.madeinastec.domain.Produto;
import br.madeinastec.repository.BookRepository;
import br.madeinastec.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	
        public void removeOne(Long id) {
		bookRepository.delete(id);
	}
        
        public Produto salvar(Produto book) {
		return bookRepository.save(book);
	}
        
	public List<Produto> findAll() {
		List<Produto> bookList = (List<Produto>) bookRepository.findAll();
		List<Produto> activeBookList = new ArrayList<>();
		
		for (Produto book: bookList) {
			if(book.isActive()) {
				activeBookList.add(book);
			}
		}
		
		return activeBookList;
	}
	
	public Produto findOne(Long id) {
		return bookRepository.findOne(id);
	}

	public List<Produto> findByCategory(String category){
		List<Produto> bookList = bookRepository.findByCategory(category);
		
		List<Produto> activeBookList = new ArrayList<>();
		
		for (Produto produto: bookList) {
			if(produto.isActive()) {
				activeBookList.add(produto);
			}
		}
		
		return activeBookList;
	}
	
	public List<Produto> blurrySearch(String title) {
		List<Produto> bookList = bookRepository.findByTitleContaining(title);
List<Produto> activeBookList = new ArrayList<>();
		
		for (Produto produto: bookList) {
			if(produto.isActive()) {
				activeBookList.add(produto);
			}
		}
		
		return activeBookList;
	}
}
