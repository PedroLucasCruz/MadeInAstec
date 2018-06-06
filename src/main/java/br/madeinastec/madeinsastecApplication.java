package br.madeinastec;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.madeinastec.domain.User;
import br.madeinastec.domain.security.Role;
import br.madeinastec.domain.security.UserRole;
import br.madeinastec.service.UserService;
import br.madeinastec.utility.SecurityUtility;

@SpringBootApplication
public class madeinsastecApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(madeinsastecApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User usuario = new User();
		usuario.setFirstName("Pedro");
		usuario.setLastName("Lucas");
		usuario.setUsername("PedroLucas");
		usuario.setPassword(SecurityUtility.decodificadorDeSenha().encode("p"));
		usuario.setEmail("pedrocruz6661@gmail.com");
		Set<UserRole> usuarioPapel = new HashSet<>();
		Role papel= new Role();
		papel.setRoleId(1);
		papel.setName("ROLE_USER");
		usuarioPapel.add(new UserRole(usuario, papel));
		
		userService.createUser(usuario, usuarioPapel);
	}
}
