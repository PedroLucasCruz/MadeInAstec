package br.madeinastec.service;

import java.util.List;

import br.madeinastec.domain.Book;
import br.madeinastec.domain.CartItem;
import br.madeinastec.domain.Order;
import br.madeinastec.domain.ShoppingCart;
import br.madeinastec.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addBookToCartItem(Book book, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
