package net.javaguides.springboot.friends;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.friends.model.User;
import net.javaguides.springboot.friends.repository.UserRepository;

@SpringBootApplication
public class FriendListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FriendListApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String...args) throws Exception {
		this.userRepository.save(new User("Samuel", "Levi", "Psychology", "00/00/0000", "(31)99999-9999"));
		this.userRepository.save(new User("Lucas", "Simplício", "Information Systems", "00/00/0000", "(31)99999-9999"));
		this.userRepository.save(new User("Lucas", "Simplício", "Information Systems", "00/00/0000", "(31)99999-9999"));
		this.userRepository.save(new User("Lucas", "Simplício", "Information Systems", "00/00/0000", "(31)99999-9999"));
		this.userRepository.save(new User("Lucas", "Simplício", "Information Systems", "00/00/0000", "(31)99999-9999"));
	}
}