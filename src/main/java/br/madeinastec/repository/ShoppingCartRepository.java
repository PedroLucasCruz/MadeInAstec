package br.madeinastec.repository;

import org.springframework.data.repository.CrudRepository;

import br.madeinastec.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
