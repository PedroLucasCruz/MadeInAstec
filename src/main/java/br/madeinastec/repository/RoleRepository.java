package br.madeinastec.repository;

import org.springframework.data.repository.CrudRepository;

import br.madeinastec.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
