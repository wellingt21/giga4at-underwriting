package org.demo.repository;

import java.util.Optional;
import org.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository<User, Integer> {

	Optional<User> findById(Integer id);
}
