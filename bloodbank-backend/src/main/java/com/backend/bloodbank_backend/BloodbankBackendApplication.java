package com.backend.bloodbank_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.backend.bloodbank_backend.model.User;
import com.backend.bloodbank_backend.repository.UserRepository;

@SpringBootApplication
public class BloodbankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodbankBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository, PasswordEncoder encoder) {
		return args -> {
			userRepository.findByUsername("admin").ifPresentOrElse(user -> {
				// Always update password to 'admin' (encoded)
				user.setPassword(encoder.encode("admin"));
				userRepository.save(user);
			}, () -> {
				// Create admin if not exists
				User user = new User();
				user.setUsername("admin");
				user.setPassword(encoder.encode("admin"));
				user.setRole("ROLE_ADMIN");
				userRepository.save(user);
			});
		};
	}
}
