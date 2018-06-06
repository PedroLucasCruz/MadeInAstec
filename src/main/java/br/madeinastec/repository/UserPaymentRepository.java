package br.madeinastec.repository;

import org.springframework.data.repository.CrudRepository;

import br.madeinastec.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}
