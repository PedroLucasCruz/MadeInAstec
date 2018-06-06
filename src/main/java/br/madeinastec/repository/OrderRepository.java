package br.madeinastec.repository;

import org.springframework.data.repository.CrudRepository;

import br.madeinastec.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
