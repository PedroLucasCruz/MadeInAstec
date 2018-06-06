package br.madeinastec.repository;

import org.springframework.data.repository.CrudRepository;

import br.madeinastec.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);	
	User findByEmail(String email);
}
