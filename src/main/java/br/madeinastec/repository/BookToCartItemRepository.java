package br.madeinastec.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import br.madeinastec.domain.ProdutoItemCarrinho;
import br.madeinastec.domain.CartItem;

@Transactional
public interface BookToCartItemRepository extends CrudRepository<ProdutoItemCarrinho, Long> {
	void deleteByCartItem(CartItem cartItem);
}
