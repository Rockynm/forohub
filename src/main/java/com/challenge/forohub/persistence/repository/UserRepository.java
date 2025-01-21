package com.challenge.forohub.persistence.repository;

import com.challenge.forohub.persistence.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByUsernameIgnoreCase(String username);
}
