package net.javaguides.springboot.friends.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.friends.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
