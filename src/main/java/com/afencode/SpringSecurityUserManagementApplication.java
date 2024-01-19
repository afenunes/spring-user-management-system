package com.afencode;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.afencode.model.ApplicationUser;
import com.afencode.model.Role;
import com.afencode.repository.RoleRepository;
import com.afencode.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityUserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityUserManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner run(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			// TODO: Replace this with a database script to insert all needed roles in the database
			if(roleRepository.findByAuthority("ADMIN").isPresent()) return;
			
			Role adminRole = roleRepository.save(new Role("ADMIN"));
			roleRepository.save(new Role("USER"));

			Set<Role> roles = new HashSet<>();
			roles.add(adminRole);

			ApplicationUser admin = new ApplicationUser(1, "admin", passwordEncoder.encode("password"), roles);

			userRepository.save(admin);
		};

	}

}
