package br.madeinastec.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.madeinastec.domain.Book;
import br.madeinastec.repository.BookRepository;
import br.madeinastec.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	
        public void removeOne(Long id) {
		bookRepository.delete(id);
	}
        
        public Book salvar(Book book) {
		return bookRepository.save(book);
	}
        
	public List<Book> findAll() {
		List<Book> bookList = (List<Book>) bookRepository.findAll();
		List<Book> activeBookList = new ArrayList<>();
		
		for (Book book: bookList) {
			if(book.isActive()) {
				activeBookList.add(book);
			}
		}
		
		return activeBookList;
	}
	
	public Book findOne(Long id) {
		return bookRepository.findOne(id);
	}

	public List<Book> findByCategory(String category){
		List<Book> bookList = bookRepository.findByCategory(category);
		
		List<Book> activeBookList = new ArrayList<>();
		
		for (Book produto: bookList) {
			if(produto.isActive()) {
				activeBookList.add(produto);
			}
		}
		
		return activeBookList;
	}
	
	public List<Book> blurrySearch(String title) {
		List<Book> bookList = bookRepository.findByTitleContaining(title);
List<Book> activeBookList = new ArrayList<>();
		
		for (Book produto: bookList) {
			if(produto.isActive()) {
				activeBookList.add(produto);
			}
		}
		
		return activeBookList;
	}
}
