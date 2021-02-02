package edu.mim.subsription.repository;

import edu.mim.subsription.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
